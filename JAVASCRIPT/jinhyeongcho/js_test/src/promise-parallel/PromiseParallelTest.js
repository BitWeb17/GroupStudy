function plus(num1,num2){
    return new Promise(function (resolve, reject){
        setTimeout(function (){
            var res = num1 + num2

            console.log(num1 + " + " + num2 + "=")
            resolve(res)
        },3000)
    })
}

function minus(num1,num2){
    return new Promise(function (resolve, reject){
        setTimeout(function (){
            var res = num1 - num2

            console.log(num1 + " - " + num2 + "=")
            resolve(res)
        },2000)
    })
}

function mult(num1,num2){
    return new Promise(function (resolve, reject){
        setTimeout(function (){
            var res = num1 * num2

            console.log(num1 + " * " + num2 + "=")
            resolve(res)
        },1500)
    })
}

function divide(num1,num2){
    return new Promise(function (resolve, reject){
        setTimeout(function (){
            var res = num1 / num2

            console.log(num1 + " / " + num2 + "=")
            resolve(res)
        },1000)
    })
}

plus(100,200).then(function (reponse){
    console.log(reponse)
    return minus(100,200)
}).then(function (reponse){
    console.log(reponse)
    return mult(100,200)
}).then(function (response){
    console.log(response)
    return divide(100,200)
}).then(function (response){
    console.log("divide: " + response)
})

const PromiseParallelTest = () => {
    console.log("PromiseParallelTest start")
    console.log("PromiseParallelTest Fin")

    return(
        <div className="PromiseParallelTest">
            <p>
                PromiseParallelTest
            </p>
        </div>
    )
}
export default PromiseParallelTest