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
        // console.log(i + "번째 고객님 : " + player[i] + "번")
    }
    // console.log("player의 배열 = "  + player)

}

// //3. 팀원을 랜덤하게 4명식 짝을 짓는다(총 250개 팀) --> 추가배열 250개 만들어야한다.
const makeTeam = (teamMap,player,teamArr) =>{
    for(let j = 0; j < 250; j++){  
        teamArr[j] = []
        //map이 전혀 안쓰이고 있다  -- 문제.
        teamMap.set(j,teamArr[j])
        if(teamArr[j].indexOf(player) == -1){
            for(let i = 0; i < 4;i++){
                let playerRand =  Math.floor((Math.random() * 1000)+1)
                teamArr[j].push(player[playerRand])
            }
        //----재대로 2차원 배열이 만들어져서 값이 들어가있는지 확인----ok
        // console.log("team["+j+"]" + "[" + 3 + "] = " + teamArr[j][3] )
        }
    }
    //-----player들이 1~1000사이의 숫자를 가지고 어느 팀에 들어갔는지 확인----ok
    // for(var value of teamMap){
    //     console.log("entry = " + value)
    // }
    
}
    
const checkWinner = (teamArr,winnerNum) =>{
    console.log("정보공개 요청에 따라 정보를 공개합니다. " )
    for(let j = 0; j < 250; j++){
        
        console.log("[" + (j+1) +"]팀의 맵버 [" + teamArr[j] + "]")
    }
    for(let j = 0; j < 250 ; j++){
        for(let i = 0 ; i < 4 ; i++){
           
            if(teamArr[j][i] % 1013 == 0){
                teamArr[j][i] = 7777
                console.log("이번 로또의 당첨자가 나왔습니다!!!\n당첨자는 = " + (j+1) + ": 번 팀의" + (i+1) + ": 번 고객님 축하드립니다.")
                winnerNum++
                }else{
                teamArr[j][i] =0
                }
        }
    }
    if(winnerNum === 0){
        console.log("이번 게임 우승자는 없습니다...다음 게임도 이용해 주세요")
    }else{
    console.log("winnerNum = " + winnerNum)
    }
}

//팀에서 당첨자가 1명인지 2명인지 3명인지 4명인지를 판단하는 식을 먼저 만들고
//팀원에게 돈을 분배하는 식을 만들어야 할 것같다.
const giveMoney = (teamArr) =>{
    let j
    let cnt = 0
    let winnerCnt = 0
    for(j = 0; j < 250 ; j++){
        for(let i = 0 ; i < 4 ; i++){
            if(teamArr[j][i] === 7777){
                winnerCnt++
            }
        }
    }
    //승리수당을 6,700,000,000을 당첨된 사람 수로 나눈 거를 지급해야 하는 것인가?
    //아니면 6,700,000,000을 당첨된 사람이 있는 수로 나눠야 하는 것인가?
    //아래 식은 각 팀에서 한명씩만 당첨자가 나올 경우를 베이스로 하고있다 이를 해결하기위해선 어떤 식이 필요할까?
    //당첨자의 수를 배열로 만들어야 할까?  ---> 당첨자가 랜덤으로 나오기때문에 배열의 갯수를 선정하기 힘들다.
    let dividendMoney = Math.floor(6700000000/winnerCnt*4)
    for(j = 0; j < 250 ; j++){
        cnt = teamArr[j].filter(n => n === 7777).length
        if(cnt === 1){
            console.log((j+1) + "팀에 당첨자가 1명 있으므로 팀원 전체에게 담첨금" + (dividendMoney) + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
            cnt = 0
        }else if(cnt === 2){
            console.log((j+1) + "팀에 당첨자가 2명 있으므로 팀원 전체에게 4배인" + (dividendMoney * 4) + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
            cnt = 0
        }else if(cnt === 3){
                console.log((j+1) + "팀에 당첨자가 3명 있으므로 팀원 전체에게 8배인" + (dividendMoney * 8) + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
                cnt = 0
        }else if(cnt === 4 ){
                console.log((j+1) + "팀원 모두가 당첨되는 잭팟이 터졌으므로 전체에게 16배인" + (dividendMoney * 16) + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
                cnt = 0
            }
            
            
            // if(teamArr[j].indexOf(7777) == 1){
            //     console.log((j+1) + "팀에 당첨자가 1명 있으므로 팀원 전체에게 담첨금" + dividendMoney + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
            //     }else if(teamArr[j].indexOf(7777) == 2){
            //         console.log((j+1) + "팀에 당첨자가 2명 있으므로 팀원 전체에게 4배인" + (dividendMoney * 4) + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
            //     }else if(teamArr[j].indexOf(7777) == 3){
            //         console.log((j+1) + "팀에 당첨자가 3명 있으므로 팀원 전체에게 8배인" + (dividendMoney * 8) + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
            //     }else if(teamArr[j].indexOf(7777) == 4 ){
            //         console.log((j+1) + "팀원 모두가 당첨되는 잭팟이 터졌으므로 전체에게 16배인" + (dividendMoney * 16) + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
            //     }
            // if(teamArr[j][i] === 7777){
            //     cnt++
                //i 가 3일떄 cnt를 보기위해서 했지만 위에서이미 for의 i가 3일때 7777이 아니라면 못들어옴
                // if(i === 3)
                // if(cnt === 1 ){
                //     console.log((j+1) + "팀에 당첨자가 1명 있으므로 팀원 전체에게 담첨금" + dividendMoney + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
                //     cnt = 0
                // }else if(cnt === 2 ){
                //     console.log((j+1) + "팀에 당첨자가 2명 있으므로 팀원 전체에게 4배인" + (dividendMoney * 4) + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
                //     cnt = 0
                // }else if(cnt === 3 ){
                //     console.log((j+1) + "팀에 당첨자가 3명 있으므로 팀원 전체에게 8배인" + (dividendMoney * 8) + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
                //     cnt = 0
                // }else if(cnt === 4 ){
                //     console.log((j+1) + "팀원 모두가 당첨되는 잭팟이 터졌으므로 전체에게 16배인" + (dividendMoney * 16) + "만원 씩 담첨금을 지급합니다.\n축하합니다!!")
                //     cnt = 0
                // }

            }
        }    
        
    
    



const TwoHomework1=() => {
    const NUMOFPERSON = 1000
    let player = new Array(NUMOFPERSON)
    let teamArr = []
    let teamMap = new Map()
    let winnerNum  = 0
    distributeNum(player)
    makeTeam(teamMap,player,teamArr)
    checkWinner(teamArr,winnerNum)
    giveMoney(teamArr)
    
    return (
        <div className="TwoHomework1">
            <p>TwoHomework1</p>
        </div>
    )
}
export default TwoHomework1