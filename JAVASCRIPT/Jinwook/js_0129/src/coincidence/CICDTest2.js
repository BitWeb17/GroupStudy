const CICDTest2 = () => {
    let name = "test"

    // ===은 값과 데이터타입까지 비교함
    if(name === "test") {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    return (
        <div className="CICDTest2">
            <p>
                Coincidence Test 2
            </p>
        </div>
    )
}

export default CICDTest2