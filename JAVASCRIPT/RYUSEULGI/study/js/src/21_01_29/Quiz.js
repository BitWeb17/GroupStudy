import React from 'react'

function Quiz() {

    const teamA = ['고동영', '장해솔', '류슬기', '박재민', '한다은', '최현정', '오진욱', '조진형', '이정현'];
    const teamB = ['이범진', '박소현', '탁성진', '노찬욱', '박기범', '하진주', '이승윤', '최임식'];
    const numberArr = [];
    
    let one;
    let two;
    
    const lenA = teamA.length;
    const lenB = teamB.length;
    
    function allocRandomNum(length, team){
        for(let i = 0; i < length; i++){
            const randomNum = Math.floor((Math.random() * length));
            
            if(numberArr.indexOf(randomNum) == -1){
                numberArr.push(randomNum);
            } else{
                i--; 
            }
        }
    
        for(let i = 0; i < length ; i++){
            console.log(`${team[i]} = ${numberArr[i]}`);
        }
    }
    
    function shuffleNum(array){
        for(let i = 0; i < array.length; i++){
            const originArr = array[i];
            let suffleRandom = Math.floor(Math.random() * (i + 1));
            array[i] = array[suffleRandom];
            array[suffleRandom] = originArr;
        }
        return array;
    }
    
    function printTeam(length, teamName){
        one = numberArr.slice(0,4);
        two = numberArr.slice(4,length);
        console.log(`${teamName}-1조 ${one}`);
        console.log(`${teamName}-2조 ${two}`);
    }
    
    allocRandomNum(lenA, teamA);
    shuffleNum(numberArr);
    printTeam(lenA, 'A');
    
    // allocRandomNum(lenB, teamB);
    // shuffleNum(numberArr);
    // printTeam(lenB, 'B');

    return (
        <div></div>
    )
}

export default Quiz
