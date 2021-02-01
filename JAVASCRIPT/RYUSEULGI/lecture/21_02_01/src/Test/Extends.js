import React from 'react';

function Extends() {
    class Obj {
        constructor(name){
            this._name = 'extends';
        }

        getName(){
            return this._name;
        }

        setName(name){
            this._name = name;
        }
        
        display(){
            console.log(this._name);
        }

        toString(){
            throw new Error('메서드를 구현하세요');
        }
    }

    const obj = new Obj('test1');

    obj.display(); // extends

    class ExtendsObj extends Obj{
        constructor(name){
            super();
        }
        toString(){
            return 'overload';
        }     
    }

    // ----------상속-----------
    const extObj = new ExtendsObj();
    extObj.setName('extends test');
    extObj.display(); // extends test
    console.log(extObj.toString()); // overload

    return (
        <div></div>
    )
}

export default Extends;


