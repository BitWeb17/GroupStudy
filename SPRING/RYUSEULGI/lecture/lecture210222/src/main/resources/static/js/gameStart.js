var app = new Vue({
    el: '#app',
    data: {
        monsters : [
            {id : 1, name: '슬라임', hp: 10, morbidity: 10 * 0.2},
            {id : 2, name : '고블린', hp: 30, morbidity: 30 * 0.2},
            {id : 444, name :'드래곤', hp: 5000, morbidity: 5000 * 0.2}
        ],
        lists: [
            {id:1, name: '사과', price: 5000},
            {id:2, name: '바나나', price: 3000},
            {id:3, name: '딸기', price: 8000},
            {id:4, name: '오렌지', price: 10000}
        ],
        order: false,
        budget: 3000,
        limit: 2,
        // 빈 공백 배열을 만들 수 있음
        topicLists: [],
        current: '',
        topics:[
            { value : 'vue', name: 'Vue.js'},
            { value : 'JPA', name: 'JPA'}
        ],
        // 스프링에 뷰를 붙이기 위한 것
        watch:{
            current:function(val){
                axios.get('https://api.github.com/search/repositiries', {
                    params:{
                        q:'topic' + val
                    }
                }).then(function(response){
                    console.log(response);
                    this.topicLists = response.data.items;
                }).bind(this);
            }
        },
        width: 800,
        name : '',
        hp: '',
        num: 1,
        show: true,
        count: 0,
        radius: 50,
        isChild : true,
        isActive : true,
        textColor : 'red',
        bgColor : 'lightgray',
        bgColorBackup : 'yellow',
        vue_message: 'fruit',
        initMsg : '엥',
        lists: ['apple', 'banana', 'grape', 'strawberry']
    },
    methods:{
        handleClick : function(e){
            this.show = !this.show;
            alert('클릭했다');
        },
        increment: function(){
            this.count += 1;
        },
        chgBackground : function(){
            if(this.bgColor === 'lightgray'){
                this.bgColor = 'yellow';
            } else if(this.bgColor === 'yellow'){
                this.bgColor = 'lightgray';
            }
        },
        addMonster : function () {
            const max = this.monsters.reduce(function(a,b){
                return a >b.id ? a : b.id
            }, 0);
            this.monsters.push({
                id: max + 1,
                name: this.name,
                hp: this.hp
            });
        },
        doRemove : function(index){
            this.monsters.splice(index,1);
        },
        doAttack : function(index){
            this.monsters[index].hp -= 10;

            if(this.monsters[index].hp == 50 ){
                alert("몬스터가 죽어갑니다. 마지막 한 방 공격을 시도해보세요!");
            }
        },
        computed:{
            halfWidth: function(){
                return this.width / 2;
            },
            matched: function(){
                return this.lists.filter(function(el){
                    return el.price <= this.budget;
                }, this);
            }
        },
        sorted: function(){
            retunrn _.orderBy(this.matched,'price',
                    this.order ? 'desc' : 'asc'
            );
        },
        limited: function(){
            return this.sorted.slice(0,this.limit);
        }
    }
});