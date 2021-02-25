<template>
    <div>
        <button @click="addCounter">{{ counter }}</button>
        <p>날 클릭해봐</p>
    </div>
</template>

<script>
    export default {
        name : 'GlobalComponent',
        // 컴포넌트 연결시 initial-counter
        props: ['initialCounter'],
        data (){
            return {
                counter: this.initialCounter
            }
        },
        methods: {
            addCounter(){
                this.counter++;
            }
        }
    }
</script>

<style scoped>
p{
    opacity: 0;
}
button:hover{
    background-color: tomato;
}
button:hover+p{
    opacity: 1;
}
</style>