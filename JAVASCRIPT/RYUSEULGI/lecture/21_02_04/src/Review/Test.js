import React from 'react'

const Test = () => {
    let sum = 0;

    for(let i = 1; i <= 10000000; i++){
        sum += (i * 0.0000001) * Math.sin(i * Math.PI / 180.0);
        sum += (i * 0.000001) * Math.cos(i * Math.PI / 90.0);
        sum += (i * 0.00001) * Math.sin(i * Math.PI / 270.0);
    }

    console.log(sum);

    // promise사용하여 성능좋게 변경하기
    return (
        <div>
            
        </div>
    )
}

export default Test
