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
    // test 5번 간편한 버전
    const [res1, res2, res3, res4] = await Promise.all(
      [
        plus(100,200),
    
        minus(100,200),
        
        mult(100,200),
        
        divide(100,200)
      ]  
    )
    console.log(res1)
    console.log(res2)
    console.log(res3)
    console.log(res4)
    
}
asyncProcess()

const PromiseParalleTest6 =()=>{
    console.log("PromiseParalleTest6 Start")
    console.log("PromiseParalleTest6 Fin")

    return (
        <div className = "PromiseParalleTest6">
            <p>PromiseParalleTest6</p>
        </div>
    )
}

export default PromiseParalleTest6