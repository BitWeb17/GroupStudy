const NonpromiseTest =()=>{
    function hello(){
        setTimeout( function(){
            console.log("hellow")
        }, 2000)
    }
    function world(){
        setTimeout(function(){
            console.log("world!!")
        },1000)
    }
    hello()
    world()

    return (
        <div className = "NonpromiseTest">
            <p>NonpromiseTest</p>
        </div>
    )
}

export default NonpromiseTest