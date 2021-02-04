import React from 'react'

function SubOrder() {

    const person1 = [
        {name: 'seulgi', age: 26},
        {name: 'go', age: 20},
        {name: 'carol', age: 23}
    ]

    console.log(JSON.stringify(person1));

    person1.sort(
        (a, b) => (a.age - b.age)
    );
    console.log(JSON.stringify(person1));
    
    person1.sort((a,b) => {
        const x = a.name.toLowerCase();
        const y = b.name.toLowerCase();

        if( x < y){
            return -1;
        }
        if( x > y){
            return 1;
        } 

        return 0;
    });
    console.log(JSON.stringify(person1));

    return (
        <div>
            
        </div>
    )
}

export default SubOrder
