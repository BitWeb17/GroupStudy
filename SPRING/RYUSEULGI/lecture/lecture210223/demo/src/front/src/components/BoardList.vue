<template>
    <div>
        <h3>게시판 보기</h3>
        <table border="1">
            <tr>
                <th align="center" width="80">번호</th>
                <th align="center" width="320">제목</th>
                <th align="center" width="80">글쓴이</th>         
                <th align="center" width="80">날짜</th>         
            </tr>
            <tr>
                <tr v-if="!boards || (Array.isArray(boards) && boards.length === 0)">
                <td colspan="4">
                    목록이 비어있습니다.
                </td>
            </tr>
            <tr v-else v-for="board in boards" :key="board.boardNo">
                <th align="center" width="80">{{ board.boardNo }}</th>
                <td align="left">
                    <router-link :to="{ name: 'BoardReadPage', 
                    params: { boardNo: board.boardNo.toString() } }">
                        {{ board.title }}
                    </router-link>
                </td>
                <td align="right">{{ board.writer }}</td>
                <td align="center">{{ board.regDate }}</td>
            </tr>
        </table>
    </div>
</template>

<script>
    export default {
        name : 'BoardList',
        props : {
            boards : {
                type : Array
            }
        }
    }
</script>

<style lang="scss" scoped>

</style>