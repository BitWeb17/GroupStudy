const NewMapInitTest = () => {
    let mapData = new Map(
        [
            ["apple", "red"], ["grape", "purple"]
        ]
    )

    console.log(mapData)
    //Map {"apple" => "red", "grape" => "purple"}
    console.log("Size: " + mapData.size)
    //Size: 2

    return (
        <div className="NewMapInitTest">
            <p>NewMapInitTest</p>
        </div>
    )
}

export default NewMapInitTest