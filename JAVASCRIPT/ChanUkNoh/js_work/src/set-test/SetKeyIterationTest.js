const SetKeyIterationTest = () => {
    console.log("---------SetKeyIterationTest----------")

    let setData = new Set()

    setData.add("Cherry")
    setData.add("Strawberry")
    setData.add("Apple")

    console.log("SetKeyIterationTest: " + setData)

    let setIter = setData.keys()

    for (let key of setIter) {
        console.log("SetKeyIterationTest: " + key)
    }

    return (
        <div className="SetIterationTest">
            <p>
                SetKeyIterationTest
            </p>
        </div>
    )
}

export default SetKeyIterationTest