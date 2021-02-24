<template>
    <div id="board">
        <h2>Board List</h2>
        <router-link :to="{ name: 'BoardRegisterPage' }">
        글쓰기
        </router-link>
        <board-list :boards="boards"/>
    </div>
</template>

<script>
import BoardList from '@/components/BoardList'
import { mapState, mapActions } from 'vuex'
export default {
    name: 'BoardListPage',
    components: {
        BoardList
    },
    computed: {
        ...mapState(['boards'])
    },
    mounted () {
        // list로 board를 가져올지 낱개로 가져올지 판단
        this.fetchBoardList()
    },
    methods: {
        ...mapActions(['fetchBoardList'])
    }
}
</script>