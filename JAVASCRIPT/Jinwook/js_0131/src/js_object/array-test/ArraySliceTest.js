const ArraySlicetTest = () =>{
    let arr = [1,2,3,4,5,6,7]

    console.log("Before Silce = " + arr)

    //slice는 자른 배열의 원본이 변화 하지 않지만 splice는 변화한다
    let sliceedArr = arr.splice(3)

    console.log("slicedArr = " + sliceedArr)
    console.log("After Slice = " + arr)

    arr = [1,2,3,4,5,6,7]

    console.log("Before Silce = " + arr)

    sliceedArr = arr.splice(1)
    
    console.log("slicedArr = " + sliceedArr)
    console.log("After Slice = " + arr)


    return (
        <div className="ArraySlicetTest">
            <p>
            ArraySlicetTest
            </p>
        </div>
    )
}

export default ArraySlicetTest