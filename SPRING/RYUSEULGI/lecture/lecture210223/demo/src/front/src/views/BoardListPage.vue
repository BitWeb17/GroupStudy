<template>
    <div id="board">
        <h2>Board List</h2>
        <router-link :to="{ name: 'BoardRegisterPage' }">
            새로운 글쓰기
        </router-link>
        <board-list :boards="boards"/>
    </div>
</template>

<script>
import boardList from "@/components/BoardList";
import { mapState, mapActions } from 'vuex';

export default {
    name : 'BoardListPage',
    components: {
        boardList
    },
    computed : {
        ...mapState(['boards'])
    },
    mounted(){
        this.fetchBoardList();
    },
    methods : {
        ...mapActions(['fetchBoardList'])
    }
}
</script>
