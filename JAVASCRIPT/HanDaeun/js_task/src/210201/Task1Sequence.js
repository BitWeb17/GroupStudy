const Task1Sequence = () => {
    const NAME = "< Task1Sequence >";
    const RESULT = "찾으려는 수열의 값 = ";
    const ERROR = "잘못 입력하셨습니다.";
    const ONE = 1;
    const THREE = 3;
    const FIND = 20;

    class Sequence {
        constructor() {
            this.first = this.second = this.third = ONE;
        }

        findSequence(findNum) {
            const seq = [this.first, this.second, this.third];
            let sum;

            if (findNum >= ONE && findNum <= THREE) {
                return seq[findNum - ONE];
            } 
            
            else if (findNum > THREE) {
                for (var i = THREE; i < findNum; i++) {
                    sum = this.first + this.second + this.third;
                    seq.push(sum);

                    this.first = this.second;
                    this.second = this.third;
                    this.third = sum;
                }
                
                return seq[findNum - ONE];
            } 
            
            else {
                return ERROR
            }
        }
    }

    let seq = new Sequence();

    console.log(NAME);
    console.log(RESULT + seq.findSequence(FIND));

    return (
        <div className="Task1Sequence">
            <p>
                Task1Sequence
            </p>
        </div>
    )
}

export default Task1Sequence