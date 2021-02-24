
<template>
  <div id="board">
    <h2>Board List</h2>
    <router-link :to="{ name: 'BoardRegisterPage' }">
      글쓰기
    </router-link>
    <!-- 컴포넌트 보드리스트와 연결-->
    <board-list :boards="boards"/>
  </div>
</template>
<script>
import BoardList from '@/components/BoardList'
import { mapState, mapActions } from 'vuex'
export default {
  name: 'BoardListPage',
  components: {
    BoardList
  },
  computed: {
    //Vuex: 단일객체트리
    //이 단일 객체는 모든 애플리케이션 수준의 상태를 포함하며 "원본 소스" 역할을 합니다. 
    //이는 각 애플리케이션마다 하나의 저장소만 갖게 된다는 것을 의미
    //단일 상태 트리는 모듈성과 충돌하지 않습니다.
    //그러면 Vue 컴포넌트에서 저장소 내부의 상태를 어떻게 표시하나요? 
    //Vuex 저장소는 반응적이기 때문에 저장소에서 상태를 "검색"하는 가장 간단한 방법은 
    //계산된 속성 (opens new window)내에서 일부 저장소 상태를 가져오는 것입니다.
    //컴포넌트가 여러 저장소 상태 속성이나 getter를 사용해야하는 경우 계산된 속성을 모두 선언하면 반복적이고 장황해집니다. 
    //이를 처리하기 위해 우리는 계산된 getter 함수를 생성하는 mapState 헬퍼를 사용하여 키 입력을 줄일 수 있습니다.
    //States 안 보드
    ...mapState(['boards'])
  },
   beforeCreate: function () {
    console.log("BoardListPage Before Create: " + this.boards)
  },
  // 실제로 async와 await를 사용했지만 병렬로 돌아가는 루틴이 완화되지 않았음
  // 왜 ? 이미 나누어져 있는 루틴이기 때문에 그러함
  
  created: function () {
    console.log("BoardListPage Created: " + this.boards)
  },

  beforeMount: function () {
    console.log("BoardListPage Before Mount: ")
  },
  mounted () {
    this.fetchBoardList()
    console.log("BoardListPage Mounted: " + this.fetchBoardList())
  },
  methods: {
    ...mapActions(['fetchBoardList'])
  },
  beforeUpdate: function() {
    console.log("BoardListPage Before Update: " + this.boards)
  },
  updated: function () {
    console.log("BoardListPage Updated: " + this.boards)
  },
  beforeDestroy: function () {
    console.log("BoardListPage Before Destroy:" + this.boards)
  },
  destroyed: function () {
    console.log("BoardListPage Destroyed: " + this.boards)
  }
}
</script>
