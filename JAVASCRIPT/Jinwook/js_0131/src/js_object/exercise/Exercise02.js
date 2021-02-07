// 자바 스크립트 배열에 랜덤한 숫자를 n개 생성한다
// n개의 배열에서 3의 배수만 골라보도록 하자

// 2번 문제에서 중복을 허용하지 않고 5의 배수만 골라보자
// 또한 고른 값들은 모두 내림차순으로 정렬되어야 할 것이다.
const Exercise02 = () => {
    let randArrIdx1 = []
    let randArrIdx2 = []
    let final3randArr = []
    let final5randArr = []
    
    let randNum = []

    const INIT = 1;
    const START = 0;
    
    let sortedArr

    class randArr{
        
        constructor(num){
            this._num = num
        }
        getRandNum(){
            return this._num
        }
        setRandNum(num){
            this._num = num

        }

        alloc3RandArr(){
            let randLen = Math.floor(Math.random() * (this._num))
            for(let i = START; i < randLen ; i++){
                randNum[i] = Math.floor(Math.random() * (this._num)) + INIT
                randArrIdx1.push(randNum[i])
                if(randNum[i] % 3 == 0 ){
                    final3randArr.push(randNum[i])
                    }
                }

            }
            alloc5RandArr(){
                let randLen = Math.floor(Math.random() * (this._num))
                
                
                // 5의 배수 내는 것을 구현 못함
                for(let i = START; i < randLen;){
                randNum[i] = Math.floor(Math.random() * (this._num)) + INIT
                if(randArrIdx2.indexOf(randNum[i]) == -1){
                    randArrIdx2.push(randNum[i])
                        console.log("중복 없는 랜덤값: " + randArrIdx2[i++])
                        if(randArrIdx2[i] % 5 == 0){
                            final5randArr.push(randArrIdx2[i])
                            console.log("5의 배수" + final5randArr[i++])
                    }
                    
                    }
                    

                    }
                }

        print3RandArr() {
            console.log("randArrIndx:  " + randArrIdx1)
            console.log("3의 배수: " + final3randArr)
        }
        print5RandArr(){
            
            // console.log("5의 배수: " + final5randArr)
            sortedArr = final5randArr.sort((a, b) => a - b)
            console.log("Sorted5Arr: " + sortedArr)
            
           
        }
    }
    let ra = new randArr(20)
    ra.alloc3RandArr()
    ra.print3RandArr()
    let ra2 = new randArr(30)
    ra.alloc5RandArr()
    ra.print5RandArr()

    return (
        <div className="Exercise02">
            <p>
            Exercise02
            </p>
        </div>
    )
}

export default Exercise02