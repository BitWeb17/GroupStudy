const ArrayPopTest = () => {
    let arr = ["one", "Two", "Three"]

    console.log("Before Pop = " + arr)

    let elem = arr.pop()

    console.log("After Pop = " + arr)
    console.log("Pop Element = " + elem)

    return (
        <div className="ArrayPopTest">
            <p>
                ArrayPopTest
            </p>
        </div>
    )
}

export default ArrayPopTest