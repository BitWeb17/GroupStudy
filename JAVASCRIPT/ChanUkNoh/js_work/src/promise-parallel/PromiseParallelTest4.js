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
    const res1 = await plus(100, 200)
    console.log(res1)

    const res2 = await minus(100, 200)
    console.log(res2)

    const res3 = await multiply(100, 200)
    console.log(res3)

    const res4 = await divide(100, 200)
    console.log(res4)
}

asyncProcess()

const PromiseParallelTest4 = () => {
    console.log("PromiseParallelTest4 Start")

    console.log("PromiseParallelTest4 End")

    return (
        <div className="PromiseParallelTest4">
            <p>
                PromiseParallelTest4
            </p>
        </div>
    )
}

export default PromiseParallelTest4