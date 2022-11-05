<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>우동소: 로그인</title>
		<link rel="stylesheet" href="resources/CSS/styles.css?after">
	</head>
	<body>
		<a href="index.jsp">메인으로</a>
		<!-- 로그인 페이지 전체적인 구조 -->
	
		<div class="login-page_container">
			<div class="login-forms-container">
			
			<!-- 로그인 아이디 비밀번호 입력 부분 -->
				<div class ="login">
					<form action="login.do" method="post" name="loginForm" class="login-form">
						<h2 class="login-form_title">로그인</h2>
						<div class="login-input-field">
							<i class="fa-solid fa-user"></i>
							<input type="text" placeholder="아이디" name="id" id="userId" onchange="onIdHandler()">
							<div class="error"></div>
						</div>
						<div class="login-input-field">
							<i class="fas fa-lock"></i>
							<input type="password" placeholder="비밀번호" name="password" id="userPass" onchange="onPasswordHandler()">
							<div class="error"></div>
						</div>
					
						<input type="submit" value="로그인" class="login-btn solid" id="loginBtn">
					</form>
				</div>
			
			</div>
			
			
			<!-- 회원가입 이동 부분 -->
			<div class="register-panels_container">
				<div class="register-panel register-left_panel">
					<div class="register-panel_content">
						<h3>저희 사이트는 처음이신가요?</h3>
						<p>저희 사이트가 처음이시면 아래의 회원가입 버튼을 눌러 동아리의 회원이 되주세요!</p>
						
						 <a href="register.jsp">
						 	<button class="register-btn register-btn_transparent">회원가입</button>
						 </a>	
						
					</div>
					
					
					<!-- 디자인을 위한 이미지 -->
					<img src="resources/images/communication.png" class="register-panel_image">
				</div>
				
			</div>
			
		</div>
		
		<!-- 폰트어썸 킷 불러오기 -->
		<script src="https://kit.fontawesome.com/b8a5c71661.js" crossorigin="anonymous"></script>
		<script type="text/javascript" src="resources/js/LoginJavaScriptFile/LoginFormCheck.js"></script>
		<script>
		   	function onClickValidate(e){
		   		const id = document.loginForm.id.value;
		   		const password = document.loginForm.password.value;
		   		
				if(id.length === 0 || password.length === 0) {
					alert("아이디와 비밀번호를 입력해주세요.");
					return false;
				}
		   	}
		</script>
	</body>
</html>