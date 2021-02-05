const ArrowFunctionTest2 = () => {
    let ad333 = function(val) { return 333 + val }
    console.log("ArrowFunctionTest2: " + ad333(77))

    let ad333Arrow = (val) => { return 333 + val }
    console.log("ArrowFunctionTest2: " + ad333Arrow(77))

    return (
        <div className="ArrowFunctionTest2">
            <p>
                ArrowFunctionTest2
            </p>
        </div>
    )
}

export default ArrowFunctionTest2