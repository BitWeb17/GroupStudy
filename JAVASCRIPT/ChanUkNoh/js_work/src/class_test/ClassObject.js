function ClassObject() {
    class Obj {
        constructor() {
            this.name = "test"
            this.major = "electronics"
        }
    }

    let obj = new Obj()

    console.log("ClassObjectTest: " + obj.name)
    console.log("ClassObjectTest: " + obj.major)

    return (
        <div className="ClassObject">
            <p>
                Class Test
            </p>
        </div>
    )
}

export default ClassObject