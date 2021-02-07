const MapSetTest = () =>{
    console.log("MapSetTest Start")
    let mapData = new Map(
        [
            ["apple","red"],["grape","purple"]
        ]
    )
    let test = { name : "ted"}
    let mapmap ={}
    mapmap[test]=30
    console.log(mapmap)
    console.log(mapmap["[object Object]"])
    console.log(mapData)

    mapData.set("test1","blue")
    mapData.set("test2","green")

    console.log(mapData)
    console.log(mapData.get("test2"))
    console.log(mapData.get("grape"))
    console.log(mapData.has("test1"))
    console.log(mapData.has("apple"))

    console.log("MapSetTest Fin")
    return(
        <div className="MapSetTest">
            <p>
                MapSetTest
            </p>
        </div>
    )
}
export default MapSetTest