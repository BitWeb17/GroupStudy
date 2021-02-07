function ArraySortTest2() {
    let arr = [1, 3, 5, 7, 10, 8, 6, 77, 43]

    console.log("Before Sort: " + arr)

    arr.sort(function(a, b) {
        return a - b;
    })

    console.log("After Sort: " + arr)

    console.log("Find Max: " + arr[arr.length - 1])
    console.log("Find Min: " + arr[0])

    return (
        <div className="ArraySortTest2">
            <p>
                ArraySortTest2
            </p>
        </div>
    )
}

export default ArraySortTest2