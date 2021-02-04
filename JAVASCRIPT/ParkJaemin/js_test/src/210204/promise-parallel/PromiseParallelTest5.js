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
    const p1 = plus(100, 200)
    const p2 = minus(100, 200)
    const p3 = mult(100, 200)
    const p4 = divide(100, 200)

    const res1 = await p1 // 값을 세팅하고 res1대입할때까지 기다림
    const res2 = await p2
    const res3 = await p3
    const res4 = await p4 // p4까지 진행되고 나서 아래 값이 출력


    console.log(res1)
    console.log(res2)
    console.log(res3)
    console.log(res4)


}

asyncProcess()

const PromiseParallelTest5 = () => { //순차적 진행

    console.log("PromiseParallelTest5 start")

    console.log("PromiseParallelTest5 Fin")


    return (
        <div className="PromiseParallelTest5">
            <p>
                PromiseParallelTest5
            </p>
        </div>
    )
}
export default PromiseParallelTest5