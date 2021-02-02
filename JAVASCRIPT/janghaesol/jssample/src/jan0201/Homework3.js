// 2번 문제에서 중복을 허용하지 않고 5의 배수만 골라보자!
//     또한 고른 값들은 모두 내림차순으로 정렬되어야 할 것이다.

function Homework3() {
    

    let SPACEMAX = 10
    let MAXNUM = 30
    let MIN = 1
    let spaceRandNum = Math.floor(Math.random()*(SPACEMAX - MIN +1) + MIN)
    
    let randArr = []
    let pickedArr = []
    let trashArr = []
    let ERR = -1
    let flowArr = []

    function randValueF() {
        return Math.floor(Math.random() * (MAXNUM - MIN + 1) + MIN)
    }
    console.log("space의 값은" + spaceRandNum)
    for(let i = 0 ; i < spaceRandNum; i ++){
        let valueRand = randValueF()
        console.log(i+"번째 값은"+valueRand)

        if(randArr.indexOf(valueRand) == ERR  ){
            randArr.push(valueRand)
            console.log(randArr)
        }else{
            console.log("중복으로 처리되지 않은 값은: " +valueRand)
        }
    }
    
    console.log(randArr)
    
    for(let j = 0 ; j < randArr.length; j++){
        
        if(randArr[j]%5 == 0){
            pickedArr.push(randArr[j])
        }
    }
    flowArr = pickedArr.sort((a,b) => b - a)
    console.log(pickedArr)
    console.log(flowArr)
    if(flowArr.indexOf(flowArr[0]) == ERR){
        console.log("표시할 5의 배수의 값이 없습니다.")
    }else{
        console.log("뽑힌 랜덤값중 5의 배수는 : " + flowArr)
    }
    return(
        <div className = "Homework3">
            <p>
                Homework3
            </p>
    
        </div>
        )
    }
    
    export default Homework3