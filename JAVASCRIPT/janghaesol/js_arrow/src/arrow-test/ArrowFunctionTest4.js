
const ArrowFunctionTest4 = () =>{
    const claculator = {
        firstNum : 3,
        secondNum : 7,

        print : function (){
            const add = () => {
                //안에있는 정봅를 보기 위함
                console.log("ArrowFunctionTest4" + JSON.stringify(this))
                console.log("ArrowFunctionTest4" + this)
                return this.firstNum + this.secondNum
            }
            console.log(this.firstNum+ " + " + this.secondNum + " = " + add())
            
    }
}
            //출력값은 3 + 7 = 10

    claculator.print()

    return (
        <div className = "ArrowFunctionTest4">
            <p>
            ArrowFunctionTest4
            </p>
        </div>
    )
}

export default ArrowFunctionTest4