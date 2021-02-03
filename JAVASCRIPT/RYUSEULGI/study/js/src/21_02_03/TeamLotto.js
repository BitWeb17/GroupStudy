import React from 'react'

const TeamLotto = () => {

    const MAXTEAMNUM = 4;
const NUMOFPERSON = 1000;
const TEAMNUM = NUMOFPERSON / MAXTEAMNUM;
const FEE = 10000000;
const PARTICIPANTSTAKE = 0.67;
const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE;

const AllocRandomNumber = (arr) => {
    for(let j = 0; j < arr.length; j++) {
        arr[j] = Math.floor(Math.random() * 10000) + 1
    }
    console.log('랜덤숫자' + arr);
}

const CreateRandTeam = (arr, num) => {
    console.log("CreateRandomTeam Called");
    const range = arr.length / num;

    for(let j = 0; j < range; j++){
        arr[j] = Math.floor(Math.random() * 250 ) + 1;
    }
    // set 객체로 만들어 중복제거하고 배열로 바꾸기
    // 중복되는 것을 제거하였으나 총 개수가 250보다 작게 출력됨
    const set = new Set(arr);
    const newArr = [...set];
    console.log(newArr);
}


console.log("상금 = " + PRICE);

let arr = new Array(NUMOFPERSON);
let teamNumArr = new Array(TEAMNUM)
AllocRandomNumber(arr);
CreateRandTeam(teamNumArr, MAXTEAMNUM);


// push 대신에 add
// indexOF 대신에 has
// 를 사용하면 될듯

let teamMap = new Map();

// teamMap.forEach((key, value) => {
//     key = 'randomNum';
//     value = Math.floor(Math.random() * 10000) + 1;
//     console.log(key, value);
// });
// console.log(teamMap);

let teamArr = new Array(TEAMNUM)

for(var i = 0; i < TEAMNUM; i++) {
    teamArr[i] = new Array(MAXTEAMNUM)
}
// 4개팀씩 나눈 것
console.log(teamArr);

// teamMap에 team, winner key추가
let winnerArr = new Array(NUMOFPERSON)
teamMap.set("team", teamArr)
teamMap.set("winner", winnerArr)

console.log(teamMap);

let totalMap = new Map()

    return (
        <div>
            
        </div>
    )
}

export default TeamLotto
