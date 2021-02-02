function ClassObject(){
    class Obj{
        // 생성자를 constructor()로 사용해야 한다.
        // 함수경우 호이스팅 되지만 클래스는 호이스팅이 안됨
    constructor(){
        this.name = "test"
        this.major = "electronics"

    }
}
let obj = new Obj()

console.log("CLassObject: " + obj.name)
console.log("CLassObject: " + obj.major)

return(
    <div className = "ClassObject">
        <p>
            Class Test
        </p>
    </div>
)

}
export default ClassObject