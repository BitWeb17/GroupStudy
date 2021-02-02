import React from 'react'

function Repeat() {
    // 배열 내장함수 
    
    // forEach
    // 배열에 있는 요소를 testFunc의 인자로 설정
    // 모두 순회하고 더 이상 요소가 없다면 중지

    const arr = [1, 3, 8, 10, 5, 7, 11, 19, 77, 33];
    let txt = '';

    function testFunc(value){
        txt = txt + value;
    }
    arr.forEach(testFunc);
    console.log(txt);

    // map
    // 연산을 할 때 활용

    const seq = [1,2,3,4,5];
    const seqSquare = seq.map(mapTest);

    function mapTest(value){
        return value * value;
    }
    console.log(seq);
    console.log(seqSquare);

    // filter
    // 특정한 가ㅄ을 걸러낼 때 사용

    const array = [1,2,3,4,5];
    const over3 = array.filter(filterFun);

    function filterFun(value){
        return value > 3;
    }

    console.log(array);
    console.log(over3);
    
    // find, findIndex
    const firstFind = array.find(findFun);
    const firstIdxFind = array.findIndex(findFun);
    function findFun(value){
        return value > 2;
    }
    console.log(firstFind);  // 2보다 큰 근접한 수 3이 나옴
    console.log(firstIdxFind);  // 3의 인덱스 2가 나옴

    // reduce
    const array2 = [1,2,3,4,5];
    const sum = array2.reduce(reduceFun);

    function reduceFun(total, value){
        return total + value;
    }
    console.log(sum);

    const testSum = array2.reduce(reduceFun, 333, 10);
    console.log(testSum);

    // Every && 
    const andTestSucess = array2.every(andTestFun);

    function andTestFun(value){
        return value > 1    // false, 0부터 true
    }                       // value의 조건이 모두 만족해야 함
    console.log(andTestSucess);

    if( array2.every(andTestFun)){
        console.log('print');
    }

    // some ||
    const orTestSucess = array2.some(orTestFun);
    function orTestFun(value){
        return value > 4     // 하나라도 참이면 true
    }                     
    console.log(orTestSucess);

    
    return (
        <div>
            
        </div>
    )
}

export default Repeat
