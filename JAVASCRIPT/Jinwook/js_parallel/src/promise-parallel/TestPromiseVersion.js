function first() {
    return new Promise(function (resolve, reject) {
        var sum = 0
        
        for (var i = 0; i <= 100000000; i++) {
            sum += (i * 0.000000001) * Math.sin(i * Math.PI / 180.0)
        }

        resolve(sum)
    })
}

function second() {
    return new Promise(function (resolve, reject) {
        var sum = 0
        
        for (var i = 0; i <= 100000000; i++) {
            sum += (i * 0.00000001) * Math.cos(i * Math.PI / 90.0)
        }

        resolve(sum)
    })
}

function third() {
    return new Promise(function (resolve, reject) {
        var sum = 0
        
        for (var i = 0; i <= 100000000; i++) {
            sum += (i * 0.0000001) * Math.sin(i * Math.PI / 270.0)
        }

        resolve(sum)
    })
}

function fourth() {
    return new Promise(function (resolve, reject) {
        var sum = 0
        
        for (var i = 0; i <= 100000000; i++) {
            sum += (i * 0.000001) * Math.cos(i * Math.PI / 240.0)
        }

        resolve(sum)
    })
}

async function asyncProcess() {
    // 성능은 프로미스안쓰거와 비슷함 => 기본적으로 자바스크립트는 쓰레드를 지원함

    // 특성이 몇개 있다
    // 1) 자바스크립트 엔진이 파악하기에 분리가 가능한 수학 연산
    // 2) 행렬 연산, 벡터 연산(웹 게임 분야)
    // -> 이 두가지 연산이 아닌이상은 싱글코어로 작동함(수동으로 컨트롤 해줘야할 상황에는 프로미스 사용해야함)


    const res = await Promise.all(
        [
            first(),
            second(),
            third(),
            fourth()
        ]
    )

    console.log(res)
}

asyncProcess()

const TestPromiseVersion = () => {
    console.log("TestPromiseVersion Start")

    console.log("TestPromiseVersion End")

    return (
        <div className="TestPromiseVersion">
            <p>TestPromiseVersion</p>
        </div>
    )
}

export default TestPromiseVersion