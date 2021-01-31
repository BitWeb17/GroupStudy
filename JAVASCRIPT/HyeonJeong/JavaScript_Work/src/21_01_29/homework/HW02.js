const HW02 = () => {
    const START  = 1
    const END = 20

    for(var i = START; i <= END; i++) {
        if(!(i % 2)) {
            console.log("Homework02: " + i)
        }
    }

    return(
        <div className = "HW02">
            <p>
                Homework02
            </p>
        </div>
    )
}

export default HW02