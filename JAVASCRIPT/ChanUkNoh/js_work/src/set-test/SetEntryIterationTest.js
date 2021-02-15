const SetEntryIterationTest = () => {
    console.log("---------SetEntryIterationTest----------")

    let setData = new Set()

    setData.add("Cherry")
    setData.add("Strawberry")
    setData.add("Apple")

    console.log(setData)

    let setIter = setData.entries()

    for (let entry of setIter) {
        console.log(entry)
    }

    return (
        <div className="SetEntryIterationTest">
            <p>
                SetEntryIterationTest
            </p>
        </div>
    )
}

export default SetEntryIterationTest