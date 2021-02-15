const RepeatEveryTest = () => {
    let seq = [1,2,3,4,5]
    let andTestSuccess = seq.every(andTestFunc)
    // map은 보통 연산시 활용한 녀석으로
    // seq 배열에 있는 모든 요소에 squareFunc()을 적용한다.

    function andTestFunc(value){
        return value >3
    }

    console.log("AfterReduce: " + andTestSuccess)

    let andTestSuccess2 = seq.every(andTestFunc2)
    function andTestFunc2(value){
        return value >0
    }

    console.log("AfterReduce: " + andTestSuccess2)



    return(
        <div className="RepeatEveryTest">
            <p>
                repeat-test : RepeatEveryTest
            </p>
        </div>
    )
}
export default RepeatEveryTest