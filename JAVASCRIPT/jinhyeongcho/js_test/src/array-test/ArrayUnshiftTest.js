const ArrayUnshiftTest = () =>{
    let arr = ["one","two","three"]

    console.log("Before Unshift = " + arr)

    // Queue(큐) 형태의 값 빼기 방식이라고 봐도 무방하다.
    // Stack은 후입선출, Queue는 선입선출이다.
    let elem = arr.unshift(333)

    console.log("After Unshift = " + arr)
    console.log("Unshift Length = " +elem)

    return(
        <div className="ArrayUnshift">
            <p>
                Array Unshift Test
            </p>
        </div>
    )
}
export default ArrayUnshiftTest