const RepeatSomeTest = () => {
    let seq = [1,2,3,4,5]
    let orTestSuccess = seq.some(orTestFunc)
    // map은 보통 연산시 활용한 녀석으로
    // seq 배열에 있는 모든 요소에 squareFunc()을 적용한다.

    function orTestFunc(value){
        return value >5
    }

    console.log("After Some(): " + orTestSuccess)

    let orTestSuccess2 = seq.every(orTestFunc2)
    function orTestFunc2(value){
        return value >0
    }

    console.log("After Some(): " + orTestSuccess2)



    return(
        <div className="RepeatSomeTest">
            <p>
                repeat-test : RepeatSomeTest
            </p>
        </div>
    )
}
export default RepeatSomeTest