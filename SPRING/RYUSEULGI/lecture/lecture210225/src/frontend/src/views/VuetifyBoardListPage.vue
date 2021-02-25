<template>
    <div align="center">
        <h1>뷰티파이 게시판</h1>
        <vuetify-board-list-page-form :list-array="pageArray"/>
    </div>
</template>

<script>
import axios from 'axios';
import VuetifyBoardListPageForm from '@/components/VuetifyBoardListPageForm';

export default {
    name: "VuetifyBoardListPage",
    components: {
        VuetifyBoardListPageForm
    },
    data () {
        return {
            pageArray: []
        }
    },
    created () {
        axios.get('http://sample.bmaster.kro.kr/contacts')
        .then(res => {
            this.pageArray = res.data.contacts
        })
        .catch(err => {
            console.log(err)
        })
    }
}
</script>