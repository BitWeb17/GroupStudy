import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About'

import Test from "@/views/Test";

import BoardListPage from '../views/BoardListPage.vue'
import BoardRegisterPage from '../views/BoardRegisterPage.vue'
import BoardModifyPage from '../views/BoardModifyPage.vue'
import BoardReadPage from '../views/BoardReadPage.vue'
import vuetifyBoardListPage from "@/views/vuetifyPage/vuetifyBoardListPage";
import vuetifyBoardListPaginationPage from "@/views/vuetifyPage/vuetifyBoardListPaginationPage";


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    component: About
  },
  {
    path: '/test',
    name: 'Test',
    component: Test
  },
  {
    path: '/board',
    name: 'BoardListPage',
    components: {
      default: BoardListPage
    }
  },
  {
    path: '/board/create',
    name: 'BoardRegisterPage',
    components: {
      default: BoardRegisterPage
    }
  },
  {
    path: '/board/:boardNo',
    name: 'BoardReadPage',
    components: {
      default: BoardReadPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/board/:boardNo/edit',
    name: 'BoardModifyPage',
    components: {
      default: BoardModifyPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/vuetifyBoard',
    name: 'vuetifyBoardListPage',
    components: {
      default: vuetifyBoardListPage
    },
  },
  {
    path: '/vuetifyPagination',
    name: 'vuetifyBoardListPaginationPage',
    components: {
      default: vuetifyBoardListPaginationPage
    }
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
