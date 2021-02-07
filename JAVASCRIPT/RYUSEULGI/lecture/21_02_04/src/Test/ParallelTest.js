import React from 'react'

function plus (num1, num2){
    return new Promise((resolve,reject) =>{
        setTimeout(() =>{
            let res = num1 + num2;

            console.log(num1 + '+' + num2 + '=');
            resolve(res);
        }, 2000);
    });
}

function mult (num1, num2){
    return new Promise((resolve,reject) =>{
        setTimeout(() =>{
            let res = num1 * num2;

            console.log(num1 + '*' + num2 + '=');
            resolve(res);
        }, 4000);
    });
}

plus(100,200).then((response) => {
    console.log(response);
    return mult(100,200);
}).then(response => console.log(response));

Promise.all([   // 시간순서에 따라 돌아가고 있음
    plus(100,200),
    mult(100,200)
]).then(response => console.log(response));

Promise.race([  // 가장 빨리 처리된 것의 결과만 출력됨
    plus(100,200),
    mult(100,200)
]).then(response => console.log(response));

async function asyncProcess(){
    const res1 = await plus(100,200);
    console.log(res1);
    
    const res2 = await muit(100,200);
    console.log(res2);
}
asyncProcess();

async function asyncProcess2(){ // 기존방법보다 속도가 훨씬 빨라짐
    const p1 = plus(100,200);
    const p2 = mult(100,200);
    
    const res1 = await p1;
    const res2 = await p2;
    
    console.log(res1);
    console.log(res2);
}
asyncProcess2();

// 위의 방식은 변수 선언이 많이 되기 때문에 다음과 같이 작성하면
// 더욱 간결해짐
async function asyncProcess3(){
    // const [res1, res2] = await Promise.all([
    //     plus(100,200),
    //     mult(100,200)
    // ]);
    // console.log(res1);
    // console.log(res2);
    const res = await Promise.all([
        plus(100,200),
        mult(100,200)
    ]);
    console.log(res);
}
asyncProcess3();

const ParallelTest = () => {
    return (
        <div>
            
        </div>
    )
}

export default ParallelTest
