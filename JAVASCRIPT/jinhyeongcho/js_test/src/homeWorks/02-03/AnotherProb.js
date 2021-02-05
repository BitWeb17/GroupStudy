const AllocRandomNumber = (num) => {
    console.log("AllocRandomNumber Called")

    let arr = new Array(num)
    let set = new Set(arr)
    for(var i = 0;i < arr.length ; i++) {
        arr[i]= (Math.floor(Math.random() * 10000) + 1)
    }
    for (var i = 0;i < arr.length ; i++) {
        set.add(arr[i])
    }
    console.log(set)
    // 이렇게 하면 num까지만 수행해서 중복은 없지만 1000개 값이 안나온다...
}

const CheckTeamArrCount = (arr) => {
    const TEAMMEMNUM = 4
}

const CreateRandomTeam = (arr, num) => {
    console.log("CreateRandomTeam Called")

    const ERROR = -1
    let randNum
    let range = arr.length / num

    let checkTeamArrCnt = new Array(250)

    // 같은 팀원들에게 같은 숫자를 부여하겠다는 의미(250개가 나오니까)
    for(var i = 0; i < range; ) {   // 250
        // 1번팀, 2번팀, 3번팀 ...
        randNum = Math.floor(Math.random() * 250) + 1

        if(arr.indexOf(randNum) == ERROR) {
            for (var j = 0; j < num; j++) {   // 4

                arr[i * num + j] = randNum
            }

            i++
        }
    }
}

const CheckWinner = (arr, winArr) => {
    const CRITERIA = 1013
    for(var i = 0; i < arr.length; i++) {
        if(!(arr[i] % CRITERIA)) {
            winArr[i] = 1
        } else {
            winArr[i] = 0
        }
    }
}

Array.prototype.arrDivide = function (num) {
    let arr = this
    let len = arr.length
    let cnt = Math.ceil(len / num)

    let newArr = []

    for(var i = 0; i < cnt; i++) {
        newArr.push(arr.splice(0, num))
    }

    return newArr
}

Array.prototype.printArr = function(num) {
    let arr = this
    let len = arr.length

    for (var i = 0; i < len; i += num) {
        console.log(arr[i], arr[i + 1], arr[i + 2], arr[i + 3])
    }
}

const CalcDividend = (teamArr, winArr, price) => {
    const ALL = 16
    const THREEFOUR = 8
    const TWOFOUR = 4
    const ZERO = 0

    const TEAMMEMNUM = 4

    // filter, every
    let divWinArr = winArr.arrDivide(TEAMMEMNUM)

    let teamNum = divWinArr.length
    let allClearRateArr = new Array(teamNum)
    let subClearRateArr = new Array(teamNum)

    for(var i = ZERO; i < teamNum; i++) {
        allClearRateArr[i] = divWinArr[i].every(allClear)
        subClearRateArr[i] = divWinArr[i].reduce(subClear)
    }

    function allClear(value) {
        return value > ZERO
    }

    function subClear(total, value) {
        return total + value
    }

    console.log('All Clear Team: ' + allClearRateArr)
    console.log('Sub Clear Team: ' + subClearRateArr)


    let dividendRate = allClearRateArr.reduce(checkTrueNum)

    function checkTrueNum(total, value) {
        if(value == true) {
            return total + ALL
        } else {
            return total
        }
    }

    console.log("All Clear Dividend Rate = " + dividendRate)

    dividendRate += subClearRateArr.reduce(allSum)

    function allSum(total, value) {
        return total + value
    }

    console.log("Total Dividend Rate = " + dividendRate)

    let dividend = Math.round(price / dividendRate)

    console.log("1배수 배당금은 " + dividend + "입니다.")
    console.log("인당 배당금은 " +
        Math.round(dividend / TEAMMEMNUM) + "입니다.")

    console.log("4배수 배당금은 " + TWOFOUR * dividend + "입니다.")
    console.log("인당 배당금은 " +
        Math.round(TWOFOUR * dividend / TEAMMEMNUM) + "입니다.")

    console.log("8배수 배당금은 " + THREEFOUR * dividend + "입니다.")
    console.log("인당 배당금은 " +
        Math.round(THREEFOUR * dividend / TEAMMEMNUM) + "입니다.")

    console.log("16배수 배당금은 " + ALL * dividend + "입니다.")
    console.log("인당 배당금은 " +
        Math.round(ALL * dividend / TEAMMEMNUM) + "입니다.")
}


const AnotherProb = () => {
    const MAXTEAMNUM = 4
    const NUMOFPERSON = 1000
    const FEE = 10000000
    const PARTICIPANTSTAKE = 0.67
    const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE

    console.log("상금 = " + PRICE)

    let teamArr = new Array(NUMOFPERSON)
    let WinnerArr = new Array(NUMOFPERSON)

    AllocRandomNumber(NUMOFPERSON)

/*    CreateRandomTeam(teamArr, MAXTEAMNUM)
    console.log("After CreateRandomTeam() = " + teamArr)

    CheckWinner(arr, WinnerArr)
    console.log("After CheckWinner() = " + WinnerArr)

    CalcDividend(teamArr, WinnerArr, PRICE)
    console.log("팀 로또가 성공적으로 마무리 되었습니다.")
    console.log("다음에도 잘 부탁드립니다 호갱님 ^^")*/

    return (
        <div className="AnotherProb">
            <p>AnotherProb</p>
        </div>
    )
}
export default AnotherProb


// 1) 참가자는 총 1000명이다 ---> 배열 1000개 필요
//  new array(1000) 으로 배열 size 1000개 생성.
// 2) 참가자들은 1 ~ 10000 사이의 숫자를 할당 받는다 ---> 랜덤 사용해야함
//        arr[i]= (Math.floor(Math.random() * 10000) + 1) 1000개의 값이 중복되어 나타남.....
//      그렇다면 여기서 set을 이용하여 중복이 없이 arr.size 만큼의 값을 할당한다면?
//      1000개의 중복없는 값 할당.
// 4) 로또 당첨은 1013의 배수를 뽑은 사람이 이긴것으로 간주한다
//    ---> 2번에서 사용한 랜덤이 1013의 배수인지 판정이 필요함
//         ---> 추가적인 배열을 할당했음(1000개) map을 이용해 추가한 배열에 map.values()
//              value & 1013==0 인 값을 1 아닌값을 0으로 표시해서
//              --->{0,0,0,0,1,0,...,0} 1000개 할당.
// 3) 팀원은 랜덤하게 4명씩 짝을 짓는다(총 250개의 팀) ---> {0,~,999}의값을
//    for(let i =0;i<arr.length; i +=size){
//         arr2.push((arr.slice(i,i+size)))   slice로 4개씩 뽑아 250를 만든다.
//       slice면 새로 복사해서  250개의 array를 뽑을거라 생각...
// 5) 배당금 원칙 ---> 팀의 4명이 모두 1013의 배수라면 16배
//              ---> 팀원중 3명이 1013의 배수면 8배
//              ---> 팀원중 2명이 1013의 배수면 4배
//              ---> 팀원중 1명만 1013의 배수면 1배
//                   ---> filter, reduce 등을 통해 전체 분할 비율을 계산

// 관리의 용이성을 위해 map을 도입했음
// 1), 3), 4)에 배열들을 map에 넣고 나머지는 동일함