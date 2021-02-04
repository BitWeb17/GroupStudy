const MapIterationTest = () => {
    console.log("---------MapIterationTest----------")
    let mapData = new Map([
        ["apple", "red"], ["grape", "purple"]
    ])

    console.log(mapData)

    let keyIter = mapData.keys()

    for (let key of keyIter) {
        console.log(key)
    }

    let valueIter = mapData.values()

    for (let value of valueIter) {
        console.log(value)
    }

    let entryIter = mapData.entries()

    for (let entry of entryIter) {
        console.log(entry)
    }

    mapData.forEach((value, key) => {
        console.log(key + " : " + value)
    })

    return (
        <div className="MapIterationTest">
            <p>
                MapIterationTest
            </p>
        </div>
    )
}

export default MapIterationTest