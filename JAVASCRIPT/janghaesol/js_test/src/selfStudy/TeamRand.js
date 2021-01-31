function TeamRand(){
    
    var allMemberA = [ "고동영", "장해솔", "류슬기", "박재민", "한다은",
    "최현정", "오진욱", "조진형", "이정현"]

    let allMemberB = ["이범진", "박소현", "탁성진", "노찬욱",
    "박기범", "하진주", "이승윤", "최임식"]
    
    var resA = []
    const resB = []
    const first = []
    const second = []

    
    let teamARandNum =Math.floor(Math.random()*5)+4;
    const NUM = 4
    let i
        for(i = 0; i < 2;){
            const newRandom =Math.floor(Math.random()*9)
        //console.log("randNUm: " + teamARandNum)
        first.push(allMemberA[newRandom])
        var slicies = allMemberA.slice(newRandom,newRandom+1);
        resA.push(slicies)
}
        console.log("first: " + first)
        console.log("NewTeamA: " + resA)


        // if(teamARandNum == 5){
        // teamARandNum = Math.floor(Math.random()*allMemberA.length + 1)+1
        // first.push(allMemberA[teamARandNum])
        // allMemberA.splice(teamARandNum)
        // console.log("TeamA: " + first)
        // }else{
        // teamARandNum = Math.floor(Math.random()*allMemberA.length + 1)+1
        // first.push(allMemberA[teamARandNum])
        // allMemberA.splice(teamARandNum)
        // console.log("TeamA: " + first)
        // }

    
    
    
    return (
        <div className="TeamRand">
            <p>
            TeamRand
            </p>
        </div>
    )
    



}



// function TeamBRandom(){
    
    

//     while(NUM){
//         second.push(allMemberB[NUM]) ;
        
//     }
//     resB = allMemberB - second;

//     console.log ("TeamBRandom: " + second)
//     console.log ("TeamBRandom: " + resB)

    
// }


// function TeamARandom(){
    

    

//     for(i = 0; i <RandNum;){
//         first.push(allMemberA[RandNum])
//         console.log(first[i])
//     }

//     // while(RandNum){
//     //     first.push(allMemberA[RandNum]) ;
        
//     // }
//     resA = allMemberA - first;
    
//     console.log ("TeamARandom: " + first)
//     console.log ("TeamARandom: " + resA)
    
    
// }
    

    export default TeamRand