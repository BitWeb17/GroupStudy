<template>
    <div class="body__container">
        <div class="inner">

            <h2>글쓰기</h2>

            <section class="section__writeNew wrap">
                <form id="community" action="list.html" th:action="@{list}" th:object="${community}" method="post">
                    <write-form @submit="onSubmit"/>
                </form>
            </section>

        </div>
    </div>
</template>

<script>
import WriteForm from '@/components/community/WriteForm';
import axios from 'axios';

export default {
    name: 'Write',
    components: {
        WriteForm
    },
    methods : {
        onSubmit(payload){
            const { writer, contents } = payload;
            axios.post('http://localhost:7777/comunities', { writer , contents })
            .then(() => {
                this.$router.push({
                    name : 'List',
                });
            })
            .catch(err => {
                console.log(err.response.data.message);
            });
        }
    }

}
</script>

<style src="@/assets/style/common.css"></style>
<style src="@/assets/style/community/write.css"></style>