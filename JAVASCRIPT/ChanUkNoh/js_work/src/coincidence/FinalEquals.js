const FinalEquals = () => {
    let test = 0;

    if (test) {
        console.log("success")
    } else {
        console.log("failure")
    }

    if (test == false) {
        console.log("success")
    } else {
        console.log("failure")
    }

    if (test === false) {
        console.log("success")
    } else {
        console.log("failure")
    }

    return (
        <div className="FinalEquals">
            <p>
                FinalEquals
            </p>
        </div>
    )
}

export default FinalEquals