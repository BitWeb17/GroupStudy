import React from 'react'

const Array = () => {
    
    const arrColor = ['red', 'green', 'black'];
    const newArrColor = [...arrColor, 'green'];

    console.log(arrColor); 
    console.log(newArrColor);  // ["red", "green", "black", "green"]

    const arrNum = [2, 3, 4];
    const newArrNum = [1, ...arrNum, 5];

    console.log(arrNum);
    console.log(newArrNum);   //[1, 2, 3, 4, 5]

    // const arr = [1 , 2 , 3];
    const arr = [...'xyz'];

    console.log(arr);

    function spreadPrint(a,b,c){
        console.log(a);
        console.log(b);
        console.log(c);
    }

    spreadPrint(...arr); 
    // 1   // x
    // 2   // y
    // 3   // z 문자열로 출력됨 

    const arr2 = ['a', 'b', 'c'];

    arr2.push(...['d', 'e', 'f']);
    console.log(arr2); // ["a", "b", "c", "d", "e", "f"];
    // arr2 뒤에 이어 붙이기

    const arr3 = [10, 20, 70, 60, 90];
    console.log(Math.max(...arr3));  // 90
    console.log(Math.max(arr3));  // NOT A NUMBER(NaN)

    const object1 = {
        name: 'seulgi',
        number : 3
    };

    console.log(object1);
    console.log(object1.name);
    console.log(object1.number);
    
    let object2 = { ...object};

    console.log(object2);
    console.log(object2.name);
    console.log(object2.number);

    object2 = {
        nickname : 'seulgya'
    }

    const object3 = {...object, ...object2};

    console.log(object3);
    console.log(object3.name);
    console.log(object3.number);
    console.log(object3.nickname)
    console.log(JSON.stringify(object3));
    // stringify(); object 내용 확인 가능
    
    return (
        <div>
            
        </div>
    )
}

export default Array