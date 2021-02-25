<template>
  <div>
    <table>
      <tr>
        <th>번호</th>
        <th>이름</th>
        <th>연락처</th>
        <th>주소</th>
      </tr>
      <tr v-for="page in paginatedData" :key="page.no">
        <td>{{ page.no }}</td>
        <td>{{ page.name }}</td>
        <td>{{ page.tel }}</td>
        <td>{{ page.address }}</td>
      </tr>
    </table>
    <div id="btn-cover">
      <button :disabled="pageNum === 0" @click="prevPage" style="padding: 0.5rem">
        이전
      </button>
      <span>{{ pageNum +1 }} / {{ pageCount }} 페이지 </span>
      <button :disabled="pageNum >= pageCount -1" @click="nextPage">
        다음
      </button>
    </div>
  </div>
</template>

<script>
export default {
  name: "vuetifyBoardListPageForm",
  data () {
    return {
      pageNum: 0
    }
  },
  props: {
    listArray: {
      type: Array,
      required: true
    },
    pageSize: {
      type: Number,
      required: true,
      default: 20
    }
  },
  methods: {
    nextPage () {
      this.pageNum += 1
    },
    prevPage () {
      this.pageNum -= 1
    }
  },
  computed: {
    pageCount() {
      const listLen = this.listArray.length
      const listSize = this.pageSize
      // 게시글 개수에 비해 페이지가 적을때 짤리는것을 방지.
      let page = Math.floor(listLen/listSize)
      if (listLen % listSize >0) {
        page += 1
      }
      return page
    },
    paginatedData () {
      //시작위치가 달라지므로..
      const start = this.pageNum * this.pageSize
      const end = start + this.pageSize
      return this.listArray.slice(start,end)
    }
  }
}
</script>

<style scoped>
table {
  width: 70%;
  border-collapse: collapse;
}
table tr {
  text-align: center;
  border-bottom: 1px solid black;
}
#btn-cover {
  margin-top: 2px;
  text-align: center;
  width: 15rem;
  letter-spacing:  2px;}
</style>