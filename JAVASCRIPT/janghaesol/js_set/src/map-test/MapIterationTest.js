const MapIterationTest = () => {
    let mapData = new Map(
        [
            ["apple","red"], ["grape","purple"]
        ]
    )
    console.log("")
    console.log(mapData)
//Map {"apple" => "red", "grape" => "purple"}
    var keyIter = mapData.keys()

        //key는 map안에 key가 되는 값을 말함
    for(var key of keyIter){
        console.log(key)
        //apple
        //grape
    }
    
    var valueIter = mapData.values()
        //value는 map안에 key가 지칭하는 값을 말함
    for (var value of valueIter){
        console.log(value)
        //red
        //purple

    }

    var entryIter = mapData.entries()
        //entry는 요소 전체를 말함
    for(var entry of entryIter){
        console.log(entry)
        // ["apple","red"]
        // ["grape","purple"]
    }
            
    mapData.forEach((value , key) => 
        console.log(key+":"+value))
        //apple:red
        //grape:purple

    return(
        <div className = "MapIterationTest">
            <p>MapIterationTest</p>
        </div>
    )

}

export default MapIterationTest