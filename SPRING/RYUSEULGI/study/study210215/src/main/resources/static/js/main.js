const toggleBtn = document.querySelector('.dropdown-toggle'),
        menu = document.querySelector('.dropdown-menu'),
        items = document.querySelectorAll('.dropdown-item'),
        searchBtn = document.querySelector('.search-btn');

toggleBtn.innerText = '지역을 선택해주세요(필수)';

toggleBtn.addEventListener('click', () => {
    menu.classList.toggle('active');
});

function selectItems(items){
    console.log(items.currentTarget.textContent.trim());
    const name = items.currentTarget.textContent.trim();
    toggleBtn.textContent = name;
    toggleBtn.classList.add('select');
    searchBtn.removeAttribute('disabled');
}

items.forEach((items)=>{
    items.addEventListener('click', selectItems)
});