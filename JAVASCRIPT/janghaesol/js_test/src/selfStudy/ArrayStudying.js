const fruits = ['apple', 'banana', 'grape']

//호출하는 방법들
//1. for
for (let i = 0; i < fruits.length; i++{
    console.log(furits[i])
    //console 출력값 : 'apple'
    //               'banana'
    //               'grape'  
}

//2. for of
for(let fruits of fruits){
    console.log(furits)
     //console 출력값 : 'apple'
    //               'banana'
    //               'grape'
}

//3. forEach           (value, index, array전체)
            //1)아래와같이 이름이 없는 function
            //익명객체를써서 일시 메모리 알아서 할당하게 가능 
fruits.forEach(function(furit, index, array)){
    console.log(furit,index. array)
    // value만 입력시출력값: 'apple'
    //                   'banana'
    //                   'grape'
    // index도 입력시 출력값:'apple'  0
    //                   'banana' 1
    //                   'grape'  2
    //array도 입ㅂ력시 출력값'apple'  0
    //                   (3)['apple','banana',grape']
    //                   'banana' 1
    //                   (3)['apple','banana',grape']
    //                   'grape'  2
    //                   (3)['apple','banana',grape']
}
 //1)대괄호도 없어도 된다.
 //  보통 이런식을 사용할떄 array전체를 불러오지는 않는다
 fruits.forEach(furit, index) =>  console.log(furit,index)


                //()안을 비게하고 콘솔입력시
furits.forEach(function()){}
            //console에보면 3hahaha가 뜬다. 
            //fruits배열의 인자가 3개가 있기 때문
    console.log('hahaha')
}

//팝은 맨 뒤에있는 인덱스를 하나 지운다.
fruits.pop()
console.log(furits)
//결과값 ['apple', 'banana']
//이와 비슷하게 unshift, shift가 있다
//unshift 맨 앞에 인덱스를 추가
//맨앞의 인덱스를 제거
//주의: pop과 달리 shift, unshift는 앞에있던 것들을 지우고 앞으로 땡기고
//앞에있던 것들을 뒤로 밀고 넣는작업이 필요하기에 pop보다 무겁고 느리다.
//so, push 를 사용해라

//splice : 꼬아서 잇다.
//urits.splice(시작하고싶은 부분, 그 뒤로 지우고싶은 갯수)
furits.splice(2, 1)
console.log(fruits)
// 결과값 ['apple', 'banana']
만약 지운자리에 무엇인가를 넣으려면
furits.splice(1, 1,'mango', 'blueberry')
console.log(fruits)
//결과값 ['apple', 'mango', 'blueberry', 'grape']

//concat은 두가지의 배열을 합칠 수 있다.
const fruits2 = ['strawberry','raspberry']
const newFurits = fruits.concat(fruits2);
console.log(newFurits)
//결과값: ['apple', 'banana', 'grape', 'strawberry','raspberry']