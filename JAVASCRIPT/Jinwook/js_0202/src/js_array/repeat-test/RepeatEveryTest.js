const RepeatEveryTest = () => {
    let seq = [1,2,3,4,5]
    // 함수 내의 테스트를 배열 안의 값들이 모두 통과 할 수 있는가?
    // 있으면 ture 없으면 false
    // and 연산자
    let andTestSuccess = seq.every(andTestFunc)
    
    function andTestFunc(value) {
        return value > 0
    }

    console.log("After every(): " + andTestSuccess)

    andTestSuccess = seq.every(andTestFunc2)

    function andTestFunc2(value) {
        return value > 3
    }

    console.log("After every2(): " + andTestSuccess)


    return(
        <div className = "RepeatEveryTest">
            <p>
                repeat-test: RepeatEveryTest
            </p>
        </div>
    )
} 

export default RepeatEveryTest