const SpreadTest7 = () =>{
    let newObj = {
        name:"newObj",
        number:3
    }

    console.log("SpreadTest7: "+ newObj)
    console.log("SpreadTest7: "+newObj.name)
    console.log("SpreadTest7: "+newObj.number)

    let newObj2 = {...newObj}

    console.log("SpreadTest7: "+ newObj2)
    console.log("SpreadTest7: "+ newObj2.name)
    console.log("SpreadTest7: "+ newObj2.number)

    newObj2 = {
        nickname: "SpreadTest"
    }

    let newObj3 = {...newObj,...newObj2}

    console.log("SpreadTest7: "+ newObj3)
    console.log("SpreadTest7: "+ newObj3.name)
    console.log("SpreadTest7: "+ newObj3.number)
    console.log("SpreadTest7: "+ newObj3.nickname)
    
    // alert 경고메세지 팝업 같은 역할
    //alert(JSON.stringify(newObj3))
    console.log("SpreadTest7: "+JSON.stringify(newObj3))
    return(
        <div className="SpreadTest7">
            <p>
                Spread Test7
            </p>
        </div>
    )
}
export default SpreadTest7