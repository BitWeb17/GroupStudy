function ClassObject(){
    class Obj {
        constructor() {
            // 생성자를 constructor()로 사용해야 한다.
            this.name = "test"
            this.major = "electronics"
        }
    }

    let obj = new Obj()

    console.log(obj.name)
    console.log(obj.major)

    return(
        <div className="ClassObject">
            <p>
                Class Object
            </p>
        </div>
    )
}
export default ClassObject