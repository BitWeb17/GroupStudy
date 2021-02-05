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

const IteratorTest = () => {
    let iterData = ["one","two","three"]

    for(let entry of iterData){
        console.log(entry)
        //one
        //two
        //three
    }
    let varData = ["four","five","six"]

    let itr = varData[Symbol.iterator]()

    console.log(itr.next())
    //{value: "four", done: false}
    console.log(itr.next())
    //{value: "five", done: false}
    console.log(itr.next())
    //{value: "six", done: false}
    console.log(itr.next())
    //{value: undefined, done: true}

    let varItr = varData.values()

    console.log(varItr.next())
    //{value: "four", done: false}
    console.log(varItr.next())
     //{value: "five", done: false}
    console.log(varItr.next())
    //{value: "six", done: false}
    console.log(varItr.next())
    //{value: undefined, done: true}
    
    
    return(
        <div className = "IteratorTest">
            <p>IteratorTest</p>
        </div>
    )

}


    




export default IteratorTest