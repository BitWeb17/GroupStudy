const SpreadTest6 = () => {
    let arr = [10, 20, 30, 50, 40 ,45, 60]

    console.log(Math.max(...arr))
    
    function spreadArrPrint(a, b, c) {
        console.log("spreadArrPrint: " + a)
        console.log("spreadArrPrint: " + b)
        console.log("spreadArrPrint: " + c)
    }

    return (
        <div className="SpreadTest6">
            <p>
                SpreadTest6
            </p>
        </div>
    )
}

export default SpreadTest6