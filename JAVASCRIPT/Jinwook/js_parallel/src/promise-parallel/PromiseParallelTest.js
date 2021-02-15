const plus  = (num1, num2) =>{
    return new Promise(function(resoleve,reject){
        setTimeout(function(){
            var res = num1 + num2

            console.log(num1 + " + " + num2 +" = ")
            resoleve(res)
        },3000)
    })
}
const minus = (num1, num2) =>{
    return new Promise(function(resoleve,reject){
        setTimeout(function(){
            var res = num1 -  num2

            console.log(num1 + " - " + num2 +" = ")
            resoleve(res)
        },2000)
    })
}
const mult =(num1, num2) =>{
    return new Promise(function(resoleve,reject){
        setTimeout(function(){
            var res = num1 *  num2

            console.log(num1 + " * " + num2 + " = ")
            resoleve(res)
        },4000)
    })
}
const divide =(num1, num2) =>{
    return new Promise(function(resoleve,reject){
        setTimeout(function(){
            var res = num1 /  num2

            console.log(num1 + " / " + num2 + " = ")
            resoleve(res)
        },1000)
    })
}
plus(100,200).then(function(response){
    console.log("plus"+response)
    return minus(100,200)
}).then(function(response){
    console.log("minus"+response)
    return mult(100,200)
}).then(function(response){
    console.log("mult"+response)
    return divide(100,200)
}).then(function(response){
    console.log("divide"+response)
})
const PromiseParalleTest =()=>{
    console.log("PromiseParalleTest Start")
    console.log("PromiseParalleTest Fin")

    return (
        <div className = "PromiseParalleTest">
            <p>PromiseParalleTest</p>
        </div>
    )
}

export default PromiseParalleTest