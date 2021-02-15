const SpreadTest = () =>{
    let arrColor = ["red","greed","blue"]
    // ...arrColor는 뭐다?
    // 현재 위치에 arrColor를 배치하고 뒤쪽에 purple을 배치한다.
    let newArrColor = [...arrColor,"purple"]

    console.log("SpreadTest1: "+arrColor)
    console.log("SpreadTest1: "+newArrColor)

    return(
        <div className="SpreadTest">
            <p>
                Spread Test
            </p>
        </div>
    )
}
export default SpreadTest