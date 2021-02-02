function ArrayUnshiftTest(){
    let arr = ["one","two","three"]
    console.log("Before Shift = " + arr)

 
    let len = arr.unshift(333)

    console.log("After Shift = " + arr)

    console.log("Shift Length = " + len)


    

    return (
        <div className="ArrayUnshiftTest">
            <p>
            ArrayUnshiftTest
            </p>
        </div>
    )
}

export default ArrayUnshiftTest