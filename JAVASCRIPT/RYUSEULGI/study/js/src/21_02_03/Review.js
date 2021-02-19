import React from 'react'

const Review = () => {

    const teamNum = 4;
    const NUMOFPERSON = 1000;
    const FEE = 10000000;
    const PARTICIPANTSTAKE = 0.67;
    const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE;
    
    const NumberWithCommas = (x) => {
        return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    }
    
    const AllocRandNum = (arr) => {
        for(let i = 0; i < arr.length; i++){
            arr[i] = Math.floor(Math.random() * 10000) + 1;
        }
        console.log(arr);
    }
    
    const CreateRandTeam = (arr, num) => {
        const ERROR = -1;
        const range = arr.length / num;  // 250
    
        let randNum;
        
        // 팀을 1000명을 4명씩으로 팀을 나누기 때문에 그 범위 만큼 돌려주기
        for(let i = 0; i < range;){
            randNum = Math.floor(Math.random() * 250 ) + 1;
            // 팀 번호가 중복되지 않게 중복제거 해주기
            // 배열에서 중복되는 번호가 없다면
            if(arr.indexOf(randNum) == ERROR){
                for(let j = 0; j < num; j++){
                    // 팀은 0~249 * 4 + 0~3 으로 결정된다.
                    arr[i * num + j] = randNum;
                }
                i++;
            }
        }
        console.log('팀번호' + arr);
    }
    
    const CheckWinner = (arr, winArr) => {
        const CRITERIA = 1013;
    
        for(let i = 0; i < arr.length; i++) {
            // console.log(!(arr[i] % CRITERIA));
            if(!(arr[i] % CRITERIA)) {
                winArr[i] = 1;  // true
                // console.log('check' + winArr);
            } else {
                winArr[i] = 0;
            }
        }
        console.log('당첨여부' + winArr);
    }
    
    // 배열을 팀별로 나누기
    Array.prototype.arrDiv = function (num) {
        let arr = this;
        let len = arr.length;
        let cnt = Math.ceil(len / num);
    
        let newArr = []
        
        // 4개팀씩 구분하기 위함
        for(var i = 0; i < cnt; i++) {
            newArr.push(arr.splice(0, num));
        }
        // console.log(newArr);
        return newArr;
    }
    
    const CalcDiv = (winArr, price) => {
        const ALL = 16;
        const THREEFOUR = 8;
        const TWOFOUR = 4;
        const ZERO = 0;
    
        const TEAMMEMNUM = 4;
    
        const divWinArr = winArr.arrDiv(TEAMMEMNUM);
        const arrLen = divWinArr.length;
    
        let allArr = new Array(arrLen);
        let subArr = new Array(arrLen);
    
        for(let i = ZERO; i < arrLen; i++){
            // 모든 팀원이 당첨된 경우 배열이 0보다 크면 value리턴
            allArr[i] = divWinArr[i].every((value) => {
                return value > ZERO;
            });
            // 팀원들의 배열값 더하기 최대 4 최소 0으로 나온다.
            subArr[i] = divWinArr[i].reduce((total, value) => {
                return total + value;
            });
        }
    
        let divPrice = allArr.reduce((total, value) => {
            if(value == true){
                return total + ALL;
            } else {
                return total;
            }
        }); 
    
        divPrice += subArr.reduce((total, value) => {
            return total + value;
        });
    
        const finalPrice = Math.round(price / divPrice);
        
        console.log(`1배수 배당금 ${NumberWithCommas(finalPrice)} 1인당 배당금 ${NumberWithCommas(finalPrice / TEAMMEMNUM)}`);
        console.log(`4배수 배당금 ${NumberWithCommas(TWOFOUR * finalPrice)} 1인당 배당금 ${NumberWithCommas(TWOFOUR * finalPrice / TEAMMEMNUM)}`);
        console.log(`8배수 배당금 ${NumberWithCommas(THREEFOUR * finalPrice)} 1인당 배당금 ${NumberWithCommas(THREEFOUR * finalPrice / TEAMMEMNUM)}`);
        console.log(`16배수 배당금 ${NumberWithCommas(ALL * finalPrice)} 1인당 배당금 ${NumberWithCommas(ALL * finalPrice / TEAMMEMNUM)}`);
    }
    
    let arr = new Array(NUMOFPERSON);
    let teamArr = new Array(NUMOFPERSON);
    let winArr = new Array(NUMOFPERSON);
    
    console.log('상금 ' + NumberWithCommas(PRICE)  + '원');
    AllocRandNum(arr);
    CheckWinner(arr, winArr);
    CreateRandTeam(teamArr, teamNum);
    CalcDiv(winArr, PRICE);
    console.log('종료');
    

    return (
        <div>
            
        </div>
    )
}

export default Review
