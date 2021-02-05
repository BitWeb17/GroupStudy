import React from 'react'

const EQtest = () => {

    const name = 'test';
    // --------------------------------

    if(name){
        console.log('true');
    } else{
        console.log('false');
    }
    // true
    if(!name){
        console.log('(not) true');
    } else{
        console.log('(not) false');
    }
    // (not) false

    // --------------------------------

    if(name =='test'){
        console.log('equal');
    } else{
        console.log('not equal');
    }
    // equal
    if(name ==='test'){
        console.log('equal');
    } else{
        console.log('not equal');
    }
    // equal

    // --------------------------------

    if(name =='go'){
        console.log('equal');
    } else{
        console.log('not equal');
    }
    // not equal
    if(name ==='go'){
        console.log('equal');
    } else{
        console.log('not equal');
    }
    // not equal

    // --------------------------------

    if(name == null){
        console.log('equal');
    } else{
        console.log('not equal');
    }
    // not equal
    if(name === null){
        console.log('equal');
    } else{
        console.log('not equal');
    }
    // not equal

    // --------------------------------

    if(name == undefined){
        console.log('equal');
    } else{
        console.log('not equal');
    }
    // not equal
    if(name === undefined){
        console.log('equal');
    } else{
        console.log('not equal');
    }
    // not equal

    // --------------------------------

    const text = 0;

    if(text){
        console.log('success');
    } else{
        console.log('failure');
    }
    // failure 0 거짓 그 외의 숫자는 참

    if( text == false){
        console.log('success');
    } else{
        console.log('failure');
    }
    // suceesee "0은 거짓"은 거짓이야? 응 

    if( text === false){
        console.log('success');
    } else{
        console.log('failure');
    }
    // failure 데이터타입도 비교하기 때문에

    // 문자열 형태의 숫자는 == 비교해도 괜찮은데
    // 데이터타입이 중요하다면 ===을 사용하는 것이 좋다.

    return (
        <div>
            
        </div>
    )
}

export default EQtest
