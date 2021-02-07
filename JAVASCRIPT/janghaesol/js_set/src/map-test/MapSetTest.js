const MapSetTest = () => {
    let mapData = new Map(
        [
            ["apple","red"], ["grape","purple"]
        ]
    )
    console.log(mapData)
//Map {"apple" => "red", "grape" => "purple"}
    mapData.set("test1","blue")
    mapData.set("test2","green")
    
    console.log(mapData)
    //Map {"apple" => "red", "grape" => "purple",
    // "test1" => "blue", "test2" => "green"}
    
    console.log(mapData.get("test2"))//green
    console.log(mapData.get("grape"))//purple
    console.log(mapData.has("test1"))//true
    console.log(mapData.has("apple"))//true
    
    return(
        <div className = "MapSetTest">
            <p>MapSetTest</p>
        </div>
    )

}

export default MapSetTest