## Prototype Inheritance

개발을 하다 보면 기존에 있는 기능을 가져와 확장해야 하는 경우가 생긴다.  
  
예를 들어, 사람에 관한 정보를 가진 user라는 객체가 있는데, 이와 유사하지만 약간의 차이가 있는 객체를  
만들어야 한다고 가정해 보자. 이때 user의 객체를 복사하거나 다시 구현하지 않고 그 객체에 몇 가지 정보만  
얹어 객체를 만들 수 있지 않을까? 라는 생각이 들 것이다.  
프로토타입 상속을 이용하면 위와 같은 생각을 해결할 수 있다.  
### [[Prototype]]
자바스크립트의 객체는 명세서에 명명한 [[Prototype]]이라는 숨김 프로퍼티를 갖는다.  
이 숨김 프로퍼티 값은 null이거나 다른 객체에 대한 참조가되는데, 다른 객체를 참조하는 경우  
참조 대상을 프로토타입이라 부른다.  
  
프로토타입의 동작 방식은 신비스러운 면이 있다. object에서 프로퍼티를 읽으려고 하는데 해당 프로퍼티가  
없으면 자바스크립트는 자동으로 프로토타입에서 프로퍼티를 찾기 때문이다.  
  
[[Prototype]] 프로퍼티는 내부 프로퍼티이면서 숨김 프로퍼티이지만 다양한 방법을 사용해 개발자가 값을 설정할 수 있다.  
```javascript
let animal = {
    eats: true
}

let rabbit = {
    jumps: true
}

rabbit.__proto__ = animal;

console.log(rabbit.eats); // true
console.log(rabbit.jumps); // true
```
"rabbit은 animal로 부터 상속받는다" 라는 의미를 가진다. 
  
실제 프로토타입 상속 체이닝은 더욱 길어질 수 있다. 하지만 프로토타입 체이닝엔 두 가지 제약사항이 있다.  
1. 순환 참조는 허용되지 않는다.
2. __proto__의 값은 객체나 null만 가능하다. 다른 자료형은 무시된다.
* 객체는 두 개의 객체를 상속받지 못한다는 당연한 제약도있음!

### 쓸 때는 프로토타입을 사용하지 않는다.
프로토타입은 프로퍼티를 읽을 때만 사용한다. 프로퍼티를 추가, 수정하거나 지우는 연사는 객체에 직접해야 한다.  
```javascript
let animal = {
    eats: true,
    walk() {
        console.log("동물은 기어다닌다.")
    }
}

let rabbit = {
    __proto__: animal
}

rabbit.walk = function() {
    console.log("토끼는 깡충 뛴다.")
}

rabbit.walk(); // 토키는 깡충 뛴다.
```
그런데 접근자 프로퍼티는 setter함수를 통해서 프로퍼티에 값을 할당하므로 이 규칙이 적용되지 않는다.  
접근자 프로퍼티에 값을 할당하는 것은 함수를 호출하는 것과 같기 때문이다.
```javascript
let user = {
    name: "John",
    surname: "Smith",
    
    set fullName(value) {
        [this.name, this.surname] = value.split(" ");
    },
    
    get fullName() {
        return `${this.name} ${this.surname}`;
    }
};

let admin = {
    __proto__: user,
    isAdmin: true
}

console.log(admin.fullName); // John Smith, 기존대로 출력

admin.fullName = "Alice Cooper"; 

console.log(admin.fullName); // Alice Cooper , admin 수정
console.log(user.fullName); // John Smith , user 기존
```
### 'this'가 나타내는 것
위 예시를 보면 set fullName 호출 시 setting된 값은 user에 저장될까, 아니면 admin에 저장될까?  
답은 간단하다. this는 프로토타입에 영향을 받지 않는다.  
메서드를 객체에서 호출했든 프로토타입에서 호출했든 상관없이 this는 언제나 . 앞에 있는 객체가 된다.  
admin.fullName 으로 setter를 호출 하면 this는 user가 아닌 amdin이 된다는 것이다.  
  
즉, 상속받은 메서드를 사용하더라도 객체는 프로토타입이 아닌 자신의 상태를 수정한다.
### for ... in 반복문
for ... in 반복문은 상속 프로퍼티도 순회대상에 포함시킨다.  
* obj.hasOwnProperty(key)를 이용하면 상속 프로퍼티를 순회 대상에서 제외할 수 있음.  
```javascript
let animal = {
    eats: true
}

let rabbit = {
    jumps: true,
    __proto__: animal
}

for (let prop in rabbit) {
    let isOwn = rabbit.hasOwnProperty(prop)
    
    if (isOwn) {
        console.log("내꺼")
    } else {
        console.log("받은 거")
    }
}
```
위 예시의 상속 관계를 그림으로 나타내면 다음과 같다.  
rabbit -> animal -> Object.prototype -> null  
* 객체 Object.prototype은 toString, hasOwnProperty 같은 메서드를 가지고 있는 객체이다.  

(I)키 - 값을 순회하는 메서드는 대부분은 상속 프로퍼티를 제외하고 동작한다.
Object.keys, Object.values 같은 객체의 키 - 값을 대상으로 하는 메서드는 대부분  
상속 프로퍼티를 제외하고 동작한다.

### 함수의 prototype 프로퍼티
new Function() 와 같은 생성자 함수를 이용하면 새로운 객체를 만들 수 있다.  
그런데 F.prototype이 객체면 new 연산자는 F.prototype을 사용해 새롭게 생성된 객체의 [[protoType]]을 설정한다.  
  
F.prototype에서 prototype은 F에 정의된 일반 프로퍼티라는 점에 주의해야 한다. 앞서 배웠던 프로토타입 객체와  
같아 보이지만 F.prototype에서 prototype은 이름만 같은 일반 프로퍼티이다.
```javascript
let animal = {
    eats: true
}

function Rabbit(name) {
    this.name = name
}

let rabbit = new Rabbit("White Rabbit") // rabbit.__proto__ = animal

console.log(rabbit.eats) // true
```
Rabbit.prototype = animal은 new Rabbit을 호출해 만든 새로운 객체의 [[Prototype]]을 animal로 설정  
하라 라는 것을 의미한다.  
***
(I)F.prototype은 new F 를 호출할 때만 사용된다.  
new F를 호출해 새롭게 만든 객체의 [[Prototype]]을 할당해준다.  
새로운 객체가 만들어진 후에 F.prototype 프로퍼티가 바뀌면 new F로 만들어지는 새로운 객체는 또 다른 객체를  
[[Prototype]]으로 갖게된다. 다만, 기존에 있던 객체의 [[Prototype]]은 그대로 유지된다.
***
### 함수의 prototype 프로퍼티와 constructor 프로퍼티
개발자가 특별히 할당하지 않더라도 모든 함수는 prototype프로퍼티를 갖는다.  
기본 프로퍼티인 prototype은 constructor 프로퍼티 하나만 있는 객체를 가리키는데, 이 constructor 프로퍼티는  
함수 자신을 가리킨다.
```javascript
function Rabbit() {}
// 기본 prototype:
// Rabbit.prototype = { constructor: Rabbit }

console.log( Rabbit.prototype.constructor == Rabbit ); // true
```
특별히 조작을 가하지 않는다면 Rabbit을 구현한 객체 모두에서 [[Prototype]]을 거쳐 constructor  
프로퍼티를 사용할 수 있다. constructor로 새로운 객체를 만들 수도 있다.
```javascript
function Rabbit(name) {
    this.name = name
    alert(name)
}

let rabbit = new Rabbit("White Rabbit")
let rabbit2 = new rabbit.constructor("Black Rabbit")
```
객체가 있는데 이 객체를 만들 때 어떤 생성자가 사용되었는지 알 수 없는 경우, 이 방법을 유용하게 쓸 수 있다.  
어느 방식을 사용해 객체를 만들든 constructor에서 가장 중요한 점은 다음과 같다.  
자바스크립트는 알맞은 constructor 값을 보장하지 않는다는 것이다.  
함수에 기본으로 prototype 값이 설정되긴 하지만 그게 전부이다. constructor에 벌어지는 모든 일은  
전적으로 개발자에게 달려있다. 함수의 기본 prototype 값을 다른 객체로 바꾸면 이 객체엔 constructor가 사라진다.  
```javascript
function Rabbit() {}
Rabbit.prototype = {
    jumps: true
}

let rabbit = new Rabitt()
console.log(rabbit.constructor === Rabbit) // false
```
이런 상황을 방지하고 알맞은 constructor 를 유지하려면 prototype 전체를 덮어쓰지말고 기본 prototype에  
원하는 프로퍼티를 추가/제거해야 한다.
### 네이티브 프로토타입
prototype 프로퍼티는 자바스크립트 내부에서도 광범위하게 사용된다.  
모든 내장 생성자 함수에서 prototype 프로퍼티를 사용한다.  
### Object.prototype
```javascript
let obj = {}
console.log(obj) // [object Object] = ??
```
[object Object] 라는 문자열은 어디서 오는 것일까요? toString 메서드에서  
이문자열을 생성한다는 것은 아는데 이 코드는 어디있는 것일까요? obj는 비어있는데...  
obj = new Object() == obj = {} 같은 표현이다. 여기서 Object는  
내장 객체 생성자 함수인데 이 생성자 함수의 prototype은 toString 등 다양한  
메서드가 구현되어있는 거대한 객체를 참조한다.
### 다른 내장 프로토타입
Array, Date, Function 을 비롯한 내장 객체들 역시 프로토타입에 메서드를 저장해 놓는다.  
배열 [1, 2, 3] 을 만들면 기본 new Array() 생성자가 내부에서 사용되는데 Array.prototype이  
배열 [1, 2, 3] 의 프로토타입이 된다. Array.prototype은 배열 관련 메서드를 가지고 있다.  
모든 내장 프로토타입의 꼭대기엔 Object.prototype이 있다고 규정한다. 이런 규정 때문에  
모든 것은 객체를 상속받는다 라는 말도 있다.
  
체인 상의 프로토타입엔 중복 메서드가 있을 수 있다. Array.prototype엔 요소 사이에 쉼표를 넣어  
요소 전체를 합친 문자열을 반환하는 자체 메서드 toString이 있다.  
객체인 배열을 문자열로 형변환해도 [object Object] 가 뜨지 않는덴 이런 이유가 있다.  
프로토타입 체인 상에서 가장 가까운 곳에 있는 메서드를 사용하게된다.  
### 원시값
문자열과 숫자 불린값은 객체가 아니다. 그런데 이런 원시 값들의 프로퍼티에 접근하려고 하면  
내장 생성자 String, Number, Boolean 을 사용하는 임시 래퍼 객체가 생성된다.  
임시 래퍼 객체는 이런 메서드를 제공하고 난 후에 사라진다.  
각 자료형에 해당하는 래퍼 객체의 메서드를 프로토타입 안에 구현해 놓고 String.prototype,
Number.prototype, Boolean.prototype을 사용해 쓸 수 있도록 규정한다.  
null과 undefiend에 대응하는 래퍼 객체는 없음!  
### 네이티브 프로토타입 변경하기
네이티브 프로토타입은 수정이 가능하다. 새로운 내장 메서드를 만들어 전역으로 사용이 가능하다.  
하지만 이는 좋지않은 방법이다. 다른 프로토타입과 충돌이 날 수 있고 다른 라이브러리의 메서드를  
덮어쓸 가능성도 있기 때문이다.  
