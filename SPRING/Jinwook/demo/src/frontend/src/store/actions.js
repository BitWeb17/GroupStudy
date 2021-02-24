import {
    FETCH_BOARD_LIST,
    FETCH_BOARD
  } from './mutation-types'
  
  import axios from 'axios'
  
  //비동기처리 아무거나 진행이됨
  export default {
      //커밋하는게 여러게 있을 수 있으므로 {} 로 묶는다
    fetchBoardList ({ commit }) {
      return axios.get('http://localhost:7777/boards')
        .then(res => {
            //컨트롤러 list의 모든 데이터가 res.data에 있음
            // 커밋하면  뮤테이션으로 이동
          commit(FETCH_BOARD_LIST, res.data)
        })
    },
    fetchBoard ({ commit }, boardNo) {
      console.log('fetchBoard ' + commit + ', boardNo = ' + boardNo)
      return axios.get(`http://localhost:7777/boards/${boardNo}`)
        .then(res => {
          console.log('fetchBoard - res: ' + res.data)
          commit(FETCH_BOARD, res.data)
        })
    }
  }