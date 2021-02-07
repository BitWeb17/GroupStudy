const promise = new Promise(
    function (resolve, reject) {
        setTimeout(function () {
            console.log("Hello")
            resolve("World!!")
        }, 2000)
    }
)
promise.then(function (response) {
    console.log(response)
})
const PromiseTest2 = () => {
    console.log("PromiseTest Start2")


    console.log("PromiseTest Fin2")

    return (
        <div className="PromiseTest2">
            <p>
                PromiseTest2
            </p>
        </div>
    )
}
export default PromiseTest2