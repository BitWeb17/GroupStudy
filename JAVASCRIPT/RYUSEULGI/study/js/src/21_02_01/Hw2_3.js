// 자바스크립트 배열에 랜덤한 숫자를 n개 생성한다.
// n개의 배열에서 3의 배수만 골라보도록 하자!
// (이 문제는 중복을 허용한다)
// 2번 문제에서 중복을 허용하지 않고 5의 배수만 골라보자!
// 또한 고른 값들은 모두 내림차순으로 정렬되어야 할 것이다.

import React from 'react'

function Hw2_3() {

    const numberArr = [];
    const newNumberArr = [];
    let res = [];

    function randomNum(length){
        this.length = length;

        for(let i = 0; i < length; i++){
        const randNum = Math.floor(Math.random() * length);
        numberArr.push(randNum);
        }
        console.log('랜덤숫자배열' + numberArr);
    }

    function printMul(array, number){
        res = [];

        for(let i = 0; i < length; i++){
            if( array[i] % number === 0){
                res.push(array[i]);
            }
        }
        console.log(`${number}의 배수 ${res.sort((a, b) => b - a)}`);
    }

    function noReapet(){
        for(i = 0; i < length; i++) {   
            if(newNumberArr.indexOf(numberArr[i]) === -1){
                newNumberArr.push(numberArr[i]);
            }
        }
        console.log('중복없는 랜덤숫자배열' + newNumberArr);
    }

    function sortArr(){
        const array = res.sort((a, b) => b - a);
        console.log(array);
    }

    randomNum(50);
    printMul(numberArr, 3);
    noReapet();
    printMul(newNumberArr, 5);
    sortArr();

    // reduce 사용해서 풀어보기

    function print3Multiple(){
        const res = numberArr.reduce((acc, current) => {
            if( current % 3 === 0){
                acc.push(current);
            }
            return acc;
        }, []);
        console.log('중복되는 3의 배수' + res);
    }

    function noDup(){
        const res = numberArr.sort().reduce((acc, current) => {
            // 내림차순은 어떻게 할까?
            if( acc.length === 0 || acc[acc.length - 1] !== current){
                if( current % 5 === 0){
                    acc.push(current);
                }
            }
            return acc;
        }, []);
        console.log('중복없는 5의 배수' + res);
    }

    randomNum(50);
    print3Multiple();
    noDup();

    return (
        <div>
            
        </div>
    )
}

export default Hw2_3
