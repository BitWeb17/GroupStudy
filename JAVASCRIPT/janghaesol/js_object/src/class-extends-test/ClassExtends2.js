function ClassExtends2() {
    class Obj {
        // 생성자를 constructor()로 사용해야 한다.
        constructor(name) {
            this._name = "extends2"
        }

        getName() {
            return this._name
        }
    
        setName(name) {
            this.name = name
        }
        
        display() {
            console.log("ClassObject4: " + this._name)
        }
        toString(){
            throw new Error('매서드를 구현하세요!')
        }

    }
    let obj = new Obj("test1")

    obj.display()
    
    class ExtendObj extends Obj{
        constructor(){
            super();
        }
        toString(){
            return "overload!"
        }
    }

    let extObj = new ExtendObj()

    extObj.setName("Extends Test")
    extObj.display()

    console.log(extObj.toString())

    return (
        <div className="ClassExtends2">
            <p>
                Class ClassExtends2
            </p>
        </div>
    )
}

export default ClassExtends2 