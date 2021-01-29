const SpreadTest4 = () =>{
    let arrstr= [..."xyz"]
    console.log("SpreadTest4: "+arrstr)


    function spreadArrPrint(a,b,c){
        console.log("spreadArrPrint: " + a)
        console.log("spreadArrPrint: " + b)
        console.log("spreadArrPrint: " + c)
    }

    spreadArrPrint(...arrstr)

    return(
        <div className="SpreadTest4">
            <p>
                Spread Test4
            </p>
        </div>
    )
}
export default SpreadTest4