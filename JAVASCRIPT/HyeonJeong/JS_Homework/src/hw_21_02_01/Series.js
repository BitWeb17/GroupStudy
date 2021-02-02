const Series = () => {
    const STARTPOINT = 3
    let first = 1
    let second = 1
    let third = 1
    let result = 1
    let Nth

    class Series {
        constructor(targetNumber) {
            this.target = targetNumber 
        }

        getTarget() {
            return this._target
        }

        setTarget(num) {
            this._target = num
        }

        printTargetSerires() {
            Nth = this._target - STARTPOINT

            while(Nth > 0) {
                first = second 
                second = third
                third = result

                result = first + second + third
                
                console.log(
                    `(${first} + ${second} + ${third}) = ${result}`)
                Nth--
            }
            console.log(`${this._target}번째는 ${result}`)
            return result
        }
    }

    const series = new Series(7)
    series.setTarget(20)

    return (
        <div className = "Series">
            <p>
                Homework01<br/><br/>
                아래와 같은 수열이 있다.<br/>
                1, 1, 1, 3, 5, 9, 17, 31, 57, 105, 193, ......<br/>
                이 수열의 20 번째 값을 구할 수 있도록 프로그래밍 해보자!<br/><br/>
                {`${series.getTarget()}번째는 ${series.printTargetSerires()}`}
            </p>
        </div>
    )
}

export default Series


