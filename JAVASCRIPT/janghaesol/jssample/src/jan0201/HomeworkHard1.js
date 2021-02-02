function HomeworkHard1() {
    class userFindNum{
        constructor(findPointNum){
            this.findPointNum = findPointNum
        }
    
    get findPointNum(){
        return this.findPointNum
    }

    set findPointNum(findNum){
        {   
            this.findPointNum = findNum < 0? 0 : findNum
        }
    }
}
    let user = new userFindNum(20)//setter,getter 에게 돌아가게 20을 입력

    class startFindNum extends userFindNum{
        constructor(){
            super();
            numFindMath()
        }
    }
function numFindMath(findNum) {
    let findMax = findNum -3
    let startArr = [1,1,1]
    for(let i = 0 ; i < findMax; i++){
        let plusNum = startArr[i] + startArr[i+1] + startArr[i+2]
        startArr = [...startArr,plusNum]
            
            if(i === (findMax-1)){
                findNum = plusNum
            }
            
            console.log(startArr)
            console.log((i+4)+"번째 수는 = "+plusNum)
    }
    
    console.log("찾는 20번째 수는 = " + findNum)
}
    return(
        <div className = "HomeworkHard1">
            <p>
            HomeworkHard1
            </p>
    
        </div>
        )
}


export default HomeworkHard1
