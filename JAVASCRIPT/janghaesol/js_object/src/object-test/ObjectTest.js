function ObjectTest() {
    let obj = {
        name : "test",

        getName:function(){
            return this.name
        },

        setName : function(name){
            this.name =name
        },
        display:function(){
            console.log(this.name)
        }
    }
    //test
     console.log("ObjectTest"+obj.getName())

    //gogosing
     obj.setName("gogosing")
     console.log("ObjectTest"+obj.getName())

    //gogosing
     obj.display()

    //gogosing
     console.log("ObjectTest"+obj["getName"]())

    //star Ocean
     obj["setName"]("star Ocean")
     console.log("ObjectTest"+obj["getName"]())

     return(
         <div>
             <p>
                 ObjectTest
             </p>
         </div>
     )
    }
    export default ObjectTest

  