const ForWithSetMap = () => {
    let mapData = new Map(
        [
            ["David","Physics"],
            ["Kevin","Society"]
            
        ]
    )
    console.log("")
    console.log(mapData)
//Map {"David" => "Physics", "Kevin" => "Society"}
    for(let data of mapData){
       console.log(data)
       //["David", "Physics"]
       //["Kevin", "Society"]
    }

    let setData = new Set(
        ["David",,"Kevin"]
    )

    console.log(setData)
//Set {"David", undefined, "Kevin"}
    for(let data of setData){
        console.log(data)
        //David
        //undefined
        //Kevin
    }
    
    return(
        <div className = "ForWithSetMap">
            <p>ForWithSetMap</p>
        </div>
    )

}

export default ForWithSetMap