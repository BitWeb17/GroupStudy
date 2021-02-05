import React from 'react'

const promise = new Promise((resolve, reject) => {
    setTimeout(() => {
        console.log('new hello');
        resolve('success');
        reject('error');
    }, 2000);
});

promise.then((response) => {
    console.log(response);

    throw new Error('error!!!!!!!');
}).catch((error) => {
    console.log(error);
}).finally(() => {
    console.log('맨날 실행');
});

// resoleve => then
// reject => catch
// finally는 다 실행

const Promise3 = () => {

    return (
        <div>
            
        </div>
    )
}

export default Promise3
