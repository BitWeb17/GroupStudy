const SpreadTest5 = () => {
    let arr = ["a", "b", "c"]

    arr.push(...["d", "e", "f"])

    function spreadArrPrint(a, b, c) {
        console.log("spreadArrPrint: " + a)
        console.log("spreadArrPrint: " + b)
        console.log("spreadArrPrint: " + c)
    }
    
    return (
        <div className="SpreadTest5">
            <p>
                SpreadTest5
            </p>
        </div>
    )
}

export default SpreadTest5