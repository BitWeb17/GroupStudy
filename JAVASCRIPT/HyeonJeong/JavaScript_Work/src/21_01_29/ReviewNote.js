const ReviewNote = () => {
    const simplePrint = function() {
        console.log('simplePrint!')
    }

    const simplePrint = () => console.log('simplePrint!')
    
    const add = function(a,b) {
        return a+b
    }
    const add = (a,b) => a+b
    const simpleMultiply = (a,b) => {
        // do something more...
        return a * b
    }

    let hi = ['h', 'i']
    let world = ['w', 'o', 'r', 'l', 'd']
    let mark = ['!']

    console.log(hi)
    hi = hi.concat(world)
    console.log(hi)
    hi = hi.concat(mark)
    console.log(hi)

    class Shape {
        constructor(width, height, color) {
            this.width = width
            this.height = height    
            this.color = color
        }
        draw() {
            console.log(`drawing ${this.color} color!`)
        }
        getArea() {
            return this.width * this.height
        }
    }

    class Square extends Shape {}
    class Triangle extends Shape {
        draw () {
            super.draw()
            console.log(`🔺`)
        }
        getArea() {
            return (this.width * this.height) / 2
        }
    }
    const square = new Square(10,20,'yellow')
    square.draw()
    console.log(square.getArea())

    const triangle = new Triangle(10,20,'black')
    triangle.draw()
    console.log(triangle.getArea())

    class Article {
        static publisher = 'Happy Hacking'

        constructor(number) {
            this.number = number
        }

        static printPublisher() {
            console.log(Article.publisher)
        }
    }

    const article1 = new Article(1)


    console.log(article1.publisher)
    console.log(Article.publisher)
    Article.printPublisher()

    class Person {   

        constructor(name, age) {
            this.name = name
            this.age = age
        }

        speak() {
            console.log(`${this.name}: hello!`)
        }
    }

    const May = new Person('HyeonJeong', 27)

    console.log(May.name)
    console.log(May.age)
    May.speak()

    return (
        <div className = "ReviewNote">
            <p>
                질문노트
            </p>
        </div>
    )
}

export default ReviewNote