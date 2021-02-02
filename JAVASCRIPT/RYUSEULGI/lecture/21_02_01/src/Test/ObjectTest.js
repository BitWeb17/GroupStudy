import React from 'react'

function ObjectTest() {

    const obj = {
        name: 'seulgi',
    
        getName : function(){
            return this.name;
        },
        setName : function(name){
            this.name = name;
        },
        display: function(){
            console.log(this.name);
        }
    }

    console.log(obj.getName());

    obj.setName('ryuseulgi');
    console.log(obj.getName());

    obj.display();
    console.log(obj['getName']());

    obj['setName']('another name');
    console.log(obj['getName']());

    return (
        <div>
            
        </div>
    )
}

export default ObjectTest
