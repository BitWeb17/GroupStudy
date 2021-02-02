function ArrayPushTest(){
    var arr = ["one","two","three"]

    
    console.log("Before Push = " + arr)
    // 제일 마지막 배열의 인덱스만 빼고 리턴하는 것
    let len = arr.push("seven")


    console.log("After Push = " + arr)


    console.log("Array Length= " + len)

    return (
        <div className="ArrayPushTest">
            <p>
            ArrayPushTest
            </p>
        </div>
    )
}

export default ArrayPushTest