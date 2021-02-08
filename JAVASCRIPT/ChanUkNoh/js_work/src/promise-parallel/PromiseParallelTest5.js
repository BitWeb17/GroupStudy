function plus(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function() {
            let res = num1 + num2

            console.log(num1 + " + " + num2 + " = ")
            resolve(res)
        }, 4000)
    })
}

function minus(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function() {
            let res = num1 - num2

            console.log(num1 + " - " + num2 + " = ")
            resolve(res)
        }, 3000)
    })
}

function multiply(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function() {
            let res = num1 * num2

            console.log(num1 + " * " + num2 + " = ")
            resolve(res)
        }, 2000)
    })
}

function divide(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function() {
            let res = num1 / num2

            console.log(num1 + " / " + num2 + " = ")
            resolve(res)
        }, 1000)
    })
}

// 기다릴 위치 조정 then과 같은 기능이지만
async function asyncProcess() {
    const P1 = plus(100, 200)
    const P2 = minus(100, 200)
    const P3 = multiply(100, 200)
    const P4 = divide(100, 200)

    const res1 = await P1
    const res2 = await P2
    const res3 = await P3
    const res4 = await P4

    console.log(res1)
    console.log(res2)
    console.log(res3)
    console.log(res4)
}

asyncProcess()

const PromiseParallelTest5 = () => {
    console.log("PromiseParallelTest5 Start")

    console.log("PromiseParallelTest5 End")

    return (
        <div className="PromiseParallelTest5">
            <p>
                PromiseParallelTest5
            </p>
        </div>
    )
}

export default PromiseParallelTest5