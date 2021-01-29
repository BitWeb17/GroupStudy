const UpgradedRandomTeam = () => {
    let team = [
        "최현정", "오진욱", "류슬기", "장해솔", "조진형",
        "이정현", "고동영", "박재민", "한다은",
        "최임식", "탁성진", "하진주", "이범진",
        "이승윤", "박기범", "박소현", "노찬욱"
    ]


    let teamNum = 4;
    let len = team.length

    let res = []

    const ERROR = -1
    const START = 0
    const TEAMRATE = len % teamNum

    let randArrIndex
    let teamArr

    let i
    let cnt = 0;

    console.log(len)

    const allocRandomTeam = () => {

    for(i = START; i < len; ) {
        randArrIndex = Math.floor(Math.random() * len)

        //console.log("randArrIdx = " + randArrIdx)

        if(res.indexOf(team[randArrIndex]) == ERROR) {
            res.push(team[randArrIndex])
            cnt++
            console.log("res: %d - %s", i, res[i++])
        }
    }
    const divTeam =() => {
        if(len % teamNum !== 0){
            

        }

    }
        
      

}


    return (
        <div className="UpgradedRandomTeam">
            <p>
            UpgradedRandomTeam
            </p>
        </div>
    )
}

export default UpgradedRandomTeam