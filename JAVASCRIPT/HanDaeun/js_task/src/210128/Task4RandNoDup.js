/*
        < 문제 4 >
위의 3번을 중복 없이 출력하도록 만들어보자!
*/


function Task4RandNoDup() {
    const ZERO = 0;
    const ONE = 1;
    const START = 1;
    const END = 15;
    const employee = [];
    let randNum;

    console.log("< Task4RandNoDup >");

    const range = END - START + ONE;

    for(var i = ZERO; i < END; ) {
        randNum = Math.floor(Math.random() * range) + START;

        if(!employee.includes(randNum)) {
            employee.push(randNum);
            console.log("사원 " + (i + ONE) + "\t: " + employee[i++]);
        }        
    }

    return (
        <div className="Task4RandNoDup">
        </div>
    )
}

export default Task4RandNoDup