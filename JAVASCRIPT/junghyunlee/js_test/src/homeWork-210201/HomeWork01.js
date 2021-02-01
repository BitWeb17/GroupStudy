const HomeWork01 = () => {
    //  1, 1, 1, 3, 5, 9, 17, 31, 57, 105, 193, ......
    // 첫째, 둘째, 셋째 더해서 넷째 출력.

    // 내가 원하는 항의 값을 출력
    // 숫자 입력
    let oneNum = 1

    function inputNumber(num) {



        for (var i = oneNum; i <= num ; i++) {

            let firstNum = oneNum;
            let SecondNum = oneNum;
            let ThirdNum = oneNum;

            let totalNum = firstNum + SecondNum + ThirdNum
            console.log("totalNum", totalNum)

            firstNum = SecondNum
            SecondNum = ThirdNum
            ThirdNum = totalNum

        }

        return num
    }

    let a = inputNumber(10)

   // function printInputNumber(){
    //    console.log("입력하신 항의 출력 값 = %d",  a)
   // }

    return (
        <div className="HomeWork01">
            <p>
                Home Work01
            </p>
        </div>
    )
}

export default HomeWork01