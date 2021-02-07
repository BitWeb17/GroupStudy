const AllocRandomNumber = (map) => {
    let gamblerArr = map.get("gambler")

    for (let i = 0; i < gamblerArr.length; i++) {
        gamblerArr[i] = (Math.floor(Math.random() * 10000) + 1)
    }
}

const CreateRandomTeam = (map) => {
    const MAXTEAMNUM = 4

    let teamArr = map.get("team")
    let gamblerArr = map.get("gambler")

    console.log(teamArr)
    console.log(gamblerArr)

    let randNum
    let range = teamArr.length

    for (let i = 0; i < gamblerArr.length; ) {
        randNum = Math.floor(Math.random() * range)

        if (teamArr[randNum].length == MAXTEAMNUM) {
            continue
        } else {
            teamArr[randNum].push(gamblerArr[i])
            i++
        }
    }

    console.log(JSON.stringify(teamArr))
}

const CheckWinner = (map) => {
    const CRITERIA = 1013

    let gamblerArr = map.get("gambler")
    let winnerArr = map.get("winner")

    for (let i = 0; i < gamblerArr.length; i++) {
        if (!(gamblerArr[i] % CRITERIA)) {
            winnerArr[i] = 1
        } else {
            winnerArr[i] = 0
        }
    }
}

Array.prototype.arrDivide = function(num) {
    let arr = this
    let len = arr.length

    let cnt = Math.ceil(len / num)

    let newArr = []

    for (let i = 0; i < cnt; i++) {
        newArr.push(arr.splice(0, num))
    }

    return newArr
}

const CalcDividend = (map, price) => {
    const ALL = 16
    const THREEFOUR = 8
    const TWOFOUR = 4
    const ZERO = 0

    let gamblerArr = map.get("gambler")
    let winnerArr = map.get("winner")
    let teamArr = map.get("team")

    let divWinArr = winnerArr.arrDivide(teamArr[ZERO].length)

    let teamNum = divWinArr.length
    let allClearRateArr = new Array(teamNum)
    let subClearRateArr = new Array(teamNum)

    for (let i = ZERO; i < teamNum; i++) {
        allClearRateArr[i] = divWinArr[i].every(allClear)
        subClearRateArr[i] = divWinArr[i].reduce(subClear)
    }

    function allClear(value) {
        return value > ZERO
    }

    function subClear(total, value) {
        return total + value
    }

    let dividendRate = allClearRateArr.reduce(checkTrueNum)

    function checkTrueNum(total, value) {
        if (value == true) {
            return total + ALL
        } else {
            return total
        }
    }

    dividendRate += subClearRateArr.reduce(allSum)

    function allSum(total, value) {
        return total + value
    }

    let dividend = Math.round(price / dividendRate)
}

const Exercise5 = () => {
    const MAXTEAMNUM = 4
    const NUMOFPERSON = 1000
    const TEAMNUM = NUMOFPERSON / MAXTEAMNUM
    const FEE = 10000000
    const PARTICIPANTSTAKE = 0.67
    const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE

    console.log("상금 = " + PRICE)

    let gamblerArr = new Array(NUMOFPERSON)
    let teamMap = new Map()
    let teamArr = new Array(TEAMNUM)

    for(let i = 0; i < TEAMNUM; i++) {
        teamArr[i] = new Array()
    }

    let winnerArr = new Array(NUMOFPERSON)

    teamMap.set("gambler", gamblerArr)
    teamMap.set("team", teamArr)
    teamMap.set("winner", winnerArr)

    AllocRandomNumber(teamMap)

    CreateRandomTeam(teamMap)

    CheckWinner(teamMap)

    CalcDividend(teamMap, PRICE)

    return (
        <div className="Exercise5">
            <p>
                Exercise5
            </p>
        </div>
    )
}

export default Exercise5