const Test = () => {
    let arr = new Array(5)

    arr[0] = 0
    arr[1] = 1
    arr[2] = 2
    // arr[3] = 3
    // arr[4] = 4
    // arr[5] = 5
    // arr[6] = 6


    console.log(arr[5])
    console.log(arr[6])
    console.log(arr.length)

    return (
        <div className="Test">
            <p>
                Test
            </p>
        </div>
    )
}

export default Test
