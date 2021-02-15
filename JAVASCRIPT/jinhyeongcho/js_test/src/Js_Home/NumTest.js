function NumTest(){

    //console.log("ran값" + ran)
/*
    for(var i = 0; i<15; i++){
        var ran = Math.floor(Math.random() * 10)
        console.log("사원"+i+"값"+ran)

    }
*/

    const INIT = 1

    const START = 0
    const END = 15

    const CRITERIA = 10

    var emp = []

    for(var i = START; i < END; i++) {
        emp[i] = (Math.random() * CRITERIA) + INIT
        console.log("사원%d - 값:%d", i, emp[i])
    }


    return(
        <div className="NumPrint0to10">
            <p>
                3번 문제<br/>
                리턴이 없으면 홈페이지에 나오지 않는구나...<br/>

            </p>
        </div>
    )

}
export default NumTest