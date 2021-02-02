import React from 'react'

function ArrySort() {

    const arr = [1,3,8,10,5,7,11,19,77,33];
    console.log('before reverse' + arr);
    
    arr.reverse();
    console.log('reverse' + arr);

    arr.sort(function( a, b){
        return a - b;
    });

    console.log('max' + arr[arr.length - 1]);
    
    return (
        <div>
            
        </div>
    )
}

export default ArrySort
