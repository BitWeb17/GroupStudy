import React from 'react'
function first(){
    return new Promise((resolve, reject) => {
        let sum = 0;

        for(let i =0; i <= 10000000; i++){
            sum += (i * 0.0000001) * Math.sin(i * Math.PI / 180.0);
        }
        resolve(sum);
    });
}

function second(){
    return new Promise((resolve, reject) => {
        let sum = 0;

        for(let i =0; i <= 10000000; i++){
            sum += (i * 0.000001) * Math.cos(i * Math.PI / 90.0);
        }
        resolve(sum);
    });
}

function third(){
    return new Promise((resolve, reject) => {
        let sum = 0;

        for(let i =0; i <= 10000000; i++){
            sum += (i * 0.00001) * Math.sin(i * Math.PI / 270.0);
        }
        resolve(sum);
    });
}

async function res(){
    const result = await Promise.all([
        first(),
        second(),
        third()
    ]);
    console.log(result);
}

res();

// 자바스크립트 엔진이 파악하기에 분리가 가능한 수학 연산
// 행렬, 벡터 연산의 경우에는 
// 자바스크립트 스레드가 자동으로 계산을 하기 때문에
// PROMISE를 사용하여도 성능에 차이가 없다

const Result = () => {
    return (
        <div>
            
        </div>
    )
}

export default Result
