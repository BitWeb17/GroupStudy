<template>
    <div>
        <h2>테스트</h2>

        <div class="reverse">
            <button @click="reverseMsg" class="Btn">reverse</button>
            <p>{{ message }}</p>
        </div>

        <div class="calc">
            <p>count = {{ this.$store.state.count }}</p>
            <p> count 제곱 = {{ this.$store.getters.countSquare }}</p>
            <p>weight: {{ this.$store.getters.getWeight }}</p>
            <p>count^weight: {{ this.$store.getters.countWeightSquare }}</p>

            <input type="button" @click="plus()" value="plus" class="Btn"/>
            <input type="button" @click="minus()" value="minus" class="Btn"/>
            <input type="button" @click="randomNumber()" value="random" class="Btn"/>
        </div>

        <div class="component">
            <!-- num이 value와 같다는 걸 알 수 있음 -->
            <local-component :num="value"></local-component>
            <button @click="click" class="Btn">클릭</button>
            <global-component :initial-counter="counter"></global-component>
        </div>

    </div>
</template>

<script>
import Vue from 'vue';
import cookies from 'vue-cookies';
import LocalComponent from '@/components/LocalComponent'
import GlobalComponent from '@/components/GlobalComponent'

Vue.component(GlobalComponent.name, GlobalComponent);
Vue.use(cookies);

    export default {
        name: 'Test',
        data(){
            return {
                message : 'hello',
                value: 3000,
                counter : 7000
            }
        },
        components : {
            'local-component' : LocalComponent,
            'global-component' : GlobalComponent
        },
        methods : {
            reverseMsg(){
            // split (문자열 > 배열)
            // join (배열 > 문자열)
            this.message = this.message.split('').reverse().join('');
            },
            plus(){
                this.$store.commit('plus');
                this.$cookies.set('value', this.$store.state.count, '24h');
            },
            minus(){
                this.$store.commit('minus');
                this.$cookies.set('value', this.$store.state.count, '24h');
            },
            randomNumber () {
                this.$store.dispatch('generateRandomNumber')
            },
            click(){
                this.value++;
            }
        },
        created(){
            this.$store.state.count = this.$cookies.get('value');
        }
    }
</script>

<style scoped>
.Btn {
    display: inline-block;
    border: 1px solid;
    border-radius: 7px;
    padding: 5px;
    margin: 5px;
}
</style>