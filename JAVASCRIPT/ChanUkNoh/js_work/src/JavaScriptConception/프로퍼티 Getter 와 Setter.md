## 프로퍼티 Getter 와 Setter
객체의 프로퍼티는 두 종류로 나뉜다. 첫 번째 종류는 데이터 프로퍼티로 데이터를 담는 용도로 사용한다.  
두 번째는 접근자 프로퍼티이다. 접근자 프로퍼티의 본질은 함수인데, 이 함수는 값을 흭득하고 설정하는 역할을 한다.  
그런데 외부 코드에서는 함수가 아닌 일반적인 프로퍼티처럼 보인다.  
### getter 와 setter
접근자 프로퍼티는 getter와 setter 메서드로 표현된다. 객체 리터럴 안에서는 get 과 set으로 나타낼 수 있다.
```javascript
let user = {
    name: "John",
    usrname: "Smith",
    
    get getName() {
        return this.propName;
    },
    
    set setName(value) {
        this.propName = value
    }
}

user.name = "Chanuk Noh" // 일반 프로퍼티 처럼 사용해 setter가 실행됨.
```
바깥 코드에선 접근자 프로퍼티를 일반 프로퍼티처럼 사용할 수 있다. 접근자 프로퍼티는 이런 아이디엉서 출발했다.  
접근자 프로퍼티를 사용하면 함수처럼 호출하지 않고, 일반 프로퍼티에서 값에 접근하는 것처럼 평범하게 user.fullName을  
사용해 프로퍼티 값을 얻을 수 있다. 나머지 작업은 getter 메서드가 뒷단에서 처리해준다.  
### getter 와 setter 똑똑하게 활용하기
getter 와 setter를 실제 프로퍼티 값을 감싸는 래퍼(wrapper)처럼 사용하면, 프로퍼티 값을 원하는 대로 통제할 수 있다.  
아래 예시에선 name을 위한 setter를 만들어 user의 이름이 너무 짧아지는 것을 방지하고 있다.  
실제 값은 별도의 프로퍼티 _name에 저장된다.  
```javascript
let user = {
    get name() {
        return this._name
    },
    
    set name(value) {
        if (value.leading < 4) {
            alert("이름이 너무 짧습니다.")
            return;
        }
        this._name = value;
    }
}

user.name = "Pete"
alert(user.name) // Pete
```
