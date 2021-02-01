const HW03 = () => {
    const INIT = 1

    const START  = 0
    const END = 15

    const CRITERIA = 10

    var emp = []
    
    for(var i = START; i <= END; i++) {
        emp[i] = (Math.random() * CRITERIA) + INIT
        console.log("Homework03: %d - %d", i, emp[i])
    }

    return(
        <div className = "HW03">
            <p>
                Homework03
            </p>
        </div>
    )
}

export default HW03