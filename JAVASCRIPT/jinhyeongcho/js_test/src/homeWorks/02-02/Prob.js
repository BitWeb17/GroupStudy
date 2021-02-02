

const arr = []

const NUMOFPERSON =1000
const FEE = 10000000
const PARTICIPANSTAKE =0.67
const PRICE = NUMOFPERSON * FEE *PARTICIPANSTAKE
let arr2 = []
for(let i =0; i<NUMOFPERSON;i++){
    let lottoNum  = Math.floor((Math.random() * 10000) + 1)
    arr[i] =lottoNum
}
function CreateRandomTeam(arr,size){

    for(let i =0;i<arr.length; i +=size){
        arr2.push((arr.slice(i,i+size)))

    }console.log(arr2)
}
let test = CreateRandomTeam(arr,4)

//console.log(JSON.stringify(test))
//4명씩 250개 팀쪼개기..

/*const CheckWinner = () => {
    for(let i=0;i<250;i++){
        switch (arr2[i].forEach() % 1301 ==0 ){
         }
    }
CheckWinner()*/

   //250개 배열에 4개값 전부 1013배수인지 검사.
    // 케이스 이용?4개값중 1개 맞으면 1 , 2개 맞으면 4, 3개 맞으면 8, 4개 맞으면 16이란 값을 할당.
    //그값들을 다른배열에 push
    //ex tmp [16,16,8,8,8,1,1]


const CalcDividend = () => {
    //tmp 배열에 값의 총합으로 배열 값을 전부 나눔
    // 나눠진 값*PRICE 하면 각 배당금이 나옴. repeatmap 을 이용하면 배열값을 동시에 나누기와 곱하기가 됨.
}




    const Prob = () => {


    // 연습 문제 : 팀 로또?!
    // 참가자는 총 1000명이다.
    // 참가자들은 이 로또 배틀에 참여하기 위해 각자 1000만원을 지불한다.
    // 참가자들은 1 ~ 10000 사이의 숫자를 할당 받는다.
    // 팀원은 랜덤하게 4명씩 짝을 짓는다(총 250개의 팀)
    // 로또 당첨은 1013의 배수를 뽑은 사람이 이긴것으로 간주한다.
    // 배당금은 아래 원칙에 따라 지급한다.
    // 모든 팀원이 로또에 당첨된 경우: 승리 수당 배수가 2^4 으로 16배가 뛴다.
    // 팀원중 3명이 당첨된 경우: 승리 수당 배수가 2^3 으로 8배가 뛴다.
    // 팀원중 2명이 당첨된 경우: 승리 수당 배수가 2^2 으로 4배 뒨다.
    // 팀원중 1명이 당첨된 경우: 원래 수당 그대로 받는다.
    // 주최측은 무조건적으로 전체 비용의 33%를 가져간다.
    // 승리팀의 상태를 출력하고 승리 수당을 분배하여 표시하도록 한다.


    console.log("상금   =" + PRICE)

    return(
        <div className="Prob">
            <p>
                Prob
            </p>
        </div>
    )
}
export default Prob