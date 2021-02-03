function ArraySortTest() {
    let arr = [1, 3, 5, 7, 10, 8, 6, 77, 43]

    console.log("Before Reverse: " + arr)

    arr.reverse()

    console.log("After Reverse: " + arr)

    // arr.sort(sortFunc)
    //
    // function sortFunc(a, b) {
    //     let randNum = Math.floor((Math.random() * 3) - 1)
    //     console.log(randNum)
    //
    //     a = randNum
    //     b = randNum
    //
    //     return a + b
    // }
    //
    // console.log(arr)

    return (
        <div className="ArraySortTest">
            <p>
                ArraySortTest
            </p>
        </div>
    )
}

export default ArraySortTest