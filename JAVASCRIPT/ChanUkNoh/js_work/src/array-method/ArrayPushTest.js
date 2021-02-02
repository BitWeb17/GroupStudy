const ArrayPushTest = () => {
    let arr = ["One", "Two", "Three"]

    console.log("Before Push = " + arr)

    let len = arr.push("Seven")

    console.log("After Push = " + arr)
    console.log("Arr Length = " + len)

    return (
        <div className="ArrayPushTest">
            <p>
                ArrayPushTest
            </p>
        </div>
    )
}

export default ArrayPushTest