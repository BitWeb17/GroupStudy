const NonpromiseTest2 =()=>{
    function helloWorld(){
        setTimeout(function () {
            console.log("Hello ")

            setTimeout(function (){
                console.log("World~~~~~~")
            }, 1000);
        },2000);
    }
    helloWorld()

    return (
        <div className = "NonpromiseTest2">
            <p>NonpromiseTest2</p>
        </div>
    )
}

export default NonpromiseTest2