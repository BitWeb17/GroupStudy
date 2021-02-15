import React from 'react'

function  ClassObj2() {

    class Obj {
        constructor(){
            this.name = 'seulgi'
            this.major = 'media contents'
            Obj.number++;
        }

        getName() {
            return this.name;
        }
    
        getMajor() {
            return this.major;
        }
    
        setName(name) {
            this.name = name;
        }
    
        setMajor(major) {
            return this.major;
        }
    
        display() {
            console.log(this.name);
            console.log(this.major);
        }

        // JavaScript에서의 staic 

        static getStaticTest(isTest, number){
            if(isTest){
                return 333;
            } else{
                // parseInt( 숫자가ㅄ, 표현할 방법)
                return parseInt( 3.3 * number, 10);
            }
        }

        static getStaticNum (){
            return Obj.number;
        }
    }

    const obj = new Obj();

    console.log(obj.name);  // seulgi
    console.log(obj.major); // media contents
    console.log(obj.getMajor()); // mdeia contents
    console.log(obj.getName()); // seulgi

    obj.display();  //seulgi media contents

    console.log(Obj.getStaticTest(true));  // 333
    console.log(Obj.getStaticTest(false, 5)); // 16

    const obj1 = new Obj('test1');
    Obj.number = 0;
    obj1.display(); //seulgi media contents
    console.log(Obj.getStaticNum()); // 0
    
    const obj2 = new Obj('test2');
    obj2.display(); //seulgi media contents
    console.log(Obj.getStaticNum()); // 1
    
    return (
        <div>
            
        </div>
    )
}

export default  ClassObj2;


