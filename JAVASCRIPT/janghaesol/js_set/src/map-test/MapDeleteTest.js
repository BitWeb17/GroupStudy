const MapDeleteTest = () => {
    let mapData = new Map(
        [
            ["apple","red"], ["grape","purple"]
        ]
    )
    console.log(mapData) 
//Map {"apple" => "red", "grape" => "purple"}    
    mapData.delete("apple")
    
    console.log(mapData)
//Map {"grape" => "purple"}
    mapData.clear()

    console.log(mapData)
//Map {}
    return(
        <div className = "MapDeleteTest">
            <p>MapDeleteTest</p>
        </div>
    )

}

export default MapDeleteTest