const ArrowFunctionTest4 = () => {
    const calculator = {
        firstNum: 3,
        secondNum: 7,

        print: function () {
            const add = () => {
                console.log("ArrowFunctionTest4: " + this)
                return this.firstNum + this.secondNum
            }

            console.log(this.firstNum + " + " + this.secondNum + " = " + add())
        }
    }

    calculator.print()

    return (
        <div className="ArrowFunctionTest4">
            <p>
                ArrowFunctionTest4
            </p>
        </div>
    )
}

export default ArrowFunctionTest4