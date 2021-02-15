/*
        < 문제 3 >
15명의 사원이 있다고 가정한다.
15명 모두에게 랜덤한 번호가 할당되도록 만들어보자(중복 허용)
*/


function Task3RandNum() {
    const ZERO = 0;
    const ONE = 1;
    const START = 1;
    const END = 15;
    let randNum;

    console.log("< Task3RandNum >");

    const range = END - START + ONE;

    for(var i = ZERO; i < END; i++) {
        randNum = Math.floor(Math.random() * range) + START;
        console.log("사원 " + (i + ONE) + "\t: " + randNum);
    }

    return (
        <div className="Task3RandNum">
        </div>
    )
}

export default Task3RandNum