function BoolDataType() {
    var num1 = 3, num2 = 3, num3 = 7

    var boolRes1 = (num1 === num2)
    var boolRes2 = (num1 === num3)

    console.log("BoolDataType: " + boolRes1)
    console.log("BoolDataType: " + boolRes2)

    var boolRes3 = (testNum == testStr)
    var boolRes4 = (testNum === testStr)

    return (
        <div className = "BoolDataType">
            <p>
                {boolRes1.toString()}, {boolRes2.toString()}
                {boolRes3.toString()}, {boolRes4.toString()}
            </p>
        </div>
    )
}

export default BoolDataType