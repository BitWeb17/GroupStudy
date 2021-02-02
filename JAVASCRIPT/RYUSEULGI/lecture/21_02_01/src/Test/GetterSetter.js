import React from 'react';

function GetterSetter() {

    const object = {
        _name: 'seulgi',
    
        get name() {
            console.log('getter');
            return this._name;
        },
        set name(value){
            console.log('setter');
            this._name = value;
        }
    }
    
    console.log("get" + object.name);  // getter seulgi
    console.log(object._name); // seulgi

    object.name = 'new name';  // setter
    console.log(object.name);  // getter new name

    return (
        <div></div>
    )
}

export default GetterSetter;
