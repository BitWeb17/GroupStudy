// actions => 비동기 처리
import { FETCH_BOARD_LIST, FETCH_BOARD } from './mutation-types';
import axios from 'axios';

export default {
    // { commit } = object 여러개 받아오기 때문
    fetchBoardList ({ commit }) {
        // getmapping(list 받아옴)
        return axios.get('http://localhost:7777/boards')
        .then( res => {
            // commit한건 mutation으로 감
            commit(FETCH_BOARD_LIST, res.data)
        });
    },
    fetchBoard ({ commit }, boardNo ){
        console.log('fetchBoard ' + commit + ', boardNo = ' + boardNo);

        return axios.get(`http://localhost:7777/boards/${boardNo}`)
        .then( res => {
            commit(FETCH_BOARD, res.data)
        });
    }
}