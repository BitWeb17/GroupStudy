const SetkeyIteratorTest= () => {
    console.log("SetkeyIteratorTest Fin")

    let setData = new Set()

    setData.add("cherry")
    setData.add("strawberry")
    setData.add("apple")

    console.log(setData)
    
    var setIter = setData.keys()

    for(var key of setIter){
        console.log(key)
    }
   

    
    return(
        <div className = "SetkeyIteratorTest">
            <p>
            SetkeyIteratorTest
            </p>
        </div>
    )
    
}

export default SetkeyIteratorTest