function RepeatReduceTest() {
    let seq = [1, 3, 5, 7, 9]
    let sum = seq.reduce(reduceFunc)

    function reduceFunc(total, value) {
        return total + value
    }

    console.log("AfterReduce: " + sum)

    let testSUm = seq.reduce(reduceFunc, 333)

    console.log(testSUm)

    return (
        <div className="RepeatReduceTest">
            <p>
                RepeatReduceTest
            </p>
        </div>
    )
}

export default RepeatReduceTest