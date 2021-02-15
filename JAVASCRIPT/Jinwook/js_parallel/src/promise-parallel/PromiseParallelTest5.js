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
    const p1 =  plus(100,200)
    
    const p2 =  minus(100,200)
    
    const p3 =  mult(100,200)
    
    const p4 =  divide(100,200)

    const res1 = await p1
    const res2 = await p2
    const res3 = await p3
    const res4 = await p4

    console.log(res1)
    console.log(res2)
    console.log(res3)
    console.log(res4)
    
}
asyncProcess()

const PromiseParalleTest5 =()=>{
    console.log("PromiseParalleTest5 Start")
    console.log("PromiseParalleTest5 Fin")

    return (
        <div className = "PromiseParalleTest5">
            <p>PromiseParalleTest5</p>
        </div>
    )
}

export default PromiseParalleTest5