function ClassExtends() {
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
            console.log("ClassExtends: " + this._name)
        }
    }

    let obj = new Obj()

    obj.display()

    class ExtendsObj extends Obj {
        constructor() {
            super();
        }
    }

    let extObj = new ExtendsObj()

    extObj.setName("ExtendsObj")
    extObj.display()

    return (
        <div className="ClassExtends">
            <p>
                ClassExtends
            </p>
        </div>
    )
}

export default ClassExtends