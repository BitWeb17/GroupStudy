import React from 'react';

// 값을 동적으로 할당할 때 이런식으로
// 정의하는데 function보다는 const가 요즘 대세

const FunctionTest = () => {

    const emptyObj = {};

    if(emptyObj){
        console.log('true');
    } else{
        console.log('false');console.log(prog.name2);
    }
    // true 비어있는 객체라도 true로 처리

    const add = function(a,b){
        return a + b;
    }

    console.log(add);

    if(add){
        console.log('true');
    } else{
        console.log('false');
    }
    // true 함수도 객체다

    function Programming(){
        this.name = 'javascript';
        this.students = 17;
    }

    Programming.prototype.getName = function(){
        return this.name;
    }

    const prog = new Programming()

    if(Programming){
        console.log('true');
    } else{
        console.log('false');
    }
    // true

    if(prog){
        console.log('true');
    } else{
        console.log('false');
    }
    // true

    if(prog.name){
        console.log('true');
    } else{
        console.log('false');
    }
    // true

    if(prog.getName){
        console.log('true');
    } else{
        console.log('false');
    }
    // true

    console.log(prog.getName()); // javascript
    console.log(prog.toString()); // [object object]
    console.log(prog.name2); // undefined
    console.log(prog.getAge); // undefined

    console.log('name2' in prog); // false

    // false가 되면 중간에 추가된 객체
    console.log(prog.hasOwnProperty('students')); // true
    console.log(prog.hasOwnProperty('getName')); // false
    // getName은 프로토타입으로 만든 것이기 때문에 false
    console.log(JSON.stringify(prog));
    // "{'name':'javascript','students':17}" getName이 없음

    return (
        <div></div>
    )
}

export default FunctionTest;
