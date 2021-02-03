const NewMapInitTest = () =>{
    let mapData = new Map(
        [
            ["apple","red"],["grape","purple"]
        ]
    )

    console.log(mapData)
    console.log("NewMapInitTest.size: " + mapData.size)

    return(
        <div className="NewMapInitTest">
            <p>
                NewMapInitTest
            </p>
        </div>
    )
}
export default NewMapInitTest