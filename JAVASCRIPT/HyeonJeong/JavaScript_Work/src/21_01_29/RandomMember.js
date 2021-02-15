const RandomMember = () => {
    const NUMOFMEMBER = 17
    const ONE = 1
    const START = 0
    const ERROR = -1

    let randomNum
    let member = ["고동영", "장해솔", "류슬기", "박재민", 
                  "한다은", "최현정", "오진욱", "조진형", 
                  "이정현", "이범진", "박소현", "탁성진", 
                  "노찬욱", "박기범", "하진주", "이승윤", 
                  "최임식"]

    for(let i = START; i < NUMOFMEMBER; i++) {
        randomNum = (Math.random() * NUMOFMEMBER) + ONE;
        var count = 1

        if(member.indexOf(randomNum) == ERROR) {
            member.push(randomNum)
            count++

            if(count == 4) {
                console.log("[%s]",member[i])    
            }
        }
    }

    return(
        <div className = "RandomMember">
            <pre>
                RandomMember
                {member.join('\n')}
            </pre>
        </div>
    )
}

export default RandomMember