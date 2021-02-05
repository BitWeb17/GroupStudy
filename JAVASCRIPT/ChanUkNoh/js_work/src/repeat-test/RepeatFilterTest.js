function RepeatFilterTest() {
    let seq = [1, 3, 5, 7, 9]
    let over3 = seq.filter(filterFunc)

    function filterFunc(value) {
        return value > 5
    }

    console.log("seq: " + seq)

    console.log("seqSquare: " + over3)


    return (
        <div className="RepeatFilterTest">
            <p>
                RepeatFilterTest
            </p>
        </div>
    )
}

export default RepeatFilterTest