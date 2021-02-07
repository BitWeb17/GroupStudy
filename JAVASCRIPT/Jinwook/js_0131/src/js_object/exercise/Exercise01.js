// 아래와 같은 수열이 있다
// 1,1,1,3,5,9,17,31,57,105,193,......
// 이 수열의 20번째 값을 구하시오
const Exercise01 = () => {
    let resArr = [1,1,1]
    class MySerise{
        constructor(num){
            this._num = num
        }
        getNum(){
            return this._num
        }
        setNum(num){
            this._num = num
        }
        errorDisplay(){
            if(this._num <= 0 ){
                console.log("입력하신 %d 는 잘못된 값입니다.",this._num)
            

            }else{
                console.log("%d번째 값은? ",this._num)
            }
            
        }
       allocArray(){
           
           let len = this._num
           console.log("같은 값 배열 "+resArr)
           console.log("배열의 길이" + len)
           for(let i = 3; i < len; i++){
               resArr[i] = resArr[i-1]+ resArr[i-2]+ resArr[i-3]
           }
           console.log(resArr)
        }
        printArray(){
            let printNum = resArr.pop()
            console.log("%d 번째 항의 값은: %d",this._num, printNum)
           
        }
}
        

    let ms = new MySerise(20)
    ms.errorDisplay()
    ms.allocArray()
    ms.printArray()
    

    return (
        <div className="Exercise01">
            <p>
            Exercise01
            </p>
        </div>
    )
}

export default Exercise01