function RandomPick() {
    const A = ["최현정", "장해솔", "박재민", "고동영", "류슬기",
             "조진형", "오진욱", "이정현", "한다은"]

    const B = ["노찬욱", "박소현", "박기범", "최임식",
             "탁성진", "하진주", "이승윤", "이범진"]


    divideTeam(mixGroup(A));

    divideTeam(mixGroup(B));

    return (
        <div className="RandomPick">
            <p>
                RandomPick
            </p>
        </div>
    )
}

let randNum;

function mixGroup(arr) {
    let teamArr = []

    for (;;) {
        randNum = Math.floor(Math.random() * arr.length)

        if (teamArr.includes(arr[randNum])) {
            continue;
        } else {
            teamArr.push(arr[randNum])
        }

        if (teamArr.length == arr.length) break;
    }

    return teamArr
}

function divideTeam(arr) {

    if (arr.length % 2) {
        randNum = Math.floor((Math.random() * 2) + Math.floor(arr.length / 2))
        console.log("1팀: " + arr.slice(0, randNum))
        console.log("2팀: " + arr.slice(randNum))
    } else {
        console.log("3팀: " + arr.slice(0, (arr.length / 2)))
        console.log("4팀: " + arr.slice((arr.length / 2)))
    }
}

export default RandomPick