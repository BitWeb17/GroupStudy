const promise = new Promise(
    function (resolve, reject) {
        setTimeout(function () {
            console.log("Hello")
            resolve("World!")
        }, 2000)
    }
)

// resolve()는 promise.then
// reject() 는 promise.catch
// finally() 는 무조건
promise.then(function(response){
    console.log(response)

    return new Promise(function (resolve, reject){
        setTimeout(function (){
            console.log("JavaScript Programming")
            resolve("~~!!~!")
        },1000)
    })

}).then(response=>
    console.log("Success")
).catch(function (error){
    console.log(error)
}).finally(()=>{
    console.log("PromiseTest7: 나는 무조건 실행된다!!!!")
})
const PromiseTest7 = () => {
    console.log("PromiseTest Start7")


    console.log("PromiseTest Fin7")

    return (
        <div className="PromiseTest7">
            <p>
                PromiseTest7
            </p>
        </div>
    )
}
export default PromiseTest7