const IndexTest = () => {
    let vendor = ["ti","stm","adi","nvidia","qualcomm",
                   "xilinx","amd","nxp","freescale","infineon",
                  "xilinx","amd","nxp","freescale","infineon"
    ]

    let lastIdx = vendor.lastIndexOf("freescale")

    console.log(vendor)
    console.log("Where is it ? " + lastIdx)

    let idx = vendor.indexOf("freescale")

    console.log("Where is it ? " + idx)


    return(
        <div className="RepeatSIndexTestomeTest">
            <p>
                index-test : IndexTest
            </p>
        </div>
    )
}
export default IndexTest