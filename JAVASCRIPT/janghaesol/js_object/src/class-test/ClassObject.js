import ObjectTest2 from "../object-test/ObjectTest2"

function ClassObject() {
    class Obj{
        //생성자를 constructor()를 사용해야 한다.
        constructor(){
            this.name = "test"
            this.major = "eletronics"

        }
    }
    
    let obj = new Obj()

    console.log("ClassObject="+obj.name)
    console.log("ClassObject="+obj.major)

    return(
        <div className = "ClassObject">
            <p>
                Class Test
            </p>
        </div>
    )
}

export default ClassObject