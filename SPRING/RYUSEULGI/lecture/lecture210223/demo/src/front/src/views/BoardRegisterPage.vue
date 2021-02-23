<template>
    <div align="center">
        <h2>게시판 글쓰기</h2>
        <board-register-form @submit="onSubmit"/>
    </div>
</template>

<script>
import BoardRegisterForm from '@/components/BoardRegisterForm';
import  axios from 'axios';

    export default {
        name : 'BoardRegisterPage',
        components : {
            BoardRegisterForm
        },
        methods : {
            onSubmit(payload){
                console.log("BoardRegisterPage onSubmit()");
                const { title, content, writer} = payload;
                axios.post('http://localhost:7777/boards', { title, content, writer})
                .then (res => {
                    console.log(res);
                    alert('등록되었습니다');
                    this.$router.push({
                        name : 'BoardReadPage',
                        params: {boardNo : res.date.boardNo.toString()}
                    });
                });
            }
        }
    }
</script>

<style lang="scss" scoped>

</style>