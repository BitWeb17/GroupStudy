const ArrayPopTest = () => {
    var arr = ["one", "two", "three"]

    console.log(arr)

    let elem = arr.pop();

    console.log(arr)
    console.log(elem)

    return (
        <div className="ArrayPopTest">
            <p>
                Array Pop Test
            </p>
        </div>
    )
}

export default ArrayPopTest