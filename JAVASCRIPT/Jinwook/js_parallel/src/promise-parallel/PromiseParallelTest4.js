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
async function asyncProcess(){
    // await는 값을 얻을때 까지 기달리게하는것 
    const res1 = await plus(100,200)
    console.log(res1)
    const res2 = await minus(100,200)
    console.log(res2)
    const res3 = await mult(100,200)
    console.log(res3)
    const res4 = await divide(100,200)
    console.log(res4)
}
asyncProcess()
const PromiseParalleTest4 =()=>{
    console.log("PromiseParalleTest4 Start")
    console.log("PromiseParalleTest4 Fin")

    return (
        <div className = "PromiseParalleTest4">
            <p>PromiseParalleTest4</p>
        </div>
    )
}

export default PromiseParalleTest4