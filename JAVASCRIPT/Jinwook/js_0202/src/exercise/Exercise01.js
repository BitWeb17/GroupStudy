// 팀 로또
// 참가자 총 1000명이다
// 참가자들은 이 로또 배틀에 참여하기 위해 각자 1000만원을 지불한다
// 참가자들은 1~10000 사이의 숫자를 할당 받는다
// 팀원은 랜덤하게 4명씩 짝을 짓는다(총 250개의 팀)
// 로또 당첨은 1013의 배수를 뽑은 사람이 이긴것으로 간주
// 배당금은 아래 원칙에 따라 지금한다.
// 모든 팀원이 로또에 당첨된 경우 : 슬리 수당 배수가 2^4으로 16배 뛴다
// 팀원중 3명이 당첨된 경우 : 승리 수당 배수가 2^3으로 8배 뛴다
// 팀원중 2명이 당첨된 경우 : 숭리 수당 배수가 2^2으로 4배 뛴다
// 팀원중 1명이 당첨된 경우 : 원래 수당 그대로 받는다.

// 주최측은 무조건적으로 전체 비용의 33%를 가져간다
// 승리팀의 상태를 출력하고 승리 수당을 분배하여 표시하도록 한다.

const Exercise01 = () => {
    let START = 1;
    let ZERO = 0;
    let PAYMENT = 10000000;
    
    let DIVIDEND = 0.7;

    let TEAMMATE = 4;


    let randPlayerIdx
    

    
    
   

    let playerNum = []
    let randTeamIdx =[]
   
    

    class TeamLotto{
        constructor(partinPlayer){
            this._player = partinPlayer
        }
        getPlayer(){
            return this._player
        }
        setPlayer(partinPlayer){
            this._player = partinPlayer
        }
        display(){
            console.log("참가인원은: %d명 입니다", this._player)
        }

        allocPlyerNumArr(){
            let num = this._player
            
            for(let i = ZERO; i < num; i++){
               playerNum[i] = Math.floor(Math.random() * num) + START;
            }
            console.log(playerNum)
            
            
        }
        createRandomTeam(){
            let teamNum = playerNum.length / TEAMMATE
            randPlayerIdx = playerNum.sort(function(a, b){return 0.5 - Math.random()})
            console.log(randPlayerIdx)
            for(var i = ZERO; i < teamNum; i++){
                randTeamIdx.push(randPlayerIdx.splice(0,TEAMMATE))
                
            }
            console.log(randTeamIdx)
    }
        filterLottoNum(){
            // 여기서 실패
                let filterArr = randTeamIdx.filter( value => value % 1013 === 0)
                   console.log("filterRandTeamIdx",filterArr)
               
        }
}
    let tl = new TeamLotto(10000)
    tl.display()
    tl.allocPlyerNumArr()
    tl.createRandomTeam()
    tl.filterLottoNum()


    return(
        <div className = "Exercise01">
            <p>
                Exercise01
            </p>
        </div>
    )
} 

export default Exercise01