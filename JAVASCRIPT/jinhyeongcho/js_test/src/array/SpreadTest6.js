const SpreadTest6 = () =>{
    let arr= [10,20,70,50,60,90]

    console.log("SpreadTest6: "+Math.max(...arr))
    // ...이 Spread(흩뿌리기)\
    // ...이 없어서 NaN(Not a Number)
    //console.log("SpreadTest6: "+Math.max(arr))
    return(
        <div className="SpreadTest6">
            <p>
                Spread Test6
            </p>
        </div>
    )
}
export default SpreadTest6