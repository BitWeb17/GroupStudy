const ArrowFunctionTest = () =>{
    //아래는 Arrow 빵식이 아님
    let f = function() { return"33"}
    console.log("ArrowFunctionTest =" + f())
            //return 을 생략하면 안됨.
            
    //아래가 Arrow 방식
    let fArrow = () => {return"33"}
    console.log("ArrowFunctionTest =" + f())

    return (
        <div className = "ArrowFunctionTest">
            <p>
            ArrowFunctionTest
            </p>
        </div>
    )
}

export default ArrowFunctionTest