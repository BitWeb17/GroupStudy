function ArrayPushTest(){
    var arr = ["one","two","three"]

    
    console.log("Before Push = " + arr)
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