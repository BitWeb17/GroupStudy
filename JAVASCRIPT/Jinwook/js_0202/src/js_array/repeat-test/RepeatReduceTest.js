const RepeatReduceTest = () => {
    let seq = [1,2,3,4,5]
    let sum = seq.reduce(reduceFunc)
    // map은 보통 연산시 사용하는 녀석

    
    function reduceFunc(total,value,value2) {
        return total + value + value2
    }

    console.log("After Reduce(): " + sum)

    let testSum = seq.reduce(reduceFunc,333,10)

    console.log("After testSum: " + testSum)

    return(
        <div className = "RepeatReduceTest">
            <p>
                repeat-test: RepeatReduceTest
            </p>
        </div>
    )
} 

export default RepeatReduceTest