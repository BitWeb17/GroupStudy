const AllocRandomNumber = (arr) => {

    console.log("AllocRandomNumber Called")
    let len = arr.length
    const ZERO = 0

    for(var i = ZERO; i < len; i++) {
       arr[i] = Math.floor(Math.random() * 10000) + 1
    }
}

const CreateRandomTeam = (teamArr, num) => {
    // 팀 250개에 랜덤 번호 주기
    // 왜 key가 4: [1,1,1,1],5: [],6: [],7: [] 이 나오는 걸까?
    //
    let randNum 
    let len = teamArr.length
    const ERROR = -1
    const ZERO = 0
    for(var i = ZERO; i < len; i++){
       randNum = Math.floor(Math.random() * 250) + 1
        if(teamArr.indexOf(randNum) == ERROR){
            for (var j = 0; j < num; j++) {  
                teamArr[i].push(randNum)
            }
        }
    }
}


const CheckWinner = (arr, winnerArr, num) => {
    //CRITERIA의 배수인지 판별하기
    const CRITERIA = 1013
    const LOSER = 0
    const WINNER =1
    let len = arr.length
    let cnt = Math.ceil(len / num)

    let newArr = []
    for(var i = LOSER; i < len ; i ++){    
            if(!(arr[i] % CRITERIA)) {
                newArr[i] = WINNER
            } else {
                newArr[i] = LOSER
            }
    }
    for(var j = 0; j < cnt;  j ++){
        winnerArr.push(newArr.splice(0,num))
    }

}

const CalcDividend = (winnerArr, subClearRateArr, PRICE, dividedPrice) => {
    //당첨자 파악
    const ALL = 16
    const THREEFOUR = 8
    const TWOFOUR = 4
    const ZERO = 0
    const TEAMMEMNUM = 4

    let sum =0
    let teamNum = winnerArr.length
    
    for(var i = ZERO; i < teamNum; i++) {
        subClearRateArr[i] = winnerArr[i].reduce((a,b) => a+b)
        sum += subClearRateArr[i]
    }
    console.log("총 당첨자 수 = %d",sum)

    // 당첨자 수에 따른 당첨금 
    dividedPrice = Math.round(PRICE / sum)
    console.log("sds",dividedPrice)
    console.log("각 조 당첨금: %d" ,dividedPrice)
    let divided1 = dividedPrice / TEAMMEMNUM
    let divided4 = (dividedPrice * TWOFOUR) / TEAMMEMNUM
    let divided8 = (dividedPrice * THREEFOUR) / TEAMMEMNUM
    let divided16 = (dividedPrice * ALL) / TEAMMEMNUM
    for(var i = ZERO; i < teamNum; i ++){
        
        if(subClearRateArr[i] == 0){
            console.log("0명당첨, 인당 %d 원", 0)
        }else if(subClearRateArr[i] == 1){

            console.log("1명당첨, 인당 %d 원", divided1)
        }else if(subClearRateArr[i] == 2){
            
            console.log("2명당첨, 인당 %d 원", divided4)
        }else if(subClearRateArr[i] == 3){
            
            console.log("3명당첨, 인당 %d 원", divided8)
        }else{
            
            console.log("4명당첨, 인당 %d 원", divided16 )
        }
    }
}


const ProbRefactoring = () => {
    const MAXTEAMNUM = 4
    const NUMOFPERSON = 1000
    const TEAMNUM = NUMOFPERSON / MAXTEAMNUM //250
    const FEE = 10000000
    const PARTICIPANTSTAKE = 0.67
    const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE

    console.log("총 상금 = %d", PRICE)

    
    let teamMap = new Map()
    let totalMap = new Map()
    let teamArr = new Array()
    let winnerArr = new Array()

    let dividedPrice = new Array()
    
    let arr = new Array(NUMOFPERSON)
    // let allClearRateArr = new Array(teamNum)
    let subClearRateArr = new Array(winnerArr)

    for(var i = 0; i < TEAMNUM; i++) {
        teamArr[i] = new Array(MAXTEAMNUM)
    }
    for(var i = 0; i < TEAMNUM; i++) {
        subClearRateArr[i] = new Array(MAXTEAMNUM)
    }
    


    teamMap.set("팀번호",teamArr)
    teamMap.set("랜덤 번호",arr) 
    totalMap.set("각 조 당첨자",winnerArr)
    totalMap.set("각조의 총 당첨자 수 ", subClearRateArr)
   

    

    

    


    AllocRandomNumber(arr)
    CreateRandomTeam(teamArr,MAXTEAMNUM)
    CheckWinner(arr,winnerArr, MAXTEAMNUM)
    CalcDividend(winnerArr, subClearRateArr,PRICE, dividedPrice)



    console.log(teamMap)
    console.log(totalMap)
    
    
    

    return (
        <div className="ProbRefactoring">
            <p>ProbRefactoring</p>
        </div>
    )
}

export default ProbRefactoring