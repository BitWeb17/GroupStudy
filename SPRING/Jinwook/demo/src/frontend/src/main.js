
import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import vuetify from './plugins/vuetify';
import cookies from "vue-cookies";

Vue.config.productionTip = false
Vue.use(cookies)

new Vue({
  router,
  //스테이트 관리 위한 vuex 전역 변수
  store,
  vuetify,
  cookies,
  render: h => h(App)
}).$mount('#app')