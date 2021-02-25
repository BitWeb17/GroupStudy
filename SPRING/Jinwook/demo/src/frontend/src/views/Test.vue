<template>
  <div>
    <h1>뷰 테스트 페이지 입니다.</h1>
    <button v-on:click="reverseMsg">Reverse Message</button>
    <p>{{ message }}</p>
    <b>count: {{ this.$store.state.count }}</b><br>
    <b>count^2: {{ this.$store.getters.countSquare }}</b><br>
    <b>weight: {{ this.$store.getters.getWeight }}</b><br>
    <b>count^weight: {{ this.$store.getters.countWeightSquare }}</b><br>
    <b>random: {{ this.$store.getters.getRandom }}</b><br>
    <input type="button" @click="increment()" value="increment"/><br>
    <input type="button" @click="decrement()" value="decrement"/><br>
    <input type="button" @click="randomNumber()" value="random"/><br>
    <!-- Component를 만든다는 것은 결국 나만의 커스텀 HTML 태그를 만든다는 것을 의미한다
          LocalComponent가 쓰는 num은 현재 Component(Test)에서 사용하는 value와 같다-->
    <!-- : ???="" v-bind와 같은 의미-->
      <local-component :num="value"></local-component>
    <button v-on:click="plus">클릭</button><br>
    <global-component :initial-counter="counter"></global-component>
  </div>
</template>

<script>
import Vue from 'vue'
import cookies from 'vue-cookies'
import LocalComponent from "@/components/LocalComponent"
import GlobalComponent from "@/components/GlobalComponent";
Vue.component(GlobalComponent.name, GlobalComponent)
Vue.use(cookies)
export default {
  name: "Test",
  data () {
    return {
      message: "지구를 지켜츄 ~ 💚",
      counter: 7000,
      value: 3000
    }
  },
  components: {
    'local-component': LocalComponent
  },
  methods: {
    reverseMsg: function () {
      this.message = this.message.split('').reverse().join('')
    },
    increment: function () {
      this.$store.commit('increment')
      this.$cookies.set('value',
          this.$store.state.count, '1m')
    },
    decrement: function () {
      this.$store.commit('decrement')
      this.$cookies.set('value',
          this.$store.state.count, '1m')
    },
    randomNumber () {
      this.$store.dispatch('generateRandomNumber')
    },
    plus () {
      this.value++
    }
  },
  created() {
    this.$store.state.count = this.$cookies.get('value')
  }
}
</script>

<style scoped>
</style>