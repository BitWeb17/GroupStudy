function ArrayRepeatTest() {
    let arr = [1, 3, 5, 7, 10, 8, 6, 77, 43]

    let txt = ""

    function testFunc(value) {
        txt = txt + value + "<br>"
    }

    console.log("Before testFunc() = " + txt)

    arr.forEach(testFunc)

    console.log("After testFunc() = " + txt)

    return (
        <div className="ArrayRepeatTest">
            <p>
                ArrayRepeatTest
            </p>
        </div>
    )
}

export default ArrayRepeatTest