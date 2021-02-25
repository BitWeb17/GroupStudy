Vue.component('my-component', {
    template : '<p>This is component\u{1F604}</p>'
});

const testComponent = {
    template : '<p>This is component2\u{1F604}</p>'
}

Vue.component('comp-child', {
    template : '<button v-on:click="handleClick">이벤트 실행</button>',
    methods : {
        handleClick(){
            // 이벤트 트리거
            this.$emit('childs-event');
        }
    }
});

Vue.component('test-comp-child', {
    template : '<li> {{ name }} HP.{{ hp }} \
                <button v-on:click="doAttack">공격</button></li>',
    props : {
        id: Number,
        name: String,
        hp : Number
    },
    methods : {
        doAttack(){
            this.$emit('attack', this.id);
        }
    }
});

const app = new Vue({
    el: '#app',
    lists: [
        { id: 1, name: '슬라임', hp: 10,},
        { id: 2, name: '고블린', hp: 30,},
        { id: 3, name: '드래곤', hp: 5000,}
    ],
    components : {
        'test-component' : testComponent
    },
    data : {
        val : [],
        rval : '',

    },
    methods: {
        parentsMethod() {
            alert('자식에서 전달받은 이벤트');
        },
        handleAttack(id){
            const list = this.lists.find((el) => {
                return el.id === id
            });

            if( list !== undefined && list.hp > 0){
                list.hp -= 10;
            }
        }
    }
});