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

//1.플레이어를 1000명 만든다.

//2.플레이어들에게 1~10000사이의 숫자들을 할당한다.
const distributeNum =(player) =>{
    
    for(var i = 0; i < player.length; i++){
        player[i] = Math.floor(Math.random() * 10000)+1
        
    }
    

}

// //3. 팀원을 랜덤하게 4명식 짝을 짓는다(총 250개 팀) --> 추가배열 250개 만들어야한다.
const makeTeam = (playGroup,player) =>{
    let sampleArr = []
    for(let i = 0; i < 250;i++){
             for(let j = 0 ; j < 4 ; j++){
                let playerRand =  Math.floor((Math.random() * 1000)+1)
                sampleArr.push(player[playerRand])
             }
             playGroup.push(sampleArr)
        }
        console.log(playGroup)
    }

    
const TwoHomework1=() => {
    const NUMOFPERSON = 1000
    let player = new Array(NUMOFPERSON)
    let playGroup = new Array(250)

    distributeNum(player)
    console.log(player)
    makeTeam(playGroup,player)
    // 

    return (
        <div className="TwoHomework1">
            <p>TwoHomework1</p>
        </div>
    )
}
export default TwoHomework1