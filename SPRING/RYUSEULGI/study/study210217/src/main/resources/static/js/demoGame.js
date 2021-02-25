const demoGame = new Vue({
    // dom 객체 선택
    el: '#game',
    
    // 활용할 데이터 객체
    // vue로 작성 할 떄는 data 메소드로 데이터를 정의하고 
    // 각 컴포넌트를 해당 속성에 데이터를 바인딩 하기
    data: {
        monsters:[
            { id: 1, monsterName: '슬라임', hp: 10, status: 'Default' },
            { id: 2, monsterName: '고블린', hp: 30, status: 'Default' },
            { id: 3, monsterName: '드래곤', hp: 5000, status: 'Default' }
        ],
        monBook:[
            { monsterName: '슬라임', exp: 1, hp: 10, sprMoney: 10 },
            { monsterName: '고블린', exp: 2, hp: 20, sprMoney: 20 },
            { monsterName: '빨간 슬라임', exp: 5, hp: 10, sprMoney: 40 },
            { monsterName: '구울', exp: 10, hp: 50, sprMoney: 100},
            { monsterName: '해골 병사', exp: 20, hp: 100, sprMoney: 200 },
            { monsterName: '해골 궁수', exp: 20, hp: 70, sprMoney: 200 },
            { monsterName: '해골 기사', exp: 50, hp: 400, sprMoney: 500 },
            { monsterName: '고스트', exp: 100, hp: 1000, sprMoney: 700 },
            { monsterName: '듀라한', exp: 200, hp: 4000, sprMoney: 1000 },
            { monsterName: '리치', exp: 500, hp: 10000, sprMoney: 2000 },
            { monsterName: '리치킹', exp: 3000, hp: 100000, sprMoney: 10000 },
            { monsterName: '베히모스', exp: 2000, hp: 80000, sprMoney: 5000 },
            { monsterName: '베히모스킹', exp: 25000, hp: 800000, sprMoney: 50000 },
            { monsterName: '드래곤', exp: 100000, hp: 10000000, sprMoney: 100000 },
        ],
        itemBook:[
            { itemName: 'HP Potion I', price: 50, effect: { desc: "20 hp recover", hp: 20, amount: 200 } },
            { itemName: 'HP Potion II', price: 200, effect: { desc: "100 hp recover", hp: 100, amount: 200 } },
            { itemName: 'HP Potion III', price: 600, effect: { desc: "400 hp recover", hp: 400, amount: 200 } },
            { itemName: 'HP Potion IV', price: 1200, effect: { desc: "800hp recover", hp: 800, amount: 200 } },
            { itemName: 'HP Potion V', price: 2000, effect: { desc: "1200hp recover", hp: 1200, amount: 200 } },
            { itemName: 'Sword', price: 3000, effect: { desc: "weapon", atk: 100 } },
            { itemName: 'Iron Sword', price: 10000, effect: { desc: "weapon", atk: 200 } }
        ],
        characterName : '',
        characterLv : 1,
        characterStatus : '',
        characterHp : 100,
        characterAtk : 10,
        characterDef : 3,
        onlyCalcDef : 1,
        cash : 0,
        curExp : 0,
        needExp : 10,
        monsterName : '',
        shopList : [],
        shopListValue : [],
        shopView : false,
        inventoryView : false,
        inventory : [],
        inventoryList : []
    },

    // 메소드들
    methods: {
        addMonster() {
            const lenMax = this.monBook.length;
            const idx = Math.floor(Math.random() * lenMax);
            // a, b 크기 비교
            const max = this.monsters.reduce((a,b) => {
                return a > b.id ? a: b.id
            }, 0);

            // 새로 추가된 몬스터의 value 정의
            this.monsters.push({
                id : max + 1,
                monsterName : this.monBook[idx].monsterName,
                hp : this.monBook[idx].hp,
                status : 'Default'
            });
        },
        add100Monster(){
            for(let i = 0; i < 100; i++){
                this.addMonster();
            }
        },
        skill(){
            for(let i = 0; i < this.monsters.length; i++){
                // 1.5배 공격강화되게 하기
                this.monsters[i].hp = parseInt(this.monsters[i].hp - this.characterAtk * 1.5);

                if(this.monsters[i].hp > 0){
                    this.monsters[i].status = 'Stun';
                }
            }
        },
        doRemove(idx){
            this.monsters.splice(idx, 1);
        },
        doAttack(idx){
            this.monsters[idx].hp -= this.characterAtk;
        },
        shuffleShopList(){
            if(!this.shopView){
                this.shopListValue = [];
            }

            for(let i = 0; i < 10; i++){
                const randIdx = Math.floor(Math.random() * this.itemBook.length);
                this.shopList[i] = this.itemBook[randIdx];
            }
        },
        calcBuy(){
            let tmpSum = 0;

            for(let i = 0; i < this.shopListValue.length; i++){
                for(let j = 0; j < this.shopList.length; j++){
                    if(this.shopListValue[i] == j){
                        tmpSum += this.shopList[j].price;
                        break;
                    }
                }
            }

            if(this.cash - tmpSum >= 0){
                this.cash -= tmpSum;

                for(let i = 0; i < this.shopListValue.length; i++){
                    this.inventory.push({
                        itemName : this.shopList[this.shopListValue[i]].itemName,
                        effect : this.shopList[this.shopListValue[i]].effect
                    });
                }
                console.log(this.inventory);
            } else {
                alert("캐쉬가 부족하여 구매 할 수 없습니다.");
            }
        },
        useItem(){
            for(let i = 0; i < this.inventory.length; i++){
                for(let j = 0; j < this.itemBook.length; j++){
                    if(this.inventory[i].itemName == this.itemBook[j].itemName){
                        if(this.itemBook[j].effect.desc = "weapon"){
                            this.characterAtk += this.itemBook[j].effect.atk;
                        } else {
                            this.characterHp += this.itemBook[j].effect.hp;
                        }
                    }
                }
                this.inventory.splice(i, 1);
            }
        }
    },
    // 라이프사이클
    beforeCreate() {
        // hook중에서 가장 먼저 실행 됨
    },
    created() {
        // 데이터와 이벤트가 활성화 되면 접근 가능
    },
    beforeMount() {
        // 렌더링이 일어나기 직전에 실행
    },
    mounted() {
        // 렌더링 후 실행 => dom에 접근 가능
    },
    beforeUpdate() {
        // 컴포넌트의 데이터가 변하여 업데이트가 시작될 때 실행
        console.log("beforeUpdate");

        for(let i = 0; i < this.monsters.length; i++){
            // 몬스터가 죽었을 때 경우 처리 해주기 ==> hp가 0보다 같거나 작은 경우
            if(this.monsters[i].hp <= 0){
                for(let j = 0; j < this.monBook.length; j++){
                    if(this.monsters[i].monsterName == this.monBook[j].monsterName){
                        this.curExp += this.monBook[j].exp;
                        this.cash += this.monBook[j].sprMoney;
                    }
                }
                this.monsters.splice(i, 1);
            }
        }

        // 레벨업
        for(; this.curExp >= this.needExp; ){
            this.curExp = parseInt(this.curExp - this.needExp);
            this.characterLv += 1;
            this.characterHp += 100;
            this.characterAtk += 50;
            this.onlyCalcDef += 0.4;
            this.characterDef = Math.floor(this.onlyCalcDef);

            if(this.characterLv < 10) {
                this.needExp = parseInt(this.needExp * 1.1)
            } else if(this.characterLv < 20) {
                this.needExp = parseInt(this.needExp * 1.2)
            } else if(this.characterLv < 30) {
                this.needExp = parseInt(this.needExp * 1.3)
            } else if(this.characterLv < 40) {
                this.needExp = parseInt(this.needExp * 1.4)
            } else if(this.characterLv < 50) {
                this.needExp = parseInt(this.needExp * 1.5)
            } else if(this.characterLv < 90) {
                this.needExp = parseInt(this.needExp * 1.7)
            } else if(this.characterLv < 100) {
                this.needExp = parseInt(this.needExp * 2)
            }
        }

        // 아이템 구매 정보 업데이트


    },
    updated() {
        console.log("updated");
        // 데이터가 변하여 재 렌더링이 일어난 후에 실행
    },
    beforeDestroy() {
        // 뷰가 제거되기 직전에 호출
    },
    destroyed() {
        // 뷰가 제거된 후에 호출
    }
});