import React from 'react'

const SetTest = () => {

    const setData = new Set(['banana', 'apple', 'grape']);
    console.log(setData); // Set(3) {"banana", "apple", "grape"}
    console.log(setData.size); // 3

    setData.add('cherry');
    setData.add('strawberry');

    console.log(setData); // Set(5) {"banana", "apple", "grape", "cherry", "strawberry"}
    console.log(setData.has('apple'));   // true

    let setItem = setData.keys();

    for(let key of setItem){
        console.log(key);    // setItem이 모두 출력
    }

    setItem = setData.entries();

    for(let entry of setItem){
        console.log(entry);   // key와 value 가ㅄ을 함께 반환
    }

    setData.forEach( (val1, val2) => {
        console.log(val1 + ' : ' + val2);
    });

    return (
        <div>
            
        </div>
    )
}

export default SetTest
