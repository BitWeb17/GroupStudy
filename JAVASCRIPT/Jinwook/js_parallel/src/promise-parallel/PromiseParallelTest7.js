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
    // test 6번 더 간편한 버전
    const res = await Promise.all(
      [
        plus(100,200),
    
        minus(100,200),
        
        mult(100,200),
        
        divide(100,200)
      ]  
    )
    console.log(res)
    
}
asyncProcess()

const PromiseParalleTest7 =()=>{
    console.log("PromiseParalleTest7 Start")
    console.log("PromiseParalleTest7 Fin")

    return (
        <div className = "PromiseParalleTest7">
            <p>PromiseParalleTest7</p>
        </div>
    )
}

export default PromiseParalleTest7