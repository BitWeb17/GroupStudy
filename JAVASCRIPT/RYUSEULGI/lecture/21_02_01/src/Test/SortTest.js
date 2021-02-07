import React from 'react'

function SortTest() {

    let arr = ['one', 'two', 'three'];

    const one = arr[0];
    const two = arr[1];
    const three = arr[2];

    console.log(one,two,three); // one two three

    arr = new Array('test1', 'test2', 'test3');
    console.log(arr); // test1,test2,test3

    const arr2 = [1, 9, 12, 5, 8, 7 ]; 
    const arr3 = [1, 9, 2, 5, 8, 7 ];

    console.log(arr2);
    const sortArr2 = arr2.sort();
    console.log(sortArr2); // 1,12,5,7,8,9 (12를 문자열 1+2로 생각하기 때문)

    console.log(arr3);
    const sortArr3 = arr3.sort();
    console.log(sortArr3); // 1,2,5,7,8,9 (10자리 수가 아니면 잘 정렬됨)

    console.log(arr2);
    const sortArr4 = arr2.sort((a, b) => a - b); // 배열에서 가ㅄ을 꺼내서 비교해보는 것 오름차순
    const sortArr5 = arr2.sort((a, b) => b - a); // 내림차순
    console.log('++' + sortArr4); // 1,5,7,8,9,12 (완벽)

    let text = '<ul>';
    for(let i = 0; i < sortArr2.length; i++){
        text += '<li>' + sortArr2[i] + '</li>';
    }
    text += '</ul>';
    console.log(text); 
    /*
    <ul>
        <li>1</li>
        <li>5</li>
        <li>7</li>
        <li>8</li>
        <li>9</li>
        <li>12</li>
    </ul>
    */

    return (
        <div></div>
    )
}

export default SortTest
