function RepeatMapTest() {
    let seq = [1, 3, 5, 7, 9]
    let seqSquare = seq.map(squareFunc)

    function squareFunc(value) {
        return value * value
    }

    console.log("seq: " + seq)

    console.log("seqSquare: " + seqSquare)


    return (
        <div className="RepeatMapTest">
            <p>
                RepeatMapTest
            </p>
        </div>
    )
}

export default RepeatMapTest