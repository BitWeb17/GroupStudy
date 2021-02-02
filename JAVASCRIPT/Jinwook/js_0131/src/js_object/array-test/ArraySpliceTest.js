function ArraySplicetTest(){
    let arr = ["one","two","three"]
    console.log("Before Shift = " + arr)

    // Queue(큐) 형태의 값 빼기 방식이라고 봐도 무방하다
    // Stack은 후입선출, Queue는 선입선출이다.
    // 배열이 엄청 길면 이렇게 움직이는 것은 메모리에 영향을 심히 준다
    let what = arr.splice(2, 0, "elem1", "elem2")

    console.log("After Splice = " + arr)
    console.log("What= " + what)

    let what2 = arr.splice(2, 2, "elem3", "elem4")
    console.log("What2= " + what2)

    console.log("Shift Splice = " + arr)

    arr.splice(2, 2, "elem4")

    console.log("Shift Splice = " + arr)


    

    return (
        <div className="ArraySplicetTest">
            <p>
            ArraySplicetTest
            </p>
        </div>
    )
}

export default ArraySplicetTest