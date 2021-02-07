function RepeatFindTest() {
    let seq = [1, 2, 3,4]
    let firstFind = seq.find(findFunc)

    function findFunc(value) {
        return value > 5
    }

    console.log("seq: " + seq)

    console.log("After find(): " + firstFind)

    let firstFindIdx = seq.findIndex(findIdxFunc)

    function findIdxFunc(value) {
        return value > 4
    }

    console.log("After find(): " + firstFindIdx)

    return (
        <div className="RepeatFindTest">
            <p>
                RepeatFindTest
            </p>
        </div>
    )
}

export default RepeatFindTest