<template>
    <form @submit.prevent="onSubmit">
        <h2>글쓰기</h2>
        <table>
            <tr>
                <td>제목</td>
                <td>
                    <input type="text" v-model="title"/>
                </td>
            </tr>
            <tr>
                <td>글쓴이</td>
                <td>
                    <input type="text" v-model="writer"/>
                </td>
            </tr>
            <tr>
                <td>내용</td>
                <td>
                    <textarea v-model="content"></textarea>
                </td>
            </tr>
        </table>

        <button type="submit">등록</button>
        <router-link :to="{ name : BoardListPage }">취소</router-link>
    </form>
</template>

<script>
    export default {
        name : 'BoardRegisterForm',
        data () {
            return {
                title : '',
                writer : '',
                content : ''
            }
        },
        methods : {
            onSubmit(){
                const { title, writer, content} = this;
                this.$emit('submit', {title, writer, content});
            }
        }
    }
</script>

<style lang="scss" scoped>

</style>