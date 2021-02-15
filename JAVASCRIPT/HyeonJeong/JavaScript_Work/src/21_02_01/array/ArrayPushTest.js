const ArrayPushTest = () => {
    var arr = ["one", "two", "three"]

    console.log(arr)

    let resultPush = arr.push("seven")

    console.log(arr)
    console.log(resultPush)

    return (
        <div className = "ArrayPushTest">
            <p>
                Array Push Test
            </p>
        </div>
    )
}

export default ArrayPushTest