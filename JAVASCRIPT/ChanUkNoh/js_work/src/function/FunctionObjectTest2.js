const FunctionObjectTest2 = () => {
    function Programming() {
        this.name = "JavaScript";
        this.students = 17;
    }

    Programming.prototype.getName = function() {
        return this.name
    }

    let prog = new Programming();

    // true -> 함수도 결국 객체이다.
    // 값이 담기면 true
    if (Programming) {
        console.log("FunctionObjectTest2: Programming true")
    } else {
        console.log("FunctionObjectTest2: Programming false")
    }

    // 값이 담기면 true
    if (prog) {
        console.log("FunctionObjectTest2: prog true")
    } else {
        console.log("FunctionObjectTest2: prog false")
    }

    // 프로퍼티도 값이 담기면 true
    if (prog.name) {
        console.log("FunctionObjectTest2: prog.name true")
    } else {
        console.log("FFunctionObjectTest2: prog.name false")
    }

    if (prog.students) {
        console.log("FunctionObjectTest2: prog.students true")
    } else {
        console.log("FunctionObjectTest2: prog.students false")
    }

    // prototype 상속 받아도 true
    if (prog.getName) {
        console.log("FunctionObjectTest2: prog.getName true")
    } else {
        console.log("FunctionObjectTest2: prog.getName false")
    }

    // 프로퍼티가 undefined 이면 false
    if (prog.name2) {
        console.log("FunctionObjectTest2: prog.name2 true")
    } else {
        console.log("FunctionObjectTest2: prog.name2 false")
    }

    // 없으면 false
    if (prog.getName2) {
        console.log("FunctionObjectTest2: prog.getName2 true")
    } else {
        console.log("FunctionObjectTest2: prog.getName2 false")
    }

    // prop in Obj -> Obj 안에 pop이 있으면 true
    // true
    console.log("FunctionObjectTest2: " + ("name" in prog))
    // true
    console.log("FunctionObjectTest2: " + ("students" in prog))
    // 상속도 true
    console.log("FunctionObjectTest2: " + ("getName" in prog))
    // false
    console.log("FunctionObjectTest2: " + ("name2" in prog))
    // 객체는 기본적으로 toString 내장 true
    console.log("FunctionObjectTest2: " + ("toString" in prog))

    // Obj.hasOwnProperty(value) -> Obj가 value를 가지고 있으면 true
    // 가지고있지 않으면 false
    // prop in Obj -> Obj 와의 차이점은 상속을 인정하지 않고
    // 오로지 객체 원본만을 가지고 판단한다.

    // true
    console.log("FunctionObjectTest2: " +
        (prog.hasOwnProperty("students")))

    // 상속은 원본이 아님
    // false
    console.log("FunctionObjectTest2: " +
        (prog.hasOwnProperty("getName")))

    // 내장 객체도 원본이 아님
    // false
    console.log("FunctionObjectTest2: " +
        (prog.hasOwnProperty("toString")))

    return (
        <div className="FunctionObjectTest2">
            <p>
                FunctionObjectTest2
            </p>
        </div>
    )
}

export default FunctionObjectTest2