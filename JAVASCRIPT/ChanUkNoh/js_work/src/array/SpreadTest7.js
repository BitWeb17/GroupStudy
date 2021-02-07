const SpreadTest7 = () => {
    let newObj = {
        name: "ss",
        num : 3
    }

    console.log(newObj)
    console.log(newObj.name)
    console.log(newObj.num)

    let newObj2 = {...newObj}

    console.log(newObj2)
    console.log(newObj2.name)
    console.log(newObj2.num)

    newObj2 = {
        nickname: "SpreadTest"
    }

    let newObj3 = {
        ...newObj, ...newObj2
    }

    console.log(newObj3)
    console.log(newObj3.name)
    console.log(newObj3.num)

    // alert(JSON.stringify(newObj3))

    return (
        <div className="SpreadTest7">
            <p>
                SpreadTest7
            </p>
        </div>
    )
}

export default SpreadTest7