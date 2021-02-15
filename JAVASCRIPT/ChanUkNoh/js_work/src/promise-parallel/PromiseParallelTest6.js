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
    const[res1, res2 ,res3, res4] = await Promise.all([
        plus(100, 20),
        minus(100, 20),
        multiply(100, 20),
        divide(100, 20)

    ])

    console.log(res1)
    console.log(res2)
    console.log(res3)
    console.log(res4)
}

asyncProcess()

const PromiseParallelTest6 = () => {
    console.log("PromiseParallelTest6 Start")

    console.log("PromiseParallelTest6 End")

    return (
        <div className="PromiseParallelTest6">
            <p>
                PromiseParallelTest6
            </p>
        </div>
    )
}

export default PromiseParallelTest6