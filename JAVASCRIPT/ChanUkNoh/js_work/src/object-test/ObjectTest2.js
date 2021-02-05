function ObjectTest2() {
    let obj = {
        _name: "test",

        get name() {
            console.log("I`m Getter")
            return this._name
        },

        set name(value) {
            console.log("I`m Setter")
            this._name = value
        },

        display: function() {
            console.log("ObjectTest2: " + this.name)
        }
    }

    console.log("ObjectTest2: " + obj.name)
    console.log("ObjectTest2: " + obj._name)

    obj.name = "gogosing"
    console.log("ObjectTest2: " + obj.name)

    return (
        <div className="ObjectTest2">
            <p>
                ObjectTest2
            </p>
        </div>
    )
}

export default ObjectTest2