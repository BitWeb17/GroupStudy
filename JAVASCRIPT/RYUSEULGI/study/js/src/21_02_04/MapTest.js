import React from 'react'

const MAXTEAMNUM = 4;
const NUMOFPERSON = 1000;
const TEAMNUM = NUMOFPERSON / MAXTEAMNUM;
const FEE = 10000000;
const PARTICIPANTSTAKE = 0.67;
const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE;

const MapTest = () => {
    const arr = new Array(NUMOFPERSON);
    const teamArr = new Array(TEAMNUM); 
    const winArr = new Array(NUMOFPERSON);

    const teamMap = new Map();
    
    AllocRandomNumber(arr);
    CreateRandTeam(teamArr, MAXTEAMNUM);
    CheckWinner(arr,winArr);
    
    teamMap.set('randomNum', arr);
    for(let i = 0; i < TEAMNUM; i++) {
        teamArr[i] = new Array(MAXTEAMNUM);
    } 
    teamMap.set("team", teamArr);
    teamMap.set("winner", winArr);

    CalcDiv(winArr, PRICE);
    console.log(teamMap);

    return (
        <div>
            
        </div>
    )
}

const NumberWithCommas = (x) => {
    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

const AllocRandomNumber = (arr) => {
    for(let j = 0; j < arr.length; j++) { 
        arr[j] = Math.floor(Math.random() * 10000) + 1
    }
}

const CreateRandTeam = (arr, num) => {
    const ERROR = -1;
    const range = arr.length / num;

    let randNum;
    
    for(let i = 0; i < range;){
        randNum = Math.floor(Math.random() * 250 ) + 1;
        if(arr.indexOf(randNum) == ERROR){
            for(let j = 0; j < num; j++){
                arr[i * num + j] = randNum;
            }
            i++;
        }
    }
}

const CheckWinner = (arr, winArr) => {
    const CRITERIA = 1013;

    for(let i = 0; i < arr.length; i++) {
        console.log(!(arr[i] % CRITERIA));
        if(!(arr[i] % CRITERIA)) {
            winArr[i] = 1;  // true
        } else {
            winArr[i] = 0;
        }
    }
}

Array.prototype.arrDiv = function (num) {
    let arr = this;
    let len = arr.length;
    let cnt = Math.ceil(len / num);

    let newArr = []

    for(var i = 0; i < cnt; i++) {
        newArr.push(arr.splice(0, num));
    }
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
        allArr[i] = divWinArr[i].every((value) => {
            return value > ZERO;
        });
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

export default MapTest
