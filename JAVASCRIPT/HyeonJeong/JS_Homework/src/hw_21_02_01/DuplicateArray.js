const DuplicateArray = () => {
    const BAEK = 100
    const ONE = 1
    const arr = []
    const pick = []

    class RandomArray {
        constructor(number, mulNum) {
            console.log('constructor called');
            this.number = number
            this.mulNum = mulNum
        }

        getNumber() {
            return this.number
        }

        getMulNum() {
            return this.mulNum
        }

        setRandomArray() {
            console.log('setting random array...');
            for(let i = 0; i <  this.number; i++) {
                let randomNum = Math.floor(Math.random() * BAEK + ONE)
                arr.push(randomNum)
                console.log(`arr[${i + 1}] = ${randomNum}`)
            }
            console.log(`random array : ${arr}`);
            return arr
        }

        pickUpMulNum() {
            console.log('picking up numbers...');
            for(let i = 0; i < this.number; i++) {
                if(arr[i] % 3 === 0) {
                    pick.push(arr[i])
                    console.log(arr[i])
                }
            }
            console.log(`pick done : ${pick}`)
            console.log(`pick.length = ${pick.length}`)
            return pick
        }
    }

    const randomArray = new RandomArray(20,3)

    return (
        <div className = "DuplicateArray">
            <p>
                Homework02<br/><br/>
                자바스크립트 배열에 랜덤한 숫자를 n개 생성한다.<br/>
                n개의 배열에서 3의 배수만 골라보도록 하자!<br/>
                (이 문제는 중복을 허용한다)<br/><br/>
                {`랜덤한 숫자 ${randomArray.getNumber()}개 생성 
                = ${randomArray.setRandomArray()}`}<br/>
                {`${randomArray.getMulNum()}의 배수 고르기 
                = ${randomArray.pickUpMulNum()}`}<br/>
            </p>
        </div>
    )
}

export default DuplicateArray

// 실행결과 콘솔에 나오는 결과와 브라우저에 출력되는 결과가 다르게 나왔다..
// 도대체 왜??? 이거하느라 다른거 시간을 다 써버렸다;; 현재시간 04:03..
// 아무리 검색을 해봐도 모르겠다;; 4시간 정도는 자야할 것 같아서 여기서 stop.. 