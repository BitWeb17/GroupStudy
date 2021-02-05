const ArrayShiftTest = () => {
    let arr = ["One", "Two", "Three"]

    console.log("Before Shift = " + arr)

    let elem = arr.shift()

    console.log("After Shift = " + arr)
    console.log("Shift Element = " + elem)

    return (
        <div className="ArrayShiftTest">
            <p>
                ArrayShiftTest
            </p>
        </div>
    )
}

export default ArrayShiftTest