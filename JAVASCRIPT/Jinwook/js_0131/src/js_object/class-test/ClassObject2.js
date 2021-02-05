function ClassObject2(){
    class Obj{
    constructor(){
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
        console.log("CLassObject2: " + obj.name)
        console.log("CLassObject2: " + obj.major)
    }

}

let obj = new Obj()

console.log("CLassObject2: " + obj.name)
console.log("CLassObject2: " + obj.major)
console.log("CLassObject2: " + obj.getName())
console.log("CLassObject2: " + obj.getMajor())

obj.display()

return(
    <div className = "ClassObject2">
        <p>
            Class Test2
        </p>
    </div>
)

}
export default ClassObject2