<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>우동소 회원가입</title>
		<link rel="stylesheet" href="resources/CSS/styles.css?after">
	</head>
	<body>
		<!-- 수정시 name 값은 수정 불가 (코멘트 확인 후 제거) -->
		<a href="index.jsp">메인으로</a>
		
		<!-- 회원가입 페이지 전체적인 구조 -->
		<div class="register-page_container">
			<div class="register-forms-container">
			
			<div class="register">
				<form action="register.do" method="post" name="registerForm" class="register-form">
					<div class="page" id="slidePage">
						<h2 class="register-form_title">회원가입</h2>
						<div class="register-form_subtitle">학교 정보를 입력해주세요.</div>	
						<div class="register-input-field">
							<div class="register-input-field_label"> 지역 </div>
							<select id="region" name="region">
								<option value="">-</option>
								<optgroup label="특별시">
									<option value="서울">서울특별시</option>
								</optgroup>
									
								<optgroup label="광역시">
									<option value="부산">부산광역시</option>
									<option value="대구">대구광역시</option>
									<option value="인천">인천광역시</option>
									<option value="광주">광주광역시</option>
									<option value="대전">대전광역시</option>
									<option value="울산">울산광역시</option>
								</optgroup>
						
								<optgroup label="특별자치시">
									<option value="세종">세종특별자치시</option>
								</optgroup>
						
								<optgroup label="도">
									<option value="강원">강원도</option>
									<option value="경기">경기도</option>
									<option value="경남">경상남도</option>
									<option value="경북">경상북도</option>
									<option value="전남">전라남도</option>
									<option value="전북">전라북도</option>
									<option value="충남">충청남도</option>
									<option value="충북">충청북도</option>
								</optgroup>
									
								<optgroup label="특별자치도">
									<option value="제주">제주도</option>
								</optgroup>
									
							</select>
						</div>
						
						<div class="register-input-field">
							<div class="register-input-field_label"> 대학교 </div>
							<select id="school" name="university">
								<option value="">-</option>
							</select>
						</div>
							
						<div class="register-input-field">
							<div class="register-input-field_label"> 학과 </div>
							<select id="major" name="major">
								<option value="">-</option>
							</select>
						</div>
							
						<div class="register-input-field">
							<div class="register-input-field_label">학번</div>
							<input type="text" placeholder="예) 20221234" id="class_of" onchange="onClassNumberHandler()" name="classOf">
							<div class="error"></div>
						</div>
							
						<div class="register-input-field" id="firstNextBtn">
							<button class="register-btns">다음으로</button>	
						</div>					
					</div>

					
					<div class="page" id="slidePage">
						<h2 class="register-form_title">회원가입</h2>
						<div class="register-form_subtitle">기본 정보를 입력해주세요.</div>
						
						<div class="register-input-field">
							<div class="register-input-field_label"> 아이디 </div>
							<input type="text" placeholder="아이디를 입력해주세요" id="userId" onchange="onIdHandler()" name="id">
							<div class="error"></div>
						</div>
						
						<div class="register-input-field">
							<div class="register-input-field_label"> 이름 </div>
							<input type="text" placeholder="이름을 입력해주세요" id="name" onchange="onNameHandler()" name="name">
							<div class="error"></div>
						</div>
						
						<div class="register-input-field">
							<div class="register-input-field_label"> 닉네임 </div>
							<input type="text" placeholder="닉네임을 입력해주세요" id="nickname" onchange="onNickNameHandler()" name="nickname">
							<div class="error"></div>
						</div>
						
						<div class="register-input-field">
							<div class="register-input-field_label"> 비밀번호 </div>
							<input type="password" placeholder="비밀번호를 입력해주세요" id="password" onchange="onPasswordHandler()" name="password">
							<div class="error"></div>
						</div>
						
						<div class="register-input-field">
							<div class="register-input-field_label"> 비밀번호 확인 </div>
							<input type="password" placeholder="비밀번호를 다시 한번 입력해주세요" id="passwordCheck" onchange="onConfirmPassword()" name="passwordCheck">
							<div class="error"></div>
						</div>
						
						<div class="register-input-field">
							<div class="register-input-field_label"> 연락처 </div>
							<input type="text" placeholder="연락처를 입력해주세요('-'은 빼주세요)" id="phoneNumber" onchange="onPhoneNumberHandler()" name="contact">
							<div class="error"></div>
						</div>
						
						<div class="btns">
							<button class="prev" id="prevBtn">이전</button>
							<button class="next" id="nextBtn">회원가입</button>
						</div>
					</div>
					
				</form>
			</div>
					
						
			
			</div>
			
			
			<!-- 회원가입 이동 부분 -->
			<div class="login-panels_container">
				<div class="login-panel login-right_panel">
					<div class="login-panel_content">
						<h3>이미 계정이 있으신가요?</h3>
						<p> 아래의 로그인 버튼을 눌러 다시 동아리 활동을 하러 가봐요!</p>
						
						<a href="login.jsp">
						 	<button class="login-btn login-btn_transparent">로그인</button>
						 </a>
						
					</div>
					
					
					<!-- 디자인을 위한 이미지 -->
					<img src="resources/images/pngwing.com.png" class="login-panel_image">
				</div> 
				
			</div>
			
			
			
		</div>
    
	<script type="text/javascript" src="resources/js/RegisterJavaScriptFile/MultiStepForm.js"></script>
	<script type="text/javascript" src="resources/js/RegisterJavaScriptFile/GetSchoolData.js"></script>
    
    <script>
    	function onClickValidate(){
    		const pw = document.registerForm.password.value;
    		const pwCheck = document.registerForm.passwordCheck.value;
    		console.log(pw, pwCheck);
    		if(pw !== pwCheck) {
    			alert("비밀번호가 일치하지 않습니다.");
    			return false;
    		} else {
    			alert("회원가입 완료");
    		}
    	}
    </script>
</body>
</html>