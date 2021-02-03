function ApplyMathTest() {
    let arr = [1, 3, 5, 7, 10, 8, 6, 77, 43]

    function findArrMax(arr) {
        return Math.max.apply(null, arr)
    }

    function findArrMin(arr) {
        return Math.min.apply(null, arr)
    }

    console.log("Before findArrMax() = " + arr)
    console.log("findArrMax() = " + findArrMax(arr))
    console.log("findArrMin() = " + findArrMin(arr))

    return (
        <div className="ApplyMathTest">
            <p>
                ApplyMathTest
            </p>
        </div>
    )
}

export default ApplyMathTest