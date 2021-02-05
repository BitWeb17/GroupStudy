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
Promise.race([
    pulus(100,200),
    minus(100,200),
    mult(100,200),
    divide(100,200)

]

)
const PromiseParalleTest3 =()=>{
    console.log("PromiseParalleTest3 Start")
    console.log("PromiseParalleTest3 Fin")

    return (
        <div className = "PromiseParalleTest3">
            <p>PromiseParalleTest3</p>
        </div>
    )
}

export default PromiseParalleTest3