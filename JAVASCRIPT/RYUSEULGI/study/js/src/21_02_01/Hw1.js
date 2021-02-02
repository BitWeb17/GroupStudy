// 1, 1, 1, 3, 5, 9, 17, 31, 57, 105, 193, ......이 수열의 20 번째 가ㅄ

import React from 'react'

function Hw1() {

    const num = [];

    function number(length){
        num[0] = 1;
        num[1] = 1;
        num[2] = 1;

        for(let i = 3; i < length; i++){
            num[i] = num[i - 1] + num[i - 2] + num[i - 3];
            console.log(num[length - 1]);
        }
    }

    number(20);
    
    return (
        <div>
            
        </div>
    )
}

export default Hw1
