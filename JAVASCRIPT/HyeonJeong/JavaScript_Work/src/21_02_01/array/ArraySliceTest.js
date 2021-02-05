const ArraySliceTest = () => {
    let arr = [1, 2, 3, 4, 5, 6, 7]

    console.log(arr)

    let slicedArr = arr.slice(3,5)
    console.log(slicedArr)

    console.log(arr)

    arr = [1, 2, 3, 4, 5, 6, 7]

    console.log("Before Slice = ",arr)

    slicedArr = arr.slice(1)

    console.log("slicedArr = ",slicedArr)
    console.log("After Slice = ",arr)

    return (
        <div className="ArraySliceTest">
            <p>
                Array Slice Test
            </p>
        </div>
    )
}

export default ArraySliceTest