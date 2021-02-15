const SpreadTest3 = () => {
    let arrNum = [1, 2, 3];

    console.log("SpreadTest3: " + arrNum);

    function spreadArrPrint(a, b, c) {
        console.log("spreadArrPrint: " + a) // 1
        console.log("spreadArrPrint: " + b) // 2
        console.log("spreadArrPrint: " + c) // 3
    }

    // 배열을 전개한 것을 인수로 보낸다.
    spreadArrPrint(...arrNum);

    return (
        <div className="SpreadTest3">
            <p>
                SpreadTest3
            </p>
        </div>
    )
}

export default SpreadTest3