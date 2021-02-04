const NewSetInitTest = () => {
    let setData = new Set(["Banana", "Watermelon"])

    console.log("NewSetInitTest: " + setData)  // {}
    console.log("NewSetInitTest: " + setData.size) // 2

    return (
        <div className="NewSetInitTest">
            <p>NewSetInitTest</p>
        </div>
    )
}

export default NewSetInitTest