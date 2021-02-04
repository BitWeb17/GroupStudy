const promise = new Promise(
    // 프로미스는 자바 스크립트엔진(V8)에서 관리
    // 자바스크립트 엔진은 프로미스를 바로 스레드화
    // 실행을 안해줘도 실행 가능
    // --->메인 부분에 넣으면 두번 실행을 함
    function(resolve, reject){
        setTimeout(function(){
            console.log("Hello")
            resolve("World!!@!");
        }, 2000)
    }
)
promise.then(function(response){
    console.log(response)
})


const PromiseTest2 =()=>{
    console.log("PromiseTest Start")
    console.log("PromiseTest Fin")

    return (
        <div className = "PromiseTest2">
            <p>PromiseTest2</p>
        </div>
    )
}

export default PromiseTest2