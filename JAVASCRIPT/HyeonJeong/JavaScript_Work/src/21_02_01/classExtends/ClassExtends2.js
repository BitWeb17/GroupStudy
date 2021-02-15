function ClassExtends2() {
    class Obj {
        constructor() {
            this._name = "extends2"
        }

        getName() {
            return this._name
        }

        display() {
            console.log("ClassExtends2: ", this._name)
        }

        toString() {
            throw new Error('매서드를 구현하세요!')
        }      
    }

    let obj = new Obj()
    
    obj.display()

    class ExtendObj extends Obj {
        constructor() {
            super();
        }

        toString() {
            return "overload!"
        }
    }

    let extObj = new ExtendObj()


}