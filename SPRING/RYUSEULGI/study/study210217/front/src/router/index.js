import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import List from '../views/community/List.vue'
import Write from '../views/community/Write.vue'

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
  // COMMUNITY
  {
    path: '/communities',
    name: 'List',
    components: {
      default: List
    }
  },
  {
    path: '/communities/write',
    name: 'Write',
    components: {
      default: Write
    }
  }
  // SIGNUP
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
