const AllocRandomNumber = (arr) => {

    console.log("AllocRandomNumber Called")

    for(var i = 0; i < arr.length; i++) {
        arr[i] = Math.floor(Math.random() * 10000) + 1
    }
    console.log(arr)
}


const CreateRandomTeam = (teamArr, num) => {
    // 팀 250개에 랜덤 번호 주기
    let randNum
    const ERROR = -1
    for(var i = 0; i < teamArr.length; i++){
       randNum = Math.floor(Math.random() * 250) + 1
       if(teamArr.indexOf(randNum) == ERROR){
        for (var j = 0; j < num; j++) {  
          teamArr[i].push(randNum)
        }
    }
}
}

const CheckWinner = (arr, winnerArr, num) => {
    console.log("AllocRandomNumber Called")
    // CRITERIA의 배수인지 판별하기
    const CRITERIA = 101
    for(var i = 0; i < arr.length;  i ++){
            if(!(arr[i] % CRITERIA)) {
                winnerArr[i] = 1
            } else {
                winnerArr[i] = 0
            }
           
    }
    console.log(winnerArr)
}


Array.prototype.arrDivide = function (num) {
    // 찾은 0,1 -> 4개 배열로  나누기
    let arr =this
    let len = arr.length
    let cnt = Math.ceil(len / num)

    let newArr = []

    for(var i = 0; i < cnt; i++) {
        newArr.push(arr.splice(0, num))
    }

    return newArr

}
// iterator value를 사용해서 team map(winner)  1값 찾기
// 1 값 찾으면 1++해주기

// var valueIter = teamMap.values()
// for(var value of valueIter){
//     console.log("iterator: ",value)
// }

// Array.prototype.printArr = function(num) {
//     let arr = this
//     let len = arr.length

//     for (var i = 0; i < len; i += num) {
//         console.log(arr[i], arr[i + 1], arr[i + 2], arr[i + 3])
//     }
// }

// 1++해준거를 1이면 1배수 / 4배수 / 8배수 /16배수로 계산하기

const CalcDividend = (winnerArr, price) => {
    const ALL = 16
    const THREEFOUR = 8
    const TWOFOUR = 4
    const ZERO = 0

    const TEAMMEMNUM = 4
    

}

const ProbRefactoring = () => {
    const MAXTEAMNUM = 4
    const NUMOFPERSON = 1000
    const TEAMNUM = NUMOFPERSON / MAXTEAMNUM //250
    const FEE = 10000000
    const PARTICIPANTSTAKE = 0.67
    const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE

    console.log("상금 = " + PRICE)

    
    let teamMap = new Map()
    let teamArr = new Array(TEAMNUM)//250
    let winnerArr = new Array(NUMOFPERSON)
    let arr = new Array(NUMOFPERSON)

    

    

    for(var i = 0; i < TEAMNUM; i++) {
        teamArr[i] = new Array(MAXTEAMNUM)
        
    }
    


    teamMap.set("team",teamArr)
    teamMap.set("winner",winnerArr)
    var valueIter = teamMap.values()
for(var value of valueIter){
    console.log("value: " +value)
}
   


    let totalMap = new Map()
    
    

    console.log(teamMap)

    AllocRandomNumber(arr)
    CreateRandomTeam(teamArr,MAXTEAMNUM)
    CheckWinner(arr,winnerArr,MAXTEAMNUM)
    console.log(totalMap)
    
    

    return (
        <div className="ProbRefactoring">
            <p>ProbRefactoring</p>
        </div>
    )
}

export default ProbRefactoring