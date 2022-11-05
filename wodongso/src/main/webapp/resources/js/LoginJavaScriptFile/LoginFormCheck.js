const id = document.getElementById("userId");
const password = document.getElementById("userPass");
const loginBtn = document.getElementById("loginBtn");

let setIsId = false;
let setIsPassword = false;

function onIdHandler(){
	const idValue = id.value.trim();
	
	if(idValue === ''){
		setError(id, '아이디를 입력해주세요.');
		setIsId = false;
	} else{
		setSuccess(id);
		setIsId = true;
	}
}

function onPasswordHandler(){
	const passwordValue = password.value.trim();
	
	if(passwordValue === ''){
		setError(password, '비밀번호를 입력해주세요.');
		setIsId = false;
	} else{
		setSuccess(password);
		setIsId = true;
	}
}

const setError = (element, message) => {
	const inputControl = element.parentElement;
	const errorDisplay = inputControl.querySelector('.error');
	
	errorDisplay.innerText = message;
	
	inputControl.classList.add('error');
	inputControl.classList.remove('success');
}

const setSuccess = (element) => {
	const inputControl = element.parentElement;
	const errorDisplay = inputControl.querySelector('.error');
	
	errorDisplay.innerText = '';
	
	inputControl.classList.add('success');
	inputControl.classList.remove('error');
}

loginBtn.addEventListener('click', (event) => {
	
	onIdHandler();
	onPasswordHandler();
	
	if(!(setIsId && setIsPassword)){
		event.preventDefault();
	}
	

})

