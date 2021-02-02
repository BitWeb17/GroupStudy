function ObjectTest(){
    let obj = {
        name : "test",

        getName:function (){
            return this.name
        },
        setName:function (name){
            this.name = name
        },
        display: function (){
            console.log(this.name)
        }
    }

    //test
    console.log(obj.getName())

    obj.setName("gogosing")
    console.log(obj.getName())

    obj.display()
    console.log(obj["getName"]())

    obj["setName"]("star Ocean")
    console.log(obj["getName"]())

    return(
        <div className="ObjectTest">
            <p>
                ObjectTest
            </p>
        </div>
    )
}
export default ObjectTest