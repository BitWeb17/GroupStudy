SetKeyIterationTest = () => {
console.log("SetKeyIterationTest Start")

    let setData = new Set()

    setData.add("Cherry")
    setData.add("Strawberry")
    setData.add("Apple")

    console.log(setData)

    var setIter = setData.keys()

    for(var key of setIter) {
        console.log(key)
    }
    
    console.log("SetKeyIterationTest Fin")
    
    return (
        <div className = "SetKeyIterationTest">
            <p>AddSetTest</p>

        </div>
    )
}

export default SetKeyIterationTest