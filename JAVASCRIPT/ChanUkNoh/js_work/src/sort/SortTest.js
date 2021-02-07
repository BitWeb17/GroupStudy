const SortTest = () => {
    let arr = [1, 2, 3, 4, 5, 6, 7]

    console.log("arr = " + arr);

    let one = arr[0]
    let two = arr[1]
    let three = arr[2]

    console.log("One = "  + one + ", Two = " + two + ", Three = " + three)

    arr = new Array("test1", "test2", "test3")

    console.log(arr)

    let len = arr.length

    console.log("Array Length = " + len)
    console.log("Last Arr = " + arr[len - 1])

    arr = [1, 9, 3, 12, 5, 8, 7]

    console.log("Before Sort = " + arr)
    let sortedArr = arr.sort()
    console.log("After Sort = " + sortedArr)

    len = sortedArr.length


    let arr2 = [1, 9, 3, 2, 5, 8, 7]

    console.log("Before Sort = " + arr2)
    let sortedArr2 = arr2.sort()
    console.log("After Sort = " + sortedArr2)

    console.log("(Solved)Before Sort = " + arr)
    sortedArr = arr2.sort((a, b) => a - b)
    console.log("(Solved)After Sort = " + sortedArr)

    let text = "<ul>"

    for (let i = 0; i < len; i++) {
        text += "<li>" + sortedArr[i] + "</li>"
    }

    text += "</ul>"

    console.log(text)
    return (
        <div className="SortTest">
            <p>
                SortTest
            </p>
        </div>
    )
}

export default SortTest