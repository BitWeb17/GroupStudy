const EQTest = () =>{
    let name = "test"

    if(name){
        console.log("true")
    } else {
        console.log("false")
    }

    if(!name){
        console.log("(not) true")
    } else {
        console.log("(not) false")
    }

    return(
        <div className="EQTest">
            <p>
                Equal Test
            </p>
        </div>
    )
}
export default EQTest