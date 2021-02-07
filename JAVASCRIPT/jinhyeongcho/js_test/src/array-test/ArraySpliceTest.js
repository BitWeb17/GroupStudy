const ArraySpliceTest = () =>{
    let arr = ["one","two","three"]

    console.log("Before Unshift = " + arr)

    let what = arr.splice(2,0,"elem1","elem2")

    console.log("After Splice = " + arr)
    console.log("what : " + what)
    // splice의 delete 값을  알수있다.
    what = arr.splice(2,2,"elem3","elem4")

    console.log("After Splice = " + arr)
    console.log("what : " + what)

    arr.splice(1,2)

    console.log("After Splice = " + arr)

    return(
        <div className="ArraySpliceTest">
            <p>
                Array Splice Test
            </p>
        </div>
    )
}
export default ArraySpliceTest