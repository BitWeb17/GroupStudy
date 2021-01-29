const FunctionObjectTest2 = () => {
    function Programming(){
        this.name = "JavaScript"
        this.students = 17
    }

    Programming.prototype.getName =function (){
        return this.name
    }

    let prog = new Programming()

    if (Programming){
        console.log("FunctionObjectTest2: Programming true")
    } else {
        console.log("FunctionObjectTest2: Programming false")
    }


    console.log("FunctionObjectTest2: " + prog)
    if (prog){
        console.log("FunctionObjectTest2: prog true")
    } else {
        console.log("FunctionObjectTest2: prog false")
    }

    console.log("FunctionObjectTest2: " + prog.name)
    if (prog.name){
        console.log("FunctionObjectTest2: prog.name true")
    } else {
        console.log("FunctionObjectTest2: rog.name false")
    }

    console.log("FunctionObjectTest2: " + prog.students)
    if (prog.students){
        console.log("FunctionObjectTest2: prog.students true")
    } else {
        console.log("FunctionObjectTest2: prog.students false")
    }

    console.log("FunctionObjectTest2: prog.getName " + prog.getName())
    console.log(prog.getName())
    if (prog.getName()){
        console.log("FunctionObjectTest2: prog.getName true")
    } else {
        console.log("FunctionObjectTest2: prog.getName false")
    }


    console.log("FunctionObjectTest2: " + prog.toString())
    if (prog.toString()){
        console.log("FunctionObjectTest2: prog.toString() true")
    } else {
        console.log("FunctionObjectTest2: prog.toString() false")
    }

    console.log("FunctionObjectTest2: " + prog.name2)
    if (prog.name2){
        console.log("FunctionObjectTest2: prog.name2 true")
    } else {
        console.log("FunctionObjectTest2: prog.name2 false")
    }

    console.log("FunctionObjectTest2: " + prog.getname2)
    if (prog.getname2){
        console.log("FunctionObjectTest2: prog.getname2 true")
    } else {
        console.log("FunctionObjectTest2: prog.getname2 false")
    }

    console.log("FunctionObjectTest2: " + ("name" in prog))
    console.log("FunctionObjectTest2: " + ("students" in prog))
    console.log("FunctionObjectTest2: " + ("getname" in prog))
    console.log("FunctionObjectTest2: " + ("name2" in prog))

    //console.log("FunctionObjectTest2: " +)


    return(
        <div className="FunctionObjectTest2">
            <p>
                FunctionObject Test2
            </p>
        </div>
    )
}
export default FunctionObjectTest2