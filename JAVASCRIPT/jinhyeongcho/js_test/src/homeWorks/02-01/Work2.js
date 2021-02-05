const Work2 = () => {
    //자바스크립트 배열에 랜덤한 숫자를 n개 생성한다.
    //    n개의 배열에서 3의 배수만 골라보도록 하자!
    //    (이 문제는 중복을 허용한다)

    //랜덤길이 배열생성...
    //값도 랜덤 할당...
    //그값중 3의 배수만 출력
    let ZERO = 0
    let arr = []
    let arrResult = []

    function randArr(randLength, multiplier ) {
        randLength = (Math.random() *20)
        for(let i = ZERO; i < randLength; i++) {
            let randValue = Math.floor((Math.random() * 20) + 10)
            arr[i] = randValue
            arrResult.push(arr[i])
            if(arr[i] % multiplier == ZERO) {
                console.log("%d의 배수값 = %d",multiplier, arr[i])
            }
        }
        arrResult.sort((a,b) =>a-b)
        console.log("arr의 랜덤값(중복O) = " + arrResult)
    }

    let test = randArr(20,3)

    return(
        <div className="HomeWork02">
            <p>
                HomeWork02
            </p>
        </div>
    )
}
export default Work2
