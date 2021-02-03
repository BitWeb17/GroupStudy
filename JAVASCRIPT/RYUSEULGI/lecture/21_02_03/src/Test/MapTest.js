import React from 'react'

const MapTest = () => {
    
    let mapData = new Map([
        ['apple', 'red'], 
        ['banana', 'yellow']
    ]);

    console.log(mapData);  // Map(2) {"apple" => "red", "banana" => "yellow"}
    console.log(mapData.size); // 2

    mapData.set('test1', 'blue');
    mapData.set('test2', 'green');
    
    console.log(mapData); // Map(4) {"apple" => "red", "banana" => "yellow", "test1" => "blue", "test2" => "green"}
    console.log(mapData.get('test2'));  // vlaue가ㅄ을 return해서 보여준다 green
    console.log(mapData.has('test1'));  // true
    
    mapData.delete('apple');  
    console.log(mapData);  // Map(3) {"banana" => "yellow", "test1" => "blue", "test2" => "green"}

    mapData.clear(); 
    console.log(mapData);   // clear 된 것을 확인 가능

    mapData = new Map([
        ['apple', 'red'], 
        ['banana', 'yellow']
    ]);

    let keyVal = mapData.keys();

    for(let key of keyVal){
        console.log(key); // apple banana
    }

    keyVal = mapData.values();

    for(let value of keyVal){
        console.log('value' + value); // red yellow
    }

    keyVal = mapData.entries();

    for(let entry of keyVal){
        console.log(entry);   // key value 다 출력됨
    }

    return (
        <div>
            
        </div>
    )
}

export default MapTest