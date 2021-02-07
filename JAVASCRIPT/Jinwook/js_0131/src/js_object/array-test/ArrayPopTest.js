function ArrayPopTest(){
    var arr = ["one","two","three"]

    
    console.log("Before Pop = " + arr)
    // 제일 마지막 배열의 인덱스만 빼고 리턴하는 것
    let elem = arr.pop()


    console.log("After Pop = " + arr)


    console.log("Pop Element= " + elem)

    return (
        <div className="ArrayPopTest">
            <p>
            ArrayPopTest
            </p>
        </div>
    )
}

export default ArrayPopTest