import Vue from 'vue';
import VueRouter from 'vue-router';
import BoardListPage from "@/views/BoardListPage";
import BoardRegisterPage from "@/views/BoardRegisterPage";

Vue.use(VueRouter);

const routes = [
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
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
