const NewSetInitTest = () => {
    let setData = new Set(["Banana", "Watermelon"])

    console.log("NewSetInitTest: " + setData)
    //NewSetInitTest: [object Set]
    console.log("NewSetInitTest: " + setData.size)
    //NewSetInitTest: 2

    return (
        <div className="NewSetInitTest">
            <p>NewSetInitTest</p>
        </div>
    )
}

export default NewSetInitTest