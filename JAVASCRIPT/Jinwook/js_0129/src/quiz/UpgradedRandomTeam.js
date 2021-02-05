const UpgradedRandomTeam = () => {
    let team = [
        "최현정", "오진욱", "류슬기", "장해솔", "조진형",
        "이정현", "고동영", "박재민", "한다은",
        "최임식", "탁성진", "하진주", "이범진", 
        "이승윤", "박기범", "박소현", "노찬욱"
    ];
    let len = team.length

    let resArr = []
    
    const START = 0
    const TEAMNUM = 4

    // 랜덤하게 중복하지 않고 추출하는 방법 -> 찾다가 정렬로 하는 쉬운방법이 있길래 써봤습니다.
    let randArrIdx = team.sort(function(a, b){return 0.5 - Math.random()});
  
    let teamRateIdx

    let i
    let j
    let teamRate = len / TEAMNUM
    console.log(randArrIdx.length) //17개의 방
    console.log(randArrIdx)

    

    for(i = START; i < TEAMNUM; i++){ //4개 짜리 배열 생성 for 4개의 팀으로 나누기 위해
        teamRateIdx = [i]
        
        
        // 이부분을 floor를 주면 걑은 수로 나누고 한명이 남거나 없을 때만 된다
        // 이부분을 round를 주면 몇명이 없어도 가능하지만 남는 부분에 undefined가 뜸.. 이문제를 해결해야 할것같다
        for(j = START; j < Math.floor(teamRate); j++){ // 그 4개의 팀에 팀원수 / 팀개수 명의 사람 수 넣기 
            teamRateIdx.push(randArrIdx.pop()); // .pop() = 배열의 마지막 요소 제거 -> 제거한 요소를 teamRateIdx에 push하기
            console.log("teamRateIdx: " + teamRateIdx) // 뒤에서 부터 땡겨져서 나옴
        }
        resArr.push(teamRateIdx) // 
        
       
    }
    console.log(resArr)
    console.log("randArrIdx.length: "+randArrIdx.length)

    let cnt = Math.floor(Math.random() *(TEAMNUM-1));

    while(randArrIdx.length){
        
        resArr[cnt].push(randArrIdx.pop());
        cnt++
        if(cnt >= randArrIdx.length){
            cnt = 0;
        }
        for(cnt = START; cnt < TEAMNUM; cnt++){
        console.log((cnt+1)+' team: '+resArr[cnt].join()+'\n')
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