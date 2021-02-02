## Spread 문법

나머지 매개변수의 반대되는 기능이다.
```javascript
alert( Math.max(3, 5, 1) ) // 5
```
배열 [3, 5, 1]이 있고 이 배열을 대상으로 Math.max를 호출하고 싶다고
가정 해보자. 아무런 조작 없이 배열을 있는 그대로 넘기면 NaN을 반환받는다.
Math.max는 배열이 아닌 숫자 목록을 인수로 받기 때문이다.

```javascript
let arr = [3, 5, 1];

alert( Math.max(arr) ); // NaN
```
Math.max (arr[0], arr[1], arr[2]) 이렇게 배열을 수동으로
나열할 수 도 있지만 배열의 길이를 알 수 없는 경우 곤란하다.

함수를 호출할 때 ...arr을 사용하면 이터러블 객체 arr이 인수 목록으로
펼쳐진다.

```javascript
let arr = [3, 5, 1];

alert(Math.max(...arr)); // 5
```
  
앞선 예시들에선 배열을 대상으로 전개 문법이 어떻게 동작하는지 살펴보았다.
그런데 배열이 아니더라도 '이터러블 객체'이면 전개 문법을 사용할 수 있다.

전개 문법을 사용해 문자열을 문자 배열로 변환하는 코드
```javascript
let str = "Hello"

alert( [...str] ); // H, e, l, l, o
```
### 배열의 복사 얻기
전개 문법을 사용해서 배열의 복사를 얻을 수 있다.
하지만, 과연 복사본과 원본을 비교하면 같을까?
```javascript
let arr = [1, 2, 3];
let arrCopy = [...arr]; 


alert(JSON.stringify(arr) === JSON.stringify(arrCopy)); // true


alert(arr === arrCopy); // false

// modifying our initial array does not modify the copy:
arr.push(4);
alert(arr); // 1, 2, 3, 4
alert(arrCopy); // 1, 2, 3
```