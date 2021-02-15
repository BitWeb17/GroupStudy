const RandomTeam = () => {
    let aTeam = [
        "고동영", "장해솔", "류슬기", "박재민", "한다은",
        "최현정", "오진욱", "조진형", "이정현"
    ]
    let bTeam = [
        "이범진", "박소현", "탁성진", "노찬욱", "박기범",
        "하진주", "이승윤", "최임식"
    ]

    let lenA = aTeam.length
    let lenB = bTeam.length

    let team1 = []
    let team2 = []
    let team3 = []
    let team4 = []

    const ERROR = -1
    //a팀 1조 구하는 방법.. 그럼 나머지는?
    for(let i = 0;i <5;){
        let tm = Math.floor(Math.random() * lenA)
        if (team1.indexOf(aTeam[tm]) == ERROR) {
            team1.push(aTeam[tm])
            console.log("A조 1팀 : %s",team1[i++])
        }
    // else if 를 사용하고싶었는데 그렇다면 4,5  5,4명은 어찌 구별하지??
    }
    for(let i = 0;i <4;){
        let tm = Math.floor(Math.random() * lenA)
        if (team1.indexOf(aTeam[tm]) == ERROR && team2.indexOf(aTeam[tm]) == ERROR) {
            team2.push(aTeam[tm])
            console.log("A조 2팀 : %s",team2[i++])
        }
    }

    for(let i = 0;i <4;){
        let tm = Math.floor(Math.random() * lenB)
        if (team3.indexOf(bTeam[tm]) == ERROR) {
            team3.push(bTeam[tm])
            console.log("B조 1팀 : %s",team3[i++])
        }
    }
    for(let i = 0;i <4;){
        let tm = Math.floor(Math.random() * lenB)
        if (team3.indexOf(bTeam[tm]) == ERROR && team4.indexOf(bTeam[tm]) == ERROR) {
            team4.push(bTeam[tm])
            console.log("B조 2팀 : %s",team4[i++])
        }
    }

    return(
        <div className="RandomTeam">
            <p>
                날것의 코딩 랜덤팀 생성
            </p>
        </div>
    )
}
export default RandomTeam