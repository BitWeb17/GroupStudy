function ObjectTest() {
    let obj = {
        name: "test",
        
        getName: function () {
            return this.name
            
        },
        setName: function (name){
            this.name = name
        },
        display: function(){
            console.log(this.name)
        }
    }
    // test
    console.log(obj.getName())
    // gogosing
    obj.setName("gogosing")
    console.log(obj.getName())
    // getName 함수를 호출하겠다 = obj["getName"]()
    obj.display()
    console.log(obj["getName"]())

    // setName에 "star ocean"을 세팅해라
    obj["setName"]("star Ocean")
    console.log(obj["getName"]())

    return(
        <div className = "ObjectTest">
            <p>
                ObjectTest
            </p>
        </div>
    )
    
}
export default ObjectTest