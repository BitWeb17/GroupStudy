// 3) 아래와 같은 수열이 있다.
// 1, 1, 1, 3, 5, 9, 17, 31, 57, 105, 193, ......
// 이 수열의 20 번째 값을 구할 수 있도록 프로그래밍 해보자!

function Exercise1() {
    const START = 3
    const TARGET = 20
    const INDEX_CORRECTION = 1;

    let fibonacciAlikeArr = [1, 1, 1]

    for (let i = START; i < TARGET; i++) {
        fibonacciAlikeArr[i] = fibonacciAlikeArr[i - 1] + fibonacciAlikeArr[i - 2] +
            fibonacciAlikeArr[i - 3]
    }

    console.log(`${TARGET}번째 값: ` + fibonacciAlikeArr[TARGET - INDEX_CORRECTION])

    return (
        <div className="Exercise1">
            <p>
                Exercise1
            </p>
        </div>
    )
}

export default Exercise1