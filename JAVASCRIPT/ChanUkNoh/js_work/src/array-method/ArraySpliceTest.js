const ArraySpliceTest = () => {
    let arr = ["One", "Two", "Three"]

    console.log("Before Splice = " + arr)

    let returnValue = arr.splice(2, 0, "elem1", "elem2")

    console.log("After Splice = " + arr)
    console.log("returnValue = " + returnValue)

    returnValue = arr.splice(2, 2, "elem3", "elem4")

    console.log("After Splice = " + arr)
    console.log("returnValue = " + returnValue)

    returnValue = arr.splice(1, 2)

    console.log("After Splice = " + arr)
    console.log("returnValue = " + returnValue)

    return (
        <div className="ArraySpliceTest">
            <p>
                ArraySpliceTest
            </p>
        </div>
    )
}

export default ArraySpliceTest