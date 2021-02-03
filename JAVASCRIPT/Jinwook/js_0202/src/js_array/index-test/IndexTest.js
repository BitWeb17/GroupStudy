const IndexTest = () => {
    let vendors = ["ti","stm","adi","nvidia","qualcomm",
                    "Xilinx","amd","nxp","freescale","infineon",
                    "Xilinx","amd","nxp","freescale","infineon"]
    let lastIdx = vendors.lastIndexOf("freescale")
    console.log("What is it? " + lastIdx)
    
    
    function andTestFunc(value) {
        return value > 3
    }

    console.log("After some(): " + orTestSuccess)


    return(
        <div className = "IndexTest">
            <p>
                index-test: IndexTest
            </p>
        </div>
    )
} 

export default IndexTest