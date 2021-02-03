const NewSetInitTest = () =>{
    let setData = new Set(["Banana","Watermelon"])

    console.log("NewSetInitTest: " +setData)
    console.log("NewSetInitTest: " +setData.size)

    return(
        <div className="NewSetInitTest">
            <p>
                set-test : NewSetInitTest
            </p>
        </div>
    )
}
export default NewSetInitTest