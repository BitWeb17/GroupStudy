<template>
    <div>
        <div v-if="!communities || (Array.isArray(communities) && communities.length === 0)" class="empty">
            작성된 글이 없습니다.
        </div>

        <div v-else v-for="community in communities" :key="community.listNo" class="written-form">
            <div class="title">
                <div class="listNo" hidden>{{ community.listNo }}</div>
                <div class="profile">프로필사진</div>
                <div class="userEmail">{{ community.writer }}</div>
                <div class="date">{{ community.regDate }}</div>
            </div>
            <div class="contents">{{ community.contents }}</div>
            <!-- 형식이 겹치기 때문에 컴포넌트로 바꾸기 -->
            <div class="bottom">
                <div class="comments">
                    <router-link to="{ name : 'comment' }, params: { listNo: community.listNo.toString()}">
                        <i class="far fa-comments"></i>
                        <span>0</span>
                    </router-link>
                </div>
                <div class="like">
                    <router-link to="{ name : 'comment' }, params: { listNo: community.listNo.toString()}">
                        <i class="far fa-heart"></i>
                        <span>0</span>
                    </router-link>
                </div>
                <div class="modify">
                    <router-link to="{ name : 'modify' }, params: { listNo: community.listNo.toString()}">
                        <i class="far fa-keyboard"></i>
                        <span>수정</span>
                    </router-link>
                </div>
                <div class="remove">
                    <router-link to="{ name : 'remove' }, params: { listNo: community.listNo.toString()}">
                        <i class="far fa-trash-alt"></i>
                        <span>삭제</span>
                    </router-link>
                </div>
            </div>
        </div>
    </div>
</template>

<script>

export default {
    name : 'WrittemForm',
    props: {
        communities: {
            type: Array
        }
    }
};
</script>

<style scoped>

</style>