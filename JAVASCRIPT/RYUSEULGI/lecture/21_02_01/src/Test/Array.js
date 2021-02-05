import React from 'react'

function Array() {

    const arr = [ 'one', 'two', 'three'];

    console.log(arr.toString());
    
    // join
    console.log(arr.join('*')); // one*two*three 

    // stack은 후입선출 queue 선입선출 방식
    // stack 방식
    // pop - 배열의 마지막 요소 분리
    console.log(arr.pop()); // three
    console.log(arr.toString()); // one, two(three가 없어진 걸 확인 가능)
    
    // push
    const number = arr.push('three');
    console.log(number);  // 3
    console.log(arr.toString()); // one, two, three
    
    // queue 방식
    // shift
    console.log(arr.shift()); // one
    console.log(arr.toString()); // two, three

    // unshift
    const number2 = arr.unshift('one');
    console.log(number2);
    console.log(arr.unshift()); // 3
    console.log(arr.toString()); // one, two, three 

    // splice - 원본배열이 바뀐다
    arr.splice(0,2,'add'); // 0~1까지 지우고 거기에 add를 넣는다
    console.log(arr.toString()); // add, three

    // concat 결합
    let arr2 = ['four', 'five', 'seven'];
    arr2 = arr2.concat(arr2);
    arr2 = arr2.concat(arr, arr2);
    console.log(arr2.toString()); // // four,five,seven,four,five,seven,add,three,four,five,seven,four,five,seven

    // slice - 원본배열이 바뀌지 않음
    const number3 = arr2.slice(0,1);  // 0~0 까지
    console.log(number3); // four
    console.log(arr2.toString());  // four, five, six 

    return (
        <div>
            
        </div>
    )
}

export default Array;
