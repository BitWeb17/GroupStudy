const SpreadTest = () => {
    let arrColor = ["red", "green", "blue"]

    // ...arr은 배열의 요소를 전개해서 사용할 수 있다.
    let newArrColor = [...arrColor, "purple"]
    // newArrColor = ["red", "green", "blue", "purple"]

    console.log(arrColor)
    console.log(newArrColor)

    return (
        <div className="SpreadTest">
            <p>
                SpreadTest
            </p>
        </div>
    )
}

export default SpreadTest