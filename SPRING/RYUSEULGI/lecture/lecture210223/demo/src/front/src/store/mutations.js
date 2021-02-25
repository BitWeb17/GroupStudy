// mutaions => rtical sesetion 데이터 처리, 
// 데이터가 방해받는 것을 방지하기 위한 공간
import { FETCH_BOARD_LIST, FETCH_BOARD } from './mutation-types';

export default{
    // commit(FETCH_BOARD_LIST, res.data) 
    // boards = res.data
    [FETCH_BOARD_LIST] (state, boards) {
        state.boards = boards;
    },
    [FETCH_BOARD] (state, board) {
        state.board = board;
    },
}