import React from 'react'

function ClassObj() {

    // functinon으로 객체를 생성하는 것 과는 다르게 
    // HOISTING이 일어나지 않음
    class Obj {
        // 생성자
        constructor(){
            this.name = 'test'
            this.major = 'contents'
        }
    }

    // JAVA와 사용법 일치
    const obj = new Obj();

    console.log(obj.name);
    console.log(obj.major);

    return (
        <div>
            
        </div>
    )
}

export default ClassObj
