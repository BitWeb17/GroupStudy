function ClassObject2(){
    class Obj {
        constructor() {
            // 생성자를 constructor()로 사용해야 한다.
            this.name = "test"
            this.major = "electronics"
        }

       getName(){
            return this.name
       }

       getMajor(){
            return this.major
       }

       setName(name){
            this.name = name
       }
       setMajor(major){
            this.major = major
       }
       display(){
            console.log("ClassObject: " + this.name)
            console.log("ClassObject: " + this.major)
       }

    }


    let obj = new Obj()

    console.log("ClassObject: " +obj.name)
    console.log("ClassObject: " +obj.major)
    console.log("ClassObject: " + obj.getName())
    console.log("ClassObject: " + obj.getMajor())

    obj.display()

    return(
        <div className="ClassObject2">
            <p>
                Class Object2
            </p>
        </div>
    )
}
export default ClassObject2