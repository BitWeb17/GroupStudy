const Equals = () => {
    let name = "test";

    // 값이 있으면 true
    if (name) {
        console.log("true")
    } else {
        console.log("false")
    }

    if (!name) {
        console.log("false")
    } else {
        console.log("true")
    }

    return (
        <div className="Equals">
            <p>
                Equals
            </p>
        </div>
    )
}

export default Equals