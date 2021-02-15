const SetentryIteratorTest= () => {
    console.log("SetentryIteratorTest Fin")

    let setData = new Set()

    setData.add("cherry")
    setData.add("strawberry")
    setData.add("apple")

    console.log(setData)
    
    var setIter = setData.entries()

    for(var entry of setIter){
        console.log(entry)
    }
   

    
    return(
        <div className = "SetentryIteratorTest">
            <p>
            SetentryIteratorTest
            </p>
        </div>
    )
    
}

export default SetentryIteratorTest