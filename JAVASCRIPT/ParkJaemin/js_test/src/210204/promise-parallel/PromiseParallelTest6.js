function plus(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            var res = num1 + num2

            console.log(num1 + " + " + num2 + " = ")
            resolve(res)
        }, 3000)
    })
}

function minus(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            var res = num1 - num2

            console.log(num1 + " - " + num2 + " = ")
            resolve(res)
        }, 2000)
    })
}

function mult(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            var res = num1 * num2

            console.log(num1 + " * " + num2 + " = ")
            resolve(res)
        }, 1500)
    })
}

function divide(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            var res = num1 / num2

            console.log(num1 + " / " + num2 + " = ")
            resolve(res)
        }, 1000)
    })
}

async function asyncProcess() {
    const [res1, res2, res3, res4] = await Promise.all( // 변수를 배열화로 지정했을 땐 time out 순으로 하나씩 출력된다.
        [
            plus(100, 200),
            minus(100, 200),
            mult(100, 200),
            divide(100, 200)
        ]
    )

    console.log(res1)
    console.log(res2)
    console.log(res3)
    console.log(res4)
}

asyncProcess()

const PromiseParallelTest6 = () => { //순차적 진행

    console.log("PromiseParallelTest6 start")

    console.log("PromiseParallelTest6 Fin")


    return (
        <div className="PromiseParallelTest6">
            <p>
                PromiseParallelTest6
            </p>
        </div>
    )
}
export default PromiseParallelTest6