import React from 'react'

function IdxTest() {

    const vendors = ['ti', 'sta','adi','nvidia', 'qualcomm', 'amd', 'ti', 'sta','adi','nvidia', 'qualcomm', 'amd'];
    const lastIdx = vendors.lastIndexOf('ti');
    
    console.log(vendors);
    console.log(lastIdx); // ti가 마지막으로 나오는 순서 6

    const idx = vendors.indexOf('ti');
    console.log(idx);    // 0

    return (
        <div>
            
        </div>
    )
}

export default IdxTest
