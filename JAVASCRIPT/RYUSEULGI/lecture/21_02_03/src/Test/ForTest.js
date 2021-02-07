import React from 'react'

class IteratorManager {
    constructor() {
        this.iterData = [];
    }
    add(data) {
        this.iterData.push(data);
    }
    [Symbol.iterator]() {
        return this.iterData.values();
    }
}

const ForTest = () => {

    let mapData = new Map([
        ['david', 'good'],
        ['bob', 'nice'],
        ['kavin', 'bad'],
        ['lily', 'lovely'],
    ])

    console.log(mapData);

    for( let data of mapData){
        console.log(data);
    }

    let setData = new Set([
        ['david', 'bob', 'kavin', 'lily']
    ])

    for(let data of setData){
        console.log(data);
    }

    // --------------------------------
    
    let iterData = ['one', 'two', 'three'];

    for(let entry of iterData){
        console.log(entry);  // one two three
    }

    let varData = ['four', 'five', 'six'];

    let itr = varData[Symbol.iterator]();

    console.log(itr.next());  // {value: "four", done: false}
    console.log(itr.next());
    console.log(itr.next());
    console.log(itr.next()); // {value: undefined, done: true}

    let varItr = varData.values();  // Symbol을 사용한 것과 .values를 직접 한것과 결과가 같다

    console.log(varItr.next());
    console.log(varItr.next());
    console.log(varItr.next());
    console.log(varItr.next());

    // --------------------------------

    itr = varData[Symbol.iterator]();
    let current = itr.next();

    while( ! current.done){
        console.log(current.value);   // four five six
        current = itr.next();        
    }

    // --------------------------------

    const itrMgr = new IteratorManager();
    itrMgr.add('three');
    itrMgr.add('seven');
    itrMgr.add('nine');
    
    for(let entry of itrMgr){
        console.log(entry);   // three seven nine
    }

    return (
        <div>
            
        </div>
    )
}

export default ForTest
