const ArrayJoinTest = () => {
    var arr = ["one", "two", "three"]
    console.log(arr.toString())
                //join은 배열 매소드 각각을 결합
    console.log(arr.join("*"))


    console.log(arr.join("조인"))
    return(
        <div className="ArrayJoinTest">
            <p>
            Array Join Test
            </p>
        </div>
            
    )
}

export default ArrayJoinTest