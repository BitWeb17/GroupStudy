function Test() {
    let arr = []
    let arr2 = []
    

    for(let j = 0 ; j < 3 ; j ++){
        arr2 = new Array(3)
        for(let i = 0 ; i < 4 ; i++){
        let playerRand =  Math.floor((Math.random() * 1000)+1)
        arr.push(playerRand)
        }
        const arr3 = Array(3).fill(null).map((arr) => Array())
    }


console.log(arr3)
return (
    <div className="Test">
        <p>Test</p>
    </div>
)
}


    


export default Test