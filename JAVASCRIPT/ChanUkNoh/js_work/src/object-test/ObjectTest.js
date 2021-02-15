function ObjectTest() {
    let obj = {
        name: "test",

        getName: function() {
            return this.name
        },

        setName: function(name) {
            this.name = name
        },

        display: function() {
            console.log("ObjectTest: " + this.name)
        }
    }

    console.log("ObjectTest: " + obj.getName())

    obj.setName("gogosing")
    console.log("ObjectTest: " + obj.getName())

    obj.display()
    console.log("ObjectTest: " + obj["getName"]())

    obj["setName"]("Star Ocean")
    console.log("ObjectTest: " + obj["getName"]())

    return (
        <div className="ObjectTest">
            <p>
                ObjectTest
            </p>
        </div>
    )
}

export default ObjectTest