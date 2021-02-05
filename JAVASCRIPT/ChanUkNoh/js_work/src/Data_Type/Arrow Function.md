## 화살표 함수 Arrow Function

화살표 함수(Arrow function)는 단순히 함수를 짧게 쓰기 위한 용도로 사용되지 않는다.
자바스크립트를 사용하다 보면 저 멀리 동떨어진 곳에서 실행될 작은 함수를 작성해야 하는 상황을
자주 만나게 된다.
예를 들어, arr.forEach(func) 나 setTimeout(func) 처럼 인자로 함수를 보내야 할 때
대게 인자로 보내는 함수는 로직이 간단하고 이러한 일은 자연스러운 일이다.
그런데 어딘가에 함수를 전달하게 되면 함수의 컨텍스트를 잃을 수 있다.
이럴 때 화살표 함수를 사용하면 현재 컨텍스트를 잃지 않아 편리하다.

-------------------------------------------------------------------------
### 화살표 함수에는 this가 없다.

화살표 함수 본문에서 this에 접근하면, 외부에서 값을 가져온다.

```javascript
let group = {
    title: "1모둠",
    student: ["보라", "호진", "지민"],
    
    shouwList() {
        this.student.forEach(
            this.student.forEach(
                student => alert(this.title + ': ' + student)
            )
        );
    }
};
group.shouwList();
```
위 예시의 forEach에서 화살표 함수를 사용했기 때문에 화살표 함수 본문에 있는
this.title은 화살표 함수 바깥에 있는 메서드인 showList가 가리키는 대상과 동일해진다.

```javascript
let group = {
    title: "1모둠",
    students: ["보라", "호진", "지민"],

    showList() {
        this.students.forEach(function(student) {
            alert(this.title + ': ' + student)
        });
    }
};
group.showList();
```
위 예시의 경우 this.title의 참조는 function 그 자체가 된다. 하지만 일반 함수는
this 참조를 외부가 아닌 내부에서 찾기 때문에 undefined가 참조된다.

