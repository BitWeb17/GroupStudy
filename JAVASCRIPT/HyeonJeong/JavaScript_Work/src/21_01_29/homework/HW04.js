import { findAllByTestId } from "@testing-library/react"

const HW04 = () => {
    const INIT = 1

    const START  = 0
    const END = 15

    const CRITERIA = 15

    const ERROR = -1

    var emp = []
    var empNum

    // 0 ~ 14 까지 15개를 채운다는 의미
    for(var i = START; i < END; i++) {
        empNum = Math.floor(Math.random() * CRITERIA) + INIT
        
        // indexOf()를 통해 특정 가ㅄ을 찾아줌
        // 만약 찾지 못한다면 에러의 의미로 -1을 리턴한다 
        // 실제 리턴하는 타입이 NUMBER에 해당하므로 --도 무방
        if(emp.indexOf(empNum) == ERROR) {
           emp.push(empNum)
           console.log("Homework04: %d - %d", i, emp[i++])
        }
    }

    return(
        <div className = "HW04">
            <p>
                Homework04
            </p>
        </div>
    )
}

export default HW04