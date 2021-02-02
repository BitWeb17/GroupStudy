//아래와 같은 수열이 있다.
// 1, 1, 1, 3, 5, 9, 17, 31, 57, 105, 193, ......
// 이 수열의 20 번째 값을 구할 수 있도록 프로그래밍 해보자!

//마지막 3개를 더하면 다음 숫자가 됨.
//첫 배열 [1,1,1]을 만들고  
//for문을 돌려서 배열이 하나씩 증가하는 식을 만들고 
//찻번째 배열부터 돌려서 17번째 있는 숫자가 20번째 값(주의: 배열번호는 0부터니까 16번쨰 배열끝값)
//또는 for문을 돌면서 배열 뒤에 하나씩 ...arr, x로 붙인다.
function Homework1() {
    
    let startArr = [1, 1, 1]
    let findNum = 0
    let i = 0
    let MAX = 17



    for(i = 0 ; i < MAX; i++){
        let plusNum = startArr[i] + startArr[i+1] + startArr[i+2]
        startArr = [...startArr,plusNum]
            
            if(i === (MAX-1)){
                findNum = plusNum
            }
            
            console.log(startArr)
            console.log((i+4)+"번째 수는 = "+plusNum)
    }
    
    console.log("찾는 20번째 수는 = " + findNum)

    return(
        <div className = "Homework1">
            <p>
                Homework1
            </p>
    
        </div>
        )
}

export default Homework1
