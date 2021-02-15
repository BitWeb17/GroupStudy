const RepeatFilterTest = () => {
    let seq = [1,2,3,4,5]
    // filter도 map과 유사 하지만
    // 특정한 값을 걸러낸다는 의미로 활용
    // 마찬가지로 seq에 있는 요소들을 모두 빼서 filterFunc으로 전달한다
    // 맵과 필터는 쓰레드 사용시 , 병렬구조 사용시 아주 좋음
    let over3 = seq.filter(filterFunc)
    
    function filterFunc(value) {
        return value > 3 
    }

    console.log("seq: " + seq)
    console.log("filterFunc: " + over3)

    return(
        <div className = "RepeatFilterTest">
            <p>
                repeat-test: RepeatFilterTest
            </p>
        </div>
    )
} 

export default RepeatFilterTest