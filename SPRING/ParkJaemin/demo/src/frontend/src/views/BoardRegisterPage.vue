<template>
  <div align="center">
    <h2>게시판 글쓰기</h2>
    <board-register-form @submit="onsubmit"/>
  </div>
</template>

<script>
import BoardRegisterForm from "@/components/BoardRegisterForm";
import axios from 'axios'

export default {
  name: "BoardRegisterPage",
  components: {
    BoardRegisterForm
  },
  methods: {
    onsubmit (payload) {
      console.log('BoardRegisterPage onSubmit()')
      // payload는 사용에 있어서 전송되는 데이터
      const { title, content, writer } = payload
      axios.post('http://localhost:7777/boards',
          { title, content, writer})
      //    .then(res)는 axios.post가 성공했을 경우
          // {title, content, writer}가 전송된다.
      .then(res => {
        console.log(res)
        alert('등록이 잘 되었습니다.')
        this.$router.push({
          name: 'BoardReadPage',
          //params : object 요소의 매개변수를 정의
          params: { boardNo: res.data.boardNo.toString() }
        })
      })
    }
  }
}
</script>

<style scoped>

</style>