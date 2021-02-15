import React from 'react'

const promise = new Promise((resolve, reject) => {
    setTimeout(()=> {
        console.log('hello~~');
        // resolve();
        resolve('world~~');
    }, 2000);
});

promise.then((response) => {
    // console.log('world~~');
    console.log(response);
    console.log('suceess');

    return new Promise ((resolve, reject) => {
        setTimeout(() => {
            console.log('new promise');
            resolve('go');
        }, 1000);
    });
}).then ((response) => {
    console.log('again');  // then을 한 번 더 작성해도 작동됨
});


const PromiseTest = () => {
    
    // 스레드가 호출 한 것 여기서 또 다시 실행했기 때문에
    // promise.then을 여기에 넣으면 2번 실행된 것
    console.log('promise fin');
    return (
        <div>
            
        </div>
    )
}

export default PromiseTest

// js 엔진이 promise 관리
// promise - 스레드