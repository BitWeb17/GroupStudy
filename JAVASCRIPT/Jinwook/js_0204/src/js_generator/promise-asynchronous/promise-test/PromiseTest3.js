const promise = new Promise(

    // reject를 실행하면 catch로 가는걸 설명하는 것
    function(resolve, reject){
        setTimeout(function(){
            console.log("Hello")
            reject("Error!")
        }, 2000)
    }
)
promise.then(function(response){
    console.log("Success")
}). catch(function(error){
    console.log(error)
})


const PromiseTest3 =()=>{
    console.log("PromiseTest Start")
    console.log("PromiseTest Fin")

    return (
        <div className = "PromiseTest3">
            <p>PromiseTest3</p>
        </div>
    )
}

export default PromiseTest3