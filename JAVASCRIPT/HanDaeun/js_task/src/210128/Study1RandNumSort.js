/*
중복 없이 랜덤하게 생성한 숫자를 오름차순으로 정렬해보기
*/


function Study1RandNumSort() {
    const ZERO = 0;
    const ONE = 1;
    const START = 1;
    const END = 10;
    const numArr = [];
    let randNum;

    const range = END - START + ONE;

    console.log("< Study1RandNumSort >");
    console.log("정렬 전");

    for(var i = ZERO; i < END; ) {
        randNum = Math.floor(Math.random() * range) + START;

        if(!numArr.includes(randNum)) {
            numArr.push(randNum);
            console.log(numArr[i++]);
        }        
    }

    let x, y, key;

    for(x = ONE; x < END; x++) {
        key = numArr[x];

        for(y= x - ONE; y >= ZERO; y--) {
            if(numArr[y] > key) {
                numArr[y + ONE] = numArr[y];
            } else {
                break;
            }
        }
        numArr[y + ONE] = key;
    }    

    console.log("정렬 후");

    for(var i = ZERO; i < END; i++) {
        console.log(numArr[i]);
    }

    return (
        <div className="Study1RandNumSort">
        </div>
    )
}

export default Study1RandNumSort