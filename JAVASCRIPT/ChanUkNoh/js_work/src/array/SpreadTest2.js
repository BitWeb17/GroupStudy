const SpreadTest2 = () => {
    let arrNum = [2, 3, 4];
    let newArrNum = [1, ...arrNum, 5];

    console.log(arrNum)
    console.log(newArrNum)

    return (
        <div className="SpreadTest2">
            <p>
                SpreadTest2
            </p>
        </div>
    )
}

export default SpreadTest2