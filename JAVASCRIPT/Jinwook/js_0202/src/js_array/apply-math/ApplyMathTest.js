const ApplyMathTest = () => {
    let arr = [1,3,8,10,5,7,11,19,77,33]

    //max값 찾기
    function findArrMax(arr) {
        return Math.max.apply(null,arr)
    }
    //min값 찾기
    function findArrMin(arr) {
        return Math.min.apply(null,arr)
    }
    

    console.log("Before findArrMax()= " + arr)
    console.log("FindArrMax(): " + findArrMax(arr))
    console.log("findArrMin(): " + findArrMin(arr))

    return(
        <div className = "ArraySortTest">
            <p>
                apply-test: ApplyMathTest
            </p>
        </div>
    )
} 

export default ApplyMathTest