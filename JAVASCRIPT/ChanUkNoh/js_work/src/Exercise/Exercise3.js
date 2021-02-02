// 2번 문제에서 중복을 허용하지 않고 5의 배수만 골라보자!
// 또한 고른 값들은 모두 내림차순으로 정렬되어야 할 것이다.

function Exercise3() {
    const BASE = 100
    const ZERO = 0
    const MULTIPLE_OF = 5

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
            let pickedSet = new Set()

            for (let i = 0; i < randomArr.length; i++) {

                if (randomArr[i] % MULTIPLE_OF == ZERO && randomArr[i] != ZERO) {
                    pickedSet.add(randomArr[i])
                }
            }

            let pickedArr = Array.from(pickedSet.keys())

            console.log("pickedSet: " + pickedArr)
        }
    }

    let ra = new RandomArr(30)

    ra.pickMultiple()

    return (
        <div className="Exercise3">
            <p>
                Exercise3
            </p>
        </div>
    )
}

export default Exercise3