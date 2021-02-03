function ArrayDataType() {
    var cars = ['BMW', 'Volvo', 'Audi','Toyota','Tesla']
    
    console.log("ArrayDataType: " + cars)

    return (
        <div className = "ArrayDataType">
            <p>
                {cars[0]},{cars[1]},{cars[2]},{cars[3]}
            </p>
        </div>
    )
}

export default ArrayDataType