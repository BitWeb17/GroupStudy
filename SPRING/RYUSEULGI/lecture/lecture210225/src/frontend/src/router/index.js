import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/views/Home'
import About from '@/views/About'
import Test from '@/views/Test'

import BoardListPage from '@/views/BoardListPage'
import BoardRegisterPage from '@/views/BoardRegisterPage'
import BoardModifyPage from '@/views/BoardModifyPage'
import BoardReadPage from '@/views/BoardReadPage'
import VuetifyBoardListPage from '@/views/VuetifyBoardListPage'
import VuetifyBoardListPagenation from '@/views/VuetifyBoardListPagenation'

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
  // TEST
  {
    path: '/test',
    name: 'Test',
    component: Test
  },
  // VUETIFY-BOARD
  {
    path: '/vuetifyBoard',
    name: 'VuetifyBoardListPage',
    components: {
      default: VuetifyBoardListPage
    }
  },
  {
    path: '/vuetifyPagination',
    name: 'VuetifyBoardListPagenation',
    components: {
      default: VuetifyBoardListPagenation
    }
  },
  // BOARD
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
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
