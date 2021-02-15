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

plus(100, 200).then(function(response) {
    console.log("plus: " + response)
    return minus(100, 200)
}).then(function(response) {
    console.log("minus: " + response)
    return multiply(100, 200)
}).then(function(response) {
    console.log("multiply: " + response)
    return divide(100, 200)
}).then(function(response) {
    console.log("divide: " + response)
})

const PromiseParallelTest = () => {
    console.log("PromiseParallelTest Start")

    console.log("PromiseParallelTest End")

    return (
        <div className="PromiseParallelTest">
            <p>
                PromiseParallelTest
            </p>
        </div>
    )
}

export default PromiseParallelTest