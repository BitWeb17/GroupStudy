// 자바스크립트 배열에 랜덤한 숫자를 n개 생성한다.
//     n개의 배열에서 3의 배수만 골라보도록 하자!
//     (이 문제는 중복을 허용한다)

//랜덤배열 공간 1~10을 생성
//그안에 숫자 1~30을 넣는다
//그중 3의배수만 추출



function Homework2() {
    

let SPACEMAX = 10
let MAXNUM = 30
let MIN = 1
let spaceRandNum = Math.floor(Math.random()*(SPACEMAX - MIN +1) + MIN)

let randArr = []
let pickedArr = []

function randValueF() {
    return Math.floor(Math.random() * (MAXNUM - MIN + 1) + MIN)
}

for(let i = 0 ; i < spaceRandNum; i ++){
    let valueRand = randValueF()
    randArr.push(valueRand)
}

console.log(randArr)

for(let j = 0 ; j < randArr.length; j++){
    if(randArr[j]%3 == 0){
        pickedArr.push(randArr[j])
    }
}
console.log(pickedArr)

return(
    <div className = "Homework2">
        <p>
            Homework2
        </p>

    </div>
    )
}

export default Homework2