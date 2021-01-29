const FunctionObjectTest2 = () => {
    function Programming() {
        this.name = "JavaScript"
        this.students = 17
    }

    Programming.prototype.getName = function() {
        return this.name
    }

    let prog = new Programming()

    if(Programming) {
        console.log("FunctionObjectTest2: Programming true")   //------programming 이라는 함수가 있다
    } else {
        console.log("FunctionObjectTest2: Programming false")
    }

    console.log("FunctionObjectTest2: " + prog)   // ------ [object Object]

    if(prog) {
        console.log("FunctionObjectTest2: prog true") //------ prog 라는 programming 함수선언
    } else {
        console.log("FunctionObjectTest2: prog false")
    }

    console.log("FunctionObjectTest2: " + prog.name) //------JavaScript prog(programming) 함수에 name호출

    if(prog.name) {
        console.log("FunctionObjectTest2: prog.name true")   //------ name값이 있으니 true
    } else {
        console.log("FunctionObjectTest2: prog.name false")
    }

    console.log("FunctionObjectTest2: " + prog.students)   //------ 17 JavaScript prog(programming) 함수에 students호출

    if(prog.students) {
        console.log("FunctionObjectTest2: prog.students true") //------students 값이 있으니 true
    } else {
        console.log("FunctionObjectTest2: prog.students false")
    }

    console.log("FunctionObjectTest2: prog.getName - " + prog.getName) // Programming.prototype.getName 호출
                                                                       // function () {return this.name;}
    console.log(prog.getName())   //-----현재 얻은 getname은 JavaScript

    if(prog.getName) {
        console.log("FunctionObjectTest2: prog.getName true") //------ name값이 있으니 true
    } else {
        console.log("FunctionObjectTest2: prog.getName false")
    }

    console.log("FunctionObjectTest2: prog.toString - " + prog.toString)//------??function toString() { [native code]}
    console.log(prog.toString())//------[object Object]

    if(prog.toString) {
        console.log("FunctionObjectTest2: prog.toString true") //------ 문자열이 있다??
    } else {
        console.log("FunctionObjectTest2: prog.toString false")
    }

    console.log("FunctionObjectTest2: prog.name2 - " + prog.name2) //------undefined 이건 없는 값이다.

    // 자바스크립트에서 없는 것은 결국 undefined로 false 처리됨
    if(prog.name2) {
        console.log("FunctionObjectTest2: prog.name2 true")
    } else {
        console.log("FunctionObjectTest2: prog.name2 false")//------
    }

    console.log("FunctionObjectTest2: prog.getName2 - " + prog.getName2) //------undefined 이것도 없는값이다.

    if(prog.getName2) {
        console.log("FunctionObjectTest2: prog.getName2 true")
    } else {
        console.log("FunctionObjectTest2: prog.getName2 false")//------
    }

    // ~~ in 객체에서 잡히고
    // hasOwnProperty에서 거짓이 나오면 필요에 의해 새로 추가한 객체
    // 양쪽 모두에서 잡히면 원래부터 가지고 있던 순수한 속성
    console.log("FunctionObjectTest2: " + ("name" in prog)) //------true prog안에 name은 있다
    console.log("FunctionObjectTest2: " + ("students" in prog))//------true prog안에 students은 있다
    console.log("FunctionObjectTest2: " + ("getName" in prog)) //------true prog(programming)프로토타입 내포되getName이 있다.
    console.log("FunctionObjectTest2: " + ("name2" in prog)) //------false name2는 어디에도 없다....

    //hasOwnProperty 메소드가 하는 일은 객체가 특정 프로퍼티에 대한 소유 여부를 반환한다.
    console.log("FunctionObjectTest2: " +
        (prog.hasOwnProperty("students")))
    console.log("FunctionObjectTest2: " +
        (prog.hasOwnProperty("getName"))) //---prog(programming)의 순수한 속성이 아니므로 false
    console.log("FunctionObjectTest2: " +
        ("toString" in prog))
    console.log("FunctionObjectTest2: " +
        (prog.hasOwnProperty("toString")))//---prog(programming)의 순수한 속성이 아니므로 false

    //JSON.stringify  object에 내용을 확인!
    console.log("FunctionObjectTest2: " + JSON.stringify(prog))

    return (
        <div className="FunctionObjectTest2">
            <p>
                Function Object Test 2
            </p>
        </div>
    )
}
export default FunctionObjectTest2