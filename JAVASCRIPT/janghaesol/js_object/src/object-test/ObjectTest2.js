function ObjectTest2() {
    let obj = {
        _name : "test",
        //I'm Getter
        get name(){
            console.log("I'm Getter")
            return this._name
        },
        set name(value){
            console.log("I'm Setter")
            this._name = value
        }
    }
    //test
    //test
console.log("ObjectTest2"+obj.name)
console.log("ObjectTest2"+obj._name)

obj.name = "gogosing"
console.log(obj.name)

     return(
         <div>
             <p>
                 ObjectTest2
             </p>
         </div>
     )
    }
    export default ObjectTest2