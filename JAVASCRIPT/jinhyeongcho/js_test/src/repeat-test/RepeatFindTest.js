const RepeatFindTest = () => {
    let seq = [1,2,3,4,5]
    let firstFind = seq.find(findFunc)
    // 구간에 맞는 최초값

    function findFunc(value){
        return value >2
    }
    console.log("Afrer Find(): " + firstFind)

    let firstFindIdx = seq.findIndex(findIdxFunc)

    function findIdxFunc(value){
        return value >4
    }

    console.log("Afrer FindIndex(): " + firstFindIdx)

    return(
        <div className="RepeatFindTest">
            <p>
                repeat-test : RepeatFindTest
            </p>
        </div>
    )
}
export default RepeatFindTest