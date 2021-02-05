class IteratorManager {
    constructor(){
        this.itrData = []
    }
    add(data){
        this.itrData.push(data)
    }
    [Symbol.iterator](){
        return this.itrData.values()
    }
}

const IteratorTest3 = () => {
    let itrMgr = new IteratorManager()
    itrMgr.add("three")
    itrMgr.add("seven")
    itrMgr.add("nine")

    for(let entry of itrMgr){
        console.log(entry)
    }
    
    return(
        <div className = "IteratorTest3">
            <p>IteratorTest3</p>
        </div>
    )

}

export default IteratorTest3