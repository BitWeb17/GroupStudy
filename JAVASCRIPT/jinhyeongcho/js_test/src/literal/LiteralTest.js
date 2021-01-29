const LiteralTest = () =>{
    let str1 = '3 *1= 3'

    console.log(str1)

    let first = 3
    let second = 7

    let str2 = `${first}*${second} = ???`
    console.log(str2)

    return(
        <div className="LiteralTest">
            <p>
                Literal Test
            </p>
        </div>
    )
}
export default LiteralTest
