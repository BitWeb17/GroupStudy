const promise = new Promise(function (resolve, reject) {
    setTimeout(function() {
        console.log("Hello")
        resolve("World!");
    }, 2000)
})

promise.then(response => {
    console.log("Success")
}).catch(function(error) {
    console.log(error)
}).finally(() => {
    console.log("나는 무조건 실행된다!!")
})

const PromiseTest5 = () => {
    console.log("PromiseTest5 Start")

    console.log("PromiseTest5 Fin")

    return (
        <div className="PromiseTest5">
            <p>
                PromiseTest5
            </p>
        </div>
    )
}

export default PromiseTest5