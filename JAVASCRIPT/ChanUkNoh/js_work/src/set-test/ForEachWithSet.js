const ForEachWithSet = () => {
    console.log("---------ForEachWithSet----------")

    let setData = new Set()

    setData.add("Cherry")
    setData.add("Strawberry")
    setData.add("Apple")

    console.log(setData)

    setData.forEach(function (value1, value2) {
        console.log(value1 + " : " + value2)
    })

    setData.forEach((value1, value2) => {
        console.log(value1 + " : " + value2)
    })

    return (
        <div className="ForEachWithSet">
            <p>
                ForEachWithSet
            </p>
        </div>
    )
}

export default ForEachWithSet