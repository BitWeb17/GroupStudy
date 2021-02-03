const SubOrderTest2 = () => {

    var person1 = [
        {name: "Julian", age: 23},
        {name: "Allen", age: 25},
        {name: "Tomas", age: 23},
        {name: "Monica", age: 21}

    ]

    console.log("Before Custom Sort2: " + JSON.stringify(person1))

    person1.sort(function(a,b) {
      let x = a.name.toLowerCase()
      let y = b.name.toLowerCase()

      // 어순대로 정렬하겠다
      if(x < y){
          return -1
      } if(x > y){
          return 1
      }
      return 0
    } 
    )

    console.log("After Custom Sort2: " + JSON.stringify(person1))
     


    return(
        <div className = "SubOrderTest2">
            <p>
                custom-lib: SubOrderTest2
            </p>
        </div>
    )
} 

export default SubOrderTest2