const LiteralTest = () => {
    let str1 = "3 * 1 = 3";

    console.log(str1);

    let first = 3;
    let second = 7;

    // URL 생성시 아주 유용하다.
    // localhost:7777/register
    // localhost:7777/manage
    // 이런식으로 --> localhost:7777/`${variable}
    let str2 = `${first} * ${second} = ???`

    // 데이터 출력이 아닌 입력이나 가공에 유용하다.
    console.log(str2)

    return (
        <div className="LiteralTest">
            <p>
                Literal Test
            </p>
        </div>
    )
}

export default LiteralTest