const ArrayUnshiftTest = () => {
    let arr = ["one", "two", "three"]

    console.log("Before unShift = " + arr)

    let len = arr.unshift("333")

    console.log("After unShift = " + arr) 
    console.log("Arr Value = " + len)
    
    return(
        <div className="ArrayUnshiftTest">
            <p>
            Array Shift Test
            </p>
        </div>
            
    )
}

export default ArrayUnshiftTest