
<template>
  <div>
    <h3>게시판</h3>
    <table border="1">
      <tr>
        <th align="center" width="80">번호</th>
        <th align="center" width="320">제목</th>
        <th align="center" width="100">작성자</th>
        <th align="center" width="180">등록일자(버그수정중)</th>
      </tr>

      <!-- boards가 없거나 길이가 0이거나 배열안에 값이 없으면 List is empty출력-->
      <tr v-if="!boards || (Array.isArray(boards) && boards.length === 0)">
        <td colspan="4">
          List is empty
        </td>
      </tr>

      <!--값이 있으면 밑의 내용을 출력-->
      <tr v-else v-for="board in boards" :key="board.boardNo">
        <td align="center">{{ board.boardNo }}</td>
        <td align="left">
          <router-link :to="{ name: 'BoardReadPage',
                        //boardNo=>router에서 props를 true로 지정했기 때문에 BoardReadPage에 boardNo이 트루로 들어감
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
import {mapActions} from "vuex";
export default {
  name: "BoardList",
  props: {
    // 상호 전달하는 데이터 타입을 어레이라고 알려주는 것
    boards: {
      type: Array
    }
  },
  methods: {
    ...mapActions(['fetchBoardList'])
  },
  beforeCreate: function () {
    console.log("BoardList Before Create: ")
  },
  created: function () {
    console.log("BoardList Created: ")
  },
  beforeMount: function () {
    console.log("BoardList Before Mount: ")
  },
  mounted: function () {
    console.log("BoardList Mounted: " + this.boards)
  },
  beforeUpdate: function() {
    console.log("BoardList Before Update: ")
  },
  updated: function () {
    console.log("BoardList Updated: ")
  },
  beforeDestroy: function () {
    console.log("BoardList Before Destroy: ")
  },
  destroyed: function () {
    console.log("BoardList Destroyed: ")
  }
}
</script>

<style scoped>
</style>