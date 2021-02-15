const Review = () => {
    var cars = ['BMW', 'Volvo', 'Audi', 'Toyota', 'Tesla']

    console.log("배열데이터 타입: " + cars)

    var num1 = 3
    var num2 = 3
    var num3 = 7

    var boolRes1 = (num1 === num2)
    var boolRes2 = (num1 === num3)

    console.log("논리연산자 타입 [3 == 3]: " + boolRes1)
    console.log("논리연산자 타입 [3 == 7]: " + boolRes2)

    var testNum = 0
    var testStr = "0"

    var boolRes3 = (testNum == testStr)
    var boolRes4 = (testNum === testStr)

    console.log("논리연산자 타입 [0 == \"0\"]: " + boolRes3)
    // 데이터를 가지고 논리연산함
    console.log("논리연산자 타입 [0 === \"0\"]: " + boolRes4)
    // 데이터타입을 가지고 논리연산함s

 
    const itemArr = [
        {
            name: "GPU",
            price: 3000000,
            quantity: 1,
        },
        {
            name: "CPU",
            price: 600000,
            quantity: 3,
        },
        {
            name: "MASIC",
            price: 120000000,
            quantity: 50,
        },
    ]

    console.log("JSON.stringify(itemArr): " + JSON.stringify(itemArr))
    // 위에서 정의한 것처럼 출력됨 (name: "GPU", price: 3000000, quantity: 1)
    console.log(itemArr)
    // [{...},{...},{...}] 형태로 출력되지만 클릭하면 상세정보가 나옴

    var test1 = 7 + "test"
    // 숫자 + 문자 = 문자(숫자)문자
    var test2 = "7" + "test"
    // 문자 + 문자 =  문자
    var numTest = 3 + 7 + "test"
    // 숫자1 + 숫자2 + 문자 = 숫자(숫자1,2 연산결과)문자

    console.log("7 + \"test\"= " + test1)
    console.log("\"7\" + \"test\"= " + test2)
    console.log("3 + 7 + \"test\"= " + numTest)

    var x = {firstName: "HyeonJeong", lastName: "Choi"}
    console.log(x)
    // {firstName: "HyeonJeong", lastName: "Choi"}

    var expNum1 = 123e5
    // 123 * 10^5 
    var expNum2 = 123e-5
    // 123 * 10^-5

    console.log("123 * 10^5 = " + expNum1)
    console.log("123 * 10^-5 = " + expNum2)
    // 자바보다 편하게 제곱을 사용할 수 있다.

    function ForTest() {
        for(var i = 0; i < num1; i++) {
            console.log("ForTest: " + i)
        }
    }

    function IfTest() {
        var num4 = 3, num5 = 10

        if(num4 !== 10) {
            console.log("3 !== 10")
        } else if(num5 !== 10) {
            console.log("10 !== 10")
        } else {
            console.log("works fine!")
        }
    }

    let print = 8809

    console.log("number: " + print)
    console.log("var의 내용을 console.log에 먼저 사용후 선언과 할당"+ 
                "그리고 내용도 변경해 보았다." + varTest)

    const conNum = 9303

    var varTest = "처음 할당한 내용입니다."

    console.log("conNum = " + conNum)
    
    varTest = "두번째 할당한 내용입니다."


    const A = {}
    const Asym = Symbol("Alphabet")

    A[Asym] = "A입니다."
    
    const B = Symbol("빈 심볼입니다.")

    

    if(A === B) {
        console.log("A === B")
    } else {
        console.log("A !== B")
    }

    const C = Symbol("Alphabet C입니다.")
    const D = Symbol("Alphabet D입니다.")

    if(C === D) {
        console.log("C === D")
    } else {
        console.log("C !== D")
    }

    const E = Symbol("TEST")

    console.log(A)
    // 출력결과 {Symbol(Alphabet): "A입니다."}
    console.log("A[Asym] = " + A[Asym])
    console.log("SymbolTest (B): " + B.toString())
    console.log("SymbolTest (C): " + C.toString())
    console.log("SymbolTest (D): " + D.toString())
    console.log("SymbolTest (E): " + E.toString())


    return (
        <div className = "Review">
            <p>
                ArrayDataType <br/>
                {cars[0]}, {cars[1]}, {cars[2]}, {cars[3]}<br/>
                BoolDataType<br/>
                {boolRes1.toString()}, {boolRes2.toString()}<br/>
                {boolRes3.toString()}, {boolRes4.toString()}<br/>            
                ConstTest<br/>
                {itemArr[0].name}, {itemArr[0].price}, {itemArr[0].quantity}<br/>
                {itemArr[1].name}, {itemArr[1].price}, {itemArr[1].quantity}<br/>
                {itemArr[2].name}, {itemArr[2].price}, {itemArr[2].quantity}<br/>
                DataType<br/>
                {test1},{test2},{numTest}<br/>
                {x.firstName}, {x.lastName}, {x.toString()}<br/>
                ExpDataType<br/>
                {expNum1}, {expNum2}<br/>
                ForTest<br/>
                {ForTest()}
                IfTest<br/>
                {IfTest()}
                LetVar<br/>
                let{print}<br/>const{conNum}<br/>var{varTest}<br/>
                Symbol<br/>
                A={A.toString()}<br/>,{B},{C},{D},{E}<br/>
                TypeOf<br/>
                {typeof ""}, {typeof "test"}, {typeof 0}, {typeof 3.14}, <br/>
                {/*String         String          num          num*/}
                {typeof true}, {typeof undef}, {typeof undefined}, {typeof null}, <br/>
                {/*boolean        undefined         undefined         object*/}
                {typeof {name: 'Test', major: 'EE'}}, {typeof [1, 2, 3, 4]},
                {/*            object                         object*/}
                {typeof function test(){}}<br/>
                      {/*function*/}
                
            </p>
        </div>
    )
}

export default Review