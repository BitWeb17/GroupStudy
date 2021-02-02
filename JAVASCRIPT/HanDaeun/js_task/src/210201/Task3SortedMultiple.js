const Task3SortedMultiple = () => {    
    const NAME = "< Task3SortedMultiple >";
    const RESULT = "생성된 랜덤 배열 = ";
    const MULRESULT = "배수인 수들은 다음과 같다.";
    const ERROR = "잘못 입력하셨습니다.";
    const ZERO = 0;
    const ONE = 1;
    const ARRAY = 20;
    const START = 1;
    const END = 20;
    const FIND = 5;

    class Array {
        constructor() {
            this.arr = [];
        }

        setNoDupRandNum(arrNum, start, end) {
            if (arrNum < ONE || start > end) {
                return ERROR
            }

            let randNum;
            const range = end - start + ONE;

            for (var i = ZERO; i < arrNum; ) {
                randNum = Math.floor(Math.random() * range) + start;
                
                if (!this.arr.includes(randNum)) {
                    this.arr.push(randNum);
                    i++;
                }
            }
        }

        printSortedMultiple(findNum) {
            console.log(NAME);
            console.log(RESULT + this.arr);
            console.log(MULRESULT);

            const sortedarr = [];

            for (var i = ZERO; i < this.arr.length; i++) {
                if ((this.arr[i] % findNum) === ZERO) {
                    sortedarr.push(this.arr[i]);
                }
            }

            console.log(sortedarr.sort((a, b) => b - a));
        }
    }

    let arr = new Array();

    let msg = arr.setNoDupRandNum(ARRAY, START, END);
    
    if (msg) {
        console.log(NAME + msg);
    } else {
        arr.printSortedMultiple(FIND);
    }

    return (
        <div className="Task3SortedMultiple">
            <p>
                Task3SortedMultiple
            </p>
        </div>
    )
}

export default Task3SortedMultiple