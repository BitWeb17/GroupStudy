const AddSetTest = () => {
    console.log("---------AddSetTest----------")
    let setData = new Set()

    setData.add("Cherry")
    setData.add("Strawberry")
    setData.add("Apple")

    console.log(setData)
    console.log("AddSetTest: " + setData.has("Apple"))
    console.log("AddSetTest: " + setData.has("Grape"))

    return (
        <div className="AddSetTest">
            <p>
                AddSetTest
            </p>
        </div>
    )
}

export default AddSetTest