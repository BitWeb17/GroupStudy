<template>
  <div class="home">
    <!-- <img alt="Vue logo" src="../assets/logo.png"> -->
    <h2 align="center">This is an Home Page</h2>
    <div id="header">
      <router-link :to="{ name: 'Home' }"
                   class="nav-link"
                   active-class="active">
        Home
      </router-link>
      <router-link :to="{ name: 'About' }"
                   class="nav-link"
                   active-class="active">
        About Us
      </router-link>
      <router-link :to="{ name: 'Test' }"
                   class="nav-link"
                   active-class="active">
        테스트
      </router-link>
      <router-link :to="{ name: 'BoardListPage' }"
                   class="nav-link"
                   active-class="active">
        Board
      </router-link>
      <router-link :to="{ name: 'vuetifyBoardListPage' }"
                   class="nav-link"
                   active-class="active">
        뷰티파이
      </router-link>
      <router-link :to="{ name: 'vuetifyBoardListPaginationPage' }"
                   class="nav-link"
                   active-class="active">
        페이지네이션
      </router-link>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from '@/components/HelloWorld.vue'
/* eslint-disable no-unused-vars */
import store from '../store'
import Vue from 'vue'
// import cookies from 'vue-cookies'

import { mapState, mapGetters, mapActions } from 'vuex'

// Vue.use(cookies)

export default {
  name: 'Home',
  data: function () {
    return {
      message: 'Vue Test Message'
    }
  },
  components: {
  }
}
</script>

<style scoped>
div {
  border: 1px solid #ccc;
}

#header {
  text-align: center;
  padding: 15px;
  margin-bottom: 15px;
  margin: 5px 5px;
}



</style>
