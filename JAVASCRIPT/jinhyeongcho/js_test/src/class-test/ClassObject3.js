function ClassObject3(){
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
            console.log("ClassObject3: " + this.name)
            console.log("ClassObject3: " + this.major)
        }

        static getStaticTest(isTest,number){
            if(isTest){
                return 333
            } else {
                // parseInt(숫자값,radix:표현하는 진법)
                return parseInt (3.3*number,10)
            }
        }

    }


    let obj = new Obj()

    console.log("ClassObject3: " +obj.name)
    console.log("ClassObject3: " +obj.major)
    console.log("ClassObject3: " + obj.getName())
    console.log("ClassObject3: " + obj.getMajor())

    obj.display()

    // 클래스 Obj에서 불러오는것. obj가 아닌
    console.log(Obj.getStaticTest(true))
    console.log(Obj.getStaticTest(false,100))


    return(
        <div className="ClassObject3">
            <p>
                Class Object3
            </p>
        </div>
    )
}
export default ClassObject3