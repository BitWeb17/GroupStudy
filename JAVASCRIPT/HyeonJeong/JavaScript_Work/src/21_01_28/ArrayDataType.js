function ArrayDataType() {
    var cars = ['BMW', 'Volvo', 'Audi','Toyota','Tesla']
    
    console.log("ArrayDataType: " + cars)

    return (
        <div className = "ArrayDataType">
            <p>
                {car[0]},{car[1]},{car[2]},{car[3]}
            </p>
        </div>
    )
}

export default ArrayDataType