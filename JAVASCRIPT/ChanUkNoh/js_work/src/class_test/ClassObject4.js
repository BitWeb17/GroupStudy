function ClassObject4() {
    class Obj {
        constructor(name) {
            this.name = name
            this.major = "electronics"
            Obj.num++
        }

        getName() {
            return this.name
        }
        getMajor() {
            return this.major
        }
        setName(name) {
            this.name = name
        }
        setMajor(major) {
            this.major = major
        }
        display() {
            console.log("ClassObject4: " + this.name)
            console.log("ClassObject4: " + this.major)
        }

        static getStaticTest(isTest, number) {
            if (isTest){
                return 333
            } else {
                return parseInt(3.3 * number, 10)
            }
        }

        static getStaticNumber() {
            return Obj.num
        }
    }

    Obj.num = 0;

    let obj1 = new Obj("test1")

    obj1.display()
    console.log("ClassObject4: " + Obj.getStaticNumber())

    let obj2 = new Obj("test2")

    obj2.display()
    console.log("ClassObject4: " + Obj.getStaticNumber())

    return (
        <div className="ClassObject4">
            <p>
                ClassObject4
            </p>
        </div>
    )
}

export default ClassObject4