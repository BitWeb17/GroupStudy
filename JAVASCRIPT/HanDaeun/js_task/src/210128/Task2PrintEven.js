/*
        < 문제 2 >
자바스크립트를 활용하여
1 ~ 20까지 숫자중 짝수만 출력하도록 만들어보자!
*/


function Task2PrintEven() {
    const ZERO = 0;
    const EVEN = 2;
    const START = 1;
    const END = 20;

    console.log("< Task2PrintEven >");

    for(var i = START; i <= END; i++) {
        if(i % EVEN === ZERO) {
            console.log(i);
        }        
    }

    return (
        <div className="Task2PrintEven">
        </div>
    )
}

export default Task2PrintEven