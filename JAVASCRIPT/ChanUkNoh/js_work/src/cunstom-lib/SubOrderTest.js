function SubOrderTest() {
    let arr = [1, 3, 5, 7, 10, 8, 6, 77, 43]

    let person1 = [
        {name: "Julian", age: 23},
        {name: "Allen", age: 25},
        {name: "Tomas", age: 23},
        {name: "Monica", age: 21}
    ]

    console.log("Before Custom Sort: " + JSON.stringify(person1))

    person1.sort((a, b) =>
        a.age - b.age
    )

    console.log("After Custom Sort: " + JSON.stringify(person1))

    return (
        <div className="SubOrderTest">
            <p>
                SubOrderTest
            </p>
        </div>
    )
}

export default SubOrderTest