const RandomTeam = () => {
    let teamA = [
        "최현정", "오진욱", "류슬기", "장해솔", "조진형",
        "이정현", "고동영", "박재민", "한다은"
    ]
    let teamB = [
        "최임식", "탁성진", "하진주", "이범진",
        "이승윤", "박기범", "박소현", "노찬욱"
    ]

    let lenA = teamA.length
    let lenB = teamB.length

    let res1 = []
    let res2 = []

    const ERROR = -1

    let randArrIdx

    let i

    console.log(lenA)

    for(i = 0; i < lenA; ) {
        randArrIdx = Math.floor(Math.random() * lenA)

        //console.log("randArrIdx = " + randArrIdx)

        if(res1.indexOf(teamA[randArrIdx]) == ERROR) {
            res1.push(teamA[randArrIdx])
            console.log("res1: %d - %s", i, res1[i++])
        }
    }
    const newAGroup = (motherAG) => console.log("aGroup : " + motherAG)
    const newBGroup = (motherBG) => console.log("bGroup : " + motherBG)
    let AGROUPARRMAX =8
    let MAX=5
    let MIN=4                                  //+1을 하는 것은 지정한 최댓값을 출력하기위해
    const aGroupRandom = Math.floor(Math.random()*((MAX-MIN)+1))+MIN
    let firstAGroup = []
    let secondAGroup = []
    
    console.log(aGroupRandom)
    firstAGroup.push(res1.slice(0,aGroupRandom))//A조 1그룹으로 배열0번부터 랜덤까지 넣는다
    console.log("A조의 첫 번째 그룹 : " + firstAGroup)
    secondAGroup.push(res1.splice(aGroupRandom,AGROUPARRMAX))//A조 2그룹으로 랜덤부터 배열 8까지 넣는다.
    console.log("A조의 첫 번째 그룹 : " + secondAGroup)
    newAGroup(firstAGroup)
    newBGroup(secondAGroup)

    let BMAX =4
    for(i = 0; i < lenB; ) {
        randArrIdx = Math.floor(Math.random() * lenB)

        if(res2.indexOf(teamB[randArrIdx]) == ERROR) {
            res2.push(teamB[randArrIdx])
            console.log("res2: %d - %s", i, res1[i++])
        }
    }

    let BGROUPARRMAX =7
    let firstBGroup = []
    let secondBGroup = []
    firstBGroup.push(res2.slice(0,BMAX))//B조 1그룹으로 배열0번부터 3까지 넣는다
    console.log("B조의 첫 번째 그룹 : " + firstBGroup)
    secondBGroup.push(res2.splice(BMAX,BGROUPARRMAX))//B조 2그룹으로 랜덤부터 배열 7까지 넣는다.
    console.log("B조의 두 번쨰 그룹 : " + secondBGroup)

    newAGroup(firstBGroup)
    newBGroup(secondBGroup)

    return (
        <div className="RandomTeam">
            <p>
                Random Test
            </p>
        </div>
    )
}

export default RandomTeam