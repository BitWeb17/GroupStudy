const AllocRandomNumber = (num) => {
    console.log("AllocRandomNumber Called")
    let arr = new Set()
    for(var i = 0; i < num; i++) {
        arr.add(Math.floor(Math.random() * 10000) + 1)
    }
    console.log(arr)
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


const ProbSolved = () => {
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
        <div className="Prob">
            <p>Prob</p>
        </div>
    )
}
export default ProbSolved