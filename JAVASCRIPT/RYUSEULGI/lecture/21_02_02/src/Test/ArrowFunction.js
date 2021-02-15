import React from 'react'

function ArrowFunction() {

    let f = function(){
        return '33';
    }
    console.log('nomal' + f());

    f = () => {
        return '33';
    }
    console.log(f());

    const add333 = (val) => {
        return 333 + val;
    }
    console.log(add333(77));

    const add = (a,b) => {
        return a + b;
    }
    console.log(add(3,7));

    const calc = {
        firstNum : 3,
        secondNum : 7,

        // 형식에 상관없이 전부 객체 취급하기 때문
        print : function(){
            const addNum = () =>{
                console.log(JSON.stringify(this));
                return this.firstNum + this.secondNum;
            }
            console.log(`${this.firstNum} + ${this.secondNum} = ${addNum()}`);
        } 
    }

    calc.print();

    const addd = (first, second, ...args) =>{
        console.log(first, second,args);

        let sum = first + second;

        for(let i =0; i < args.length; i++){
            sum +=args[i];
        }
        return sum;
    }
    let sun = addd(1,2,3,4,5,6,7,8,9,10);
    console.log(sun);   // 55

    // default parameter
    const defParam = (first, second = 3) => {
        return first + second;
    }

    let summ = defParam(1,2);
    console.log(summ);  // 3

    summ = defParam(1);
    console.log(summ);  // 4

    return (
        <div>
            
        </div>
    )
}

export default ArrowFunction
