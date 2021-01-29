const SpreadTest4 = () =>{
    let arrstr= [..."xyz"]
    console.log("SpreadTest4: "+arrstr)

    // ??? 현재 굉장히 거슬이릴것
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