import {
  FETCH_BOARD_LIST,
  FETCH_BOARD
} from './mutation-types'

export default {
  [FETCH_BOARD_LIST] (state, boards) {
    state.boards = boards
  },
  [FETCH_BOARD] (state, board) {
    state.board = board
  },

  // TEST
  plus (state) {
    state.count++;
  },
  minus (state) {
    state.count--;
  },
  successGenerateRandomNumber (state, payload) {
    state.random = payload
  }
}
