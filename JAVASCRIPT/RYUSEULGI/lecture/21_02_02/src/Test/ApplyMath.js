import React from 'react'

function ApplyMath() {

    const arr = [1,3,8,10,5,7,11,19,77,33];

    function findArrMax(arr){
        return Math.max.apply(null,arr);
    }

    function findArrMin(arr){
        return Math.min.apply(null,arr);
    }

    console.log(findArrMax(arr));
    console.log(findArrMin(arr));

    function myFindArr(arr){
        let max = arr[0];
        let min = arr[0];
    
        for( let i =0; i < arr.length; i++){
            if(arr[i] < min){
                arr[i] = min;
            } else if( arr[i] > max){
                arr[i] = max;
            }
        }
        console.log('max' + max);
        console.log('min' + min);
    }

    myFindArr(arr);

    function myFindArr2(arr){
        let max;
        let len = arr.length;

        while(len--){
            if(arr[len] > max){
                max = arr[len];
            }
        }
        return max;
    }

    console.log(myFindArr2(arr));

    return (
        <div>
            
        </div>
    )
}

export default ApplyMath
