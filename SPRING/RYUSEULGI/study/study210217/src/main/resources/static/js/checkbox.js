const checkboxs = document.getElementsByName('checkbox'),
        checkAll = document.getElementById('check-all');

function selectAll(){
    checkAll.addEventListener('click', () => {
        checkboxs.forEach((e) => {
            e.checked = this.checked;
        });
    });
}

selectAll();