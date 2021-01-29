const SpreadTest3 = () =>{
    let arr= [1,2,3]
    console.log("SpreadTest3: "+arr)

    // ??? 현재 굉장히 거슬이릴것
    function spreadArrPrint(a,b,c){
        console.log("spreadArrPrint: " + a)
        console.log("spreadArrPrint: " + b)
        console.log("spreadArrPrint: " + c)
    }

    spreadArrPrint(...arr)

    return(
        <div className="SpreadTest3">
            <p>
                Spread Test3
            </p>
        </div>
    )
}
export default SpreadTest3