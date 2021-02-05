const ArraySortTest = () => {
    let arr = [1,3,8,10,5,7,11,19,77,33]

    console.log("Before Reverse: " + arr)

    // 뒤로부터 정렬₩
    arr.reverse()
    console.log("After Reverse: " + arr)

    return(
        <div className = "ArraySortTest">
            <p>
                array-test: ArraySortTest
            </p>
        </div>
    )
} 

export default ArraySortTest