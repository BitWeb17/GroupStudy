const RandomMember = () => {

    let Ajo = ["[최현정]", "[오진욱]", "[류슬기]", "[장해솔]", "[조진형]",
               "[이정현]", "[고동영]", "[박재민]", "[한다은]"]

    let Bjo = [ "[최임식]", "[탁성진]", "[하진주]", "[이범진]",
                "[이승윤]", "[박기범]", "[박소현]", "[노찬욱]"]

    let numOfAjo = Ajo.length
    let numOfBjo = Bjo.length

    let arrAjo = []
    let arrBjo = []

    let randomNum

    while(true){
        randomNum = Math.floor(Math.random() * numOfAjo)
        console.log(randomNum)
        
        if(!arrAjo.includes(randomNum)){
            arrAjo.push(randomNum)
            console.log("A조 %d번: %s" , arrAjo[randomNum], Ajo[arrAjo[randomNum]])

            if(arrAjo.length === numOfAjo) {
                break
            }
        }  
    }

    while(true){
        randomNum = Math.floor(Math.random() * numOfBjo)
        console.log(randomNum)
        
        if(!arrBjo.includes(randomNum)){
            arrBjo.push(randomNum)
            console.log("B조 %d번: %s" , arrBjo[randomNum], Bjo[arrBjo[randomNum]])

            if(arrBjo.length === numOfBjo) {
                break
            }
        }     
    }

    return (
        <div className = "RandomMember">
            <p>
                Random Member<br/><br/>
                A조<br/>
                {Ajo[arrAjo[0]]},{Ajo[arrAjo[1]]},{Ajo[arrAjo[2]]},{Ajo[arrAjo[3]]}<br/>
                {Ajo[arrAjo[4]]},{Ajo[arrAjo[5]]},{Ajo[arrAjo[6]]},{Ajo[arrAjo[7]]},{Ajo[arrAjo[8]]}<br/><br/>
                B조<br/>
                {Bjo[arrBjo[0]]},{Bjo[arrBjo[1]]},{Bjo[arrBjo[2]]},{Bjo[arrBjo[3]]}<br/>
                {Bjo[arrBjo[4]]},{Bjo[arrBjo[5]]},{Bjo[arrBjo[6]]},{Bjo[arrBjo[7]]}<br/>
            </p>
        </div>
    )
}

export default RandomMember

