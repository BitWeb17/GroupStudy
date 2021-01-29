/*
        < 문제 1 >
자바스크립트를 활용하여
1 ~ 10 까지 출력하도록 만들어보자!
(일단 콘솔창에 출력한다)
*/


function Task1Print() {
    const START = 1;
    const END = 10;

    console.log("< Task1Print >");
    
    for(var i = START; i <= END; i++) {
        console.log(i);
    }

    return (
        <div className="Task1Print">
        </div>
    )
}

export default Task1Print