const writeBtn = document.getElementById('writeBtn');

function writeSubmit(){
    const formObj = window.onload;
    
    writeBtn.addEventListener('click', () => {
        formObj.setAttribute("action", "write");
        formObj.setAttribute("method", "post");
        formObj.submit();
        self.location.href = 'list';
    });
}

writeSubmit();

// $(document).ready(function() {
//     var formObj = $("#community");

//     $("#btnRegister").on("click", function() {
//         // attributesName value
//         formObj.attr("action", "write")
//         formObj.attr("method", "post")
//         formObj.submit()
//     });
// })

