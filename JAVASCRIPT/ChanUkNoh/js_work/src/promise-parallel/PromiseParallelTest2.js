function plus(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function() {
            let res = num1 + num2

            console.log(num1 + " + " + num2 + " = ")
            resolve(res)
        }, 2000)
    })
}

function minus(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function() {
            let res = num1 - num2

            console.log(num1 + " - " + num2 + " = ")
            resolve(res)
        }, 2000)
    })
}

function multiply(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function() {
            let res = num1 * num2

            console.log(num1 + " * " + num2 + " = ")
            resolve(res)
        }, 4000)
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

Promise.all([
    plus(100, 200),
    minus(100, 200),
    multiply(100, 200),
    divide(100, 200)
]).then(response => console.log(response))

const PromiseParallelTest2 = () => {
    console.log("PromiseParallelTest2 Start")

    console.log("PromiseParallelTest2 End")

    return (
        <div className="PromiseParallelTest2">
            <p>
                PromiseParallelTest2
            </p>
        </div>
    )
}

export default PromiseParallelTest2