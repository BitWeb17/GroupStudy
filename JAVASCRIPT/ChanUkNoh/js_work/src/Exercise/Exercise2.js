// 자바스크립트 배열에 랜덤한 숫자를 n개 생성한다.
// n개의 배열에서 3의 배수만 골라보도록 하자!
function Exercise2() {
    const BASE = 50
    const ZERO = 0
    const MULTIPLE_OF = 3;

    let randomArr = []

    class RandomArr {
        constructor(num) {

            for (let i = 0; i < num; i++) {
                let randNum = Math.floor(Math.random() * BASE)

                randomArr.push(randNum)
            }

            console.log("randomArr: " + randomArr)
        }

        pickMultiple() {
            let pickedArr = []

            for (let i = 0; i < randomArr.length; i++) {

                if (randomArr[i] % MULTIPLE_OF == ZERO && randomArr[i] != ZERO) {
                    pickedArr.push(randomArr[i])
                }
            }

            console.log("pickedArr: " + pickedArr)
        }
    }

    let ra = new RandomArr(20)

    ra.pickMultiple()

    return (
        <div className="Exercise2">
            <p>
                Exercise2
            </p>
        </div>
    )
}

export default Exercise2