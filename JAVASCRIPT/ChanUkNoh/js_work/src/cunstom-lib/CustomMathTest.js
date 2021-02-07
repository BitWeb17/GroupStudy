function CustomMathTest() {
    let arr = [1, 3, 5, 7, 10, 8, 6, 77, 43]

    function myFindArrMax(arr) {
        let len = arr.length
        let max = -Infinity

        while(len--) {
            if(arr[len] > max) {
                max = arr[len]
            }
        }

        return max;
    }

    function myFindArrMin(arr) {
        let len = arr.length
        let min = Infinity

        while(len--) {
            if(arr[len] < min) {
                min = arr[len]
            }
        }

        return min;
    }

    console.log("myFindArrMax() = " + myFindArrMax(arr))
    console.log("myFindArrMin() = " + myFindArrMin(arr))

    return (
        <div className="CustomMathTest">
            <p>
                CustomMathTest
            </p>
        </div>
    )
}

export default CustomMathTest