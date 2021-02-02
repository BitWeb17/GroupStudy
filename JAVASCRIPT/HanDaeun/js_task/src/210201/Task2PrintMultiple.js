const Task2PrintMultiple = () => {    
    const NAME = "< Task2PrintMultiple >";
    const RESULT = "생성된 랜덤 배열 = ";
    const MULRESULT = "배수인 수들은 다음과 같다.";
    const ERROR = "잘못 입력하셨습니다.";
    const ZERO = 0;
    const ONE = 1;
    const ARRAY = 10;
    const START = 1;
    const END = 10;
    const FIND = 3;

    class Array {
        constructor() {
            this.arr = [];
        }

        setRandNum(arrNum, start, end) {
            if (arrNum < ONE || start > end) {
                return ERROR
            }

            let randNum;
            const range = end - start + ONE;

            for (var i = ZERO; i < arrNum; i++) {
                randNum = Math.floor(Math.random() * range) + start;
                this.arr.push(randNum);
            }
        }

        printMultiple(findNum) {
            console.log(NAME);
            console.log(RESULT + this.arr);
            console.log(MULRESULT);

            for (var i = ZERO; i < this.arr.length; i++) {
                if ((this.arr[i] % findNum) === ZERO) {
                    console.log(this.arr[i]);
                }
            }
        }
    }

    let arr = new Array();

    let msg = arr.setRandNum(ARRAY, START, END);
    
    if (msg) {
        console.log(NAME + msg);
    } else {
        arr.printMultiple(FIND);
    }

    return (
        <div className="Task2PrintMultiple">
            <p>
                Task2PrintMultiple
            </p>
        </div>
    )
}

export default Task2PrintMultiple