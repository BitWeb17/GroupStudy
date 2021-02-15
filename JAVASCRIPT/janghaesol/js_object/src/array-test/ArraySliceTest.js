const ArraySliceTest = () => {
    let arr = [1, 2, 3, 4, 5, 6, 7]
        //slice는 작동을 해도 원본 배열이 바뀌지 않는다.
    let slicedArr = arr.slice(3)

    console.log("Before SlicedArr = " + slicedArr)

   

    console.log("slicedArr = " + slicedArr) 
    console.log("After Slice = " + arr)
    
    arr = [1, 2, 3, 4, 5, 6, 7]
    slicedArr = arr.slice(1)

    console.log("slicedArr = " + slicedArr) 
    console.log("After Slice = " + arr)
    return(
        <div className="ArraySliceTest">
            <p>
            Array Slice Test
            </p>
        </div>
            
    )
}

export default ArraySliceTest