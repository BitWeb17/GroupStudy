const CICDTest4 = () => {
    let name = "test"

    // 식별되지 않은 상태를 나타내며 해당 변수가 어떠한 객체도 가리키고 있지 않음을 표시합니다.
    //undefiend : 변수는 존재하나, 어떠한 값으로도 할당되지 않아 자료형이 정해지지(undefined) 않은 상태입니다.
    //null : 변수는 존재하나, null 로 (값이) 할당된 상태. 즉 null은 자료형이 정해진(defined) 상태입니다.
    // typeof null -> object
    // typeof undefined -> undefined
    // null === undefined   //flase
    // null  == undefined   // true
    //null === null         // true
    //null == null          // true
    //!null                 // true
    // "", null, undefined, 0, NaN !(not)연산시 false return
    //isNaN(1 + null)       // false
    //isNaN(1 + undefined)  // true
    
    if(name === null) {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    return (
        <div className="CICDTest4">
            <p>
                Coincidence Test 4
            </p>
        </div>
    )
}

export default CICDTest4