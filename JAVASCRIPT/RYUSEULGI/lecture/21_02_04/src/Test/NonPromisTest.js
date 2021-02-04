import React from 'react'

const NonPromisTest = () => {

    function helloWorld(){
        setTimeout(() => {
            console.log('hello!!!!');

            setTimeout( () =>{
                console.log('world!!!!');
            }, 1000);
        }, 2000);
    }

    helloWorld();
    
    // hello
    // world
    
    return (
        <div>
            
        </div>
    )
}

export default NonPromisTest
