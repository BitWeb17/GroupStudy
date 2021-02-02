function ClassExtends2() {
    class Obj {
        constructor() {
            this._name = "Obj"
        }

        getName() {
            return this._name
        }
        setName(name) {
            this._name = name
        }

        display() {
            console.log("ClassExtends2: " + this._name)
        }

        toString() {
            throw new Error('메서드를 구현하세요!')
        }
    }

    let obj = new Obj()

    obj.display()

    class ExtendsObj extends Obj {
        constructor() {
            super();
        }
        toString() {
            return "ClassExtends2: overload!"
        }
    }

    let extObj = new ExtendsObj()

    extObj.setName("ExtendsObj")
    extObj.display()

    console.log(extObj.toString())
    console.log(extObj)

    return (
        <div className="ClassExtends2">
            <p>
                ClassExtends2
            </p>
        </div>
    )
}

export default ClassExtends2