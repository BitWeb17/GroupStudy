import React from 'react'

const NonPromise = () => {

    function hello(){
        setTimeout(() => {
            console.log('hello');
        }, 2000);
    }

    function world(){
        setTimeout(() => {
            console.log('world');
        }, 1000);
    }

    hello();
    world();  

    // world
    // hello

    return (
        <div>
            
        </div>
    )
}

export default NonPromise
