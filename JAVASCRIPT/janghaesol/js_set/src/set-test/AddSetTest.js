const AddSetTest = () => {
    let setData = new Set()

    setData.add("Cherry")
    setData.add("strawberry")
    setData.add("apple")

    console.log(setData)
    //Set {"Cherry", "strawberry", "apple"}
    console.log("AddSetTest: " + setData.has("apple"))
    //AddSetTest: true
    console.log("AddSetTest: " + setData.has("grape"))
    //AddSetTest: false
    return (
        <div className="AddSetTest">
            <p>AddSetTest</p>
        </div>
    )
}

export default AddSetTest