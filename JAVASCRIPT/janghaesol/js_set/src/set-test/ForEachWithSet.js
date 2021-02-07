const ForEachWithSet = () => {
    let setData = new Set()

    setData.add("Cherry")
    setData.add("strawberry")
    setData.add("apple")

    console.log(setData)
    //Set {"Cherry", "strawberry", "apple"}

    setData.forEach(function(val1, val2) {
        console.log(val1 + " : " + val2)
        //Cherry : Cherry
        //strawberry : strawberry
        //apple : apple
    })
            //  ||  //
    setData.forEach((val1, val2) =>
        console.log("arrow - " + val1 + " : " + val2)
        //arrow - Cherry : Cherry
        //arrow - strawberry : strawberry
        //arrow - apple : apple
    )

    return (
        <div className="ForEachWithSet">
            <p>ForEachWithSet</p>
        </div>
    )
}

export default ForEachWithSet