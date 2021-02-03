// 연습 문제: 팀 로또 ?!
// 참가자는 총 1000명이다.
// 참가자들은 이 로또 배틀에 참여하기 위해 각자 1000만원을 지불한다.
// 참가자들은 1 ~ 10000 사이의 숫자를 할당 받는다.
// 팀원은 랜덤하게 4명씩 짝을 짓는다(총 250개의 팀)
// 로또 당첨은 1013의 배수를 뽑은 사람이 이긴것으로 간주한다.

// 배당금은 아래 원칙에 따라 지급한다.
// 모든 팀원이 로또에 당첨된 경우: 승리 수당 배수가 2^4으로 16배 뛴다.
// 팀원중 3명이 당첨된 경우: 승리 수당 배수가 2^3으로 8배 뛴다.
// 팀원중 2명이 당첨된 경우: 승리 수당 배수가 2^2으로 4배 뛴다.
// 팀원중 1명이 당첨된 경우: 원래 수당 그대로 받는다.

// 1) 16: 16: 8: 8: 4: 1: 1: 1: 1: 1: 1: 1: 1: 1
// 2) 16
// 3) 8
// 4) 4
// 5) 1

// 주최측은 무조건적으로 전체 비용의 33%를 가져간다.
// 승리팀의 상태를 출력하고 승리 수당을 분배하여 표시하도록 한다.

// const AllocRandomNumber = (arr) => {
//     console.log("AllocRandomNumber Called")
//     for(var i = 0; i < arr.length; i++) {
//         arr[i] = Math.floor(Math.random() * 10000) + 1
//     }
// }

// const makeTeam = () =>{
//     let arr
//     for(let i = 0; i < 250 ; i++){
//         arr = new arr[i]
//         console.log("arr = " + arr)
//     }
// }

function TwoHomework1() {
    let userGetNum = []
    let arr = []
    
    //선수들에게 번호 나눠주기
    for(let u = 0; u < 1000; u++) {
        userGetNum.push(Math.floor(Math.random() * 10000) + 1)
        }

    let inArr = []

        //전체유저가 얻은 값중 4개를 뽑음
    for(let j = 0 ; j < 4 ; j++){
        let userRand = Math.floor(Math.random() * 1000) + 1
        inArr.push(userGetNum[userRand])
        console.log(inArr)
        
        if(j === 3){

        //배열을 3개 만들기
            for (let i = 0; i < 3; i++) {
            arr[i] = [...inArr]
        
            console.log(arr[i])
            }
            //if문 한번만돌고 다시 for문으로 가게 어떻게할까...
        }
    }
    
    return (
        <div className="TwoHomework1">
            <p>TwoHomework1</p>
        </div>
    )
}
    
    

// }

// // const CheckWinner = () => {

// }

// const CalcDividend = () => {

// }

// const Prob = () => {
//     const NUMOFPERSON = 1000
//     const FEE = 10000000
//     const PARTICIPANTSTAKE = 0.67
//     const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE

//     console.log("상금 = " + PRICE)

//     let arr = new Array(NUMOFPERSON)

//     AllocRandomNumber(arr)
//     console.log("res = " + arr)

   


export default TwoHomework1