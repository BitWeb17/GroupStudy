function RepeatEveryTest() {
    let seq = [1, 3, 5, 7, 9]
    let andTestSuccess = seq.every(andTestFunc)

    function andTestFunc(value) {
        return value > 5
    }

    console.log("After every() = " + andTestSuccess)

    return (
        <div className="RepeatEveryTest">
            <p>
                RepeatEveryTest
            </p>
        </div>
    )
}

export default RepeatEveryTest