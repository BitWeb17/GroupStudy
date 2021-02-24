<template>
    <form @submit.prevent="onSubmit">
        <!-- 저장된 아이디 나오게 하는 방법 생각해보기 -->
        <input v-model="writer" type="text" />
        <div class="txt">
            <textarea v-model="contents" placeholder="나누고 싶은 이야기를 작성해주세요."></textarea>
        </div>

        <button class="basicBtn" type="submit">등록</button>
    </form>
</template>

<script>
export default {
    name: 'WriteForm',
    data(){
        return {
            writer: '',
            contents: ''
        }
    },
    methods: {
        onSubmit(){
            const { writer, contents } = this;
            this.$emit('submit', { writer, contents });
        }
    }
}
</script>

<style src="@/assets/style/common.css"></style>