// 연습 문제: 팀 로또
// 참가자는 총 1000명이다.
// 참가자들은 이 로또 배틀에 참여하기 위해 각자 1000만원을 지불한다.
// 참가자들은 1 ~ 10000 사이의 숫자를 할당 받는다.
// 팀원은 랜덤하게 4명씩 짝을 짓는다.(총 250팀)
// 로또 당첨은 1013의 배수를 뽑은 사람이 이긴 것으로 간주한다.

// 배당금은 아래 원칙에 따라 지급한다.
// 모든 팀원이 로또에 당첨된 경우: 승리 수당 배수가 2^4 16배
// 팀원중 3명이 당첨된 경우 8배
// 팀원중 2명이 당첨된 경우 4배
// 팀원중 1명이 당첨된 경우 원래 수당만큼
const Exercise4 = () => {
    const ZERO = 0
    const BASE_RANGE = 10000
    const START = 1

    const TOTAL_GAMBLER = 1000
    const BET = 10000000
    const COMMISSION = 0.33
    const TOTAL_PRIZE = (TOTAL_GAMBLER * BET) - (TOTAL_GAMBLER * BET) * COMMISSION
    const WIN_NUM = 1013
    const TEAM_OF = 4
    const TEAM_NUM = TOTAL_GAMBLER / TEAM_OF

    let gamblersArr = []
    let team = []
    let checkedTeam = []

    let lottoNum;

    function calcDividend() {
        // 하나라도 뽑은 팀의 팀번호가 담긴 배열
        let winTeam = []
        checkedTeam.forEach((item, index) => {
            if (item > ZERO) winTeam.push(index)
        })
        console.log(winTeam)

        // WIN_NUM을 뽑은 팀이 각각 몇명이 뽑았는지에 대한 배열
        let winNum = checkedTeam.filter(item => item > ZERO)
        console.log(winNum)

        // 각 지분이 담긴 배열 배당이 1명당 2배씩 늘어남
        let dividend = winNum.map(item => Math.pow(2, item))
        console.log(dividend)

        // 총 지분
        let totalDividend = dividend.reduce((sum, current) => sum + current, ZERO)

        for (let i = 0; i < winTeam.length; i++) {
            console.log(
                `${winTeam[i]}팀 상금: ${TOTAL_PRIZE * (dividend[i] / totalDividend)}원`
            )
        }
    }

    function checkWinner() {
        let winCnt = ZERO

        for (let i = ZERO; i < TEAM_NUM; i++) {

            team[i].forEach(lottoNum => {
                if (!(lottoNum % WIN_NUM)) {
                    winCnt++
                }
            })
            checkedTeam[i] = winCnt
            winCnt = 0
        }

        console.log(checkedTeam)
    }

    function allocNum() {
        for (let i = ZERO; i < TOTAL_GAMBLER; i++) {
            lottoNum = Math.floor((Math.random() * BASE_RANGE) + START)
            gamblersArr[i] = lottoNum
        }
    }

    function allocTeam() {
        let randNum

        function sortFunc(a, b) {
            randNum = Math.floor((Math.random() * 3) - START)

            a = randNum
            b = randNum

            return a + b
        }

        gamblersArr.sort(sortFunc)

        console.log(gamblersArr)

        for (let i = 0; i < TEAM_NUM; i++) {
            team[i] = gamblersArr.splice(ZERO, 4)
            console.log(team[i])
        }
    }

    allocNum()
    allocTeam()
    checkWinner()
    calcDividend()


    return (
        <div className="Exercise4">
            <p>
                Exercise4
            </p>
        </div>
    )
}

export default Exercise4