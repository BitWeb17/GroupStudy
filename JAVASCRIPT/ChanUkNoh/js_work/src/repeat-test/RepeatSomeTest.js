function RepeatSomeTest() {
    let seq = [1, 3, 5, 7, 9]
    let orTestSuccess = seq.some(orTestFunc)

    function orTestFunc(value) {
        return value > 5
    }

    console.log("After some() = " + orTestSuccess)

    return (
        <div className="RepeatSomeTest">
            <p>
                RepeatSomeTest
            </p>
        </div>
    )
}

export default RepeatSomeTest