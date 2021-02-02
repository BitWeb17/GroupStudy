const ArrayPushTest = () => {
    var arr = ["one", "two", "three"]

    console.log("Before Push = " + arr)

    let len = arr.push("seven")

    console.log("After Push = " + arr)
    console.log("Arr Length = " + len)

    let len2 = arr.push("팔")

    console.log("After Push = " + arr)
    console.log("Arr Length = " + len2)


    return (
        <div className="ArrayPushTest">
            <p>
                Array Push Test
            </p>
        </div>
    )
}

export default ArrayPushTest