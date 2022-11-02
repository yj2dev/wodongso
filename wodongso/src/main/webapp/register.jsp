<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우동소 회원가입</title>
</head>
<body>
<!-- 수정시 name 값은 수정 불가 (코멘트 확인 후 제거) -->
	<form action="register.do" method="post" name="registerForm" onsubmit="return onClickPasswordChck();">
        <table>
            <tr>
                <td width="144px">아이디</td>
                <td>
                    <input type="text" name="id">
                </td>
            </tr>
            <tr>
                <td>이름</td>
                <td>
                    <input type="text" name="name">
                </td>
            </tr>
            
            <tr>
                <td>비밀번호</td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <tr>
                <td>비밀번호 확인</td>
                <td>
                    <input type="password" name="passwordCheck">
                </td>
            </tr>
            <tr>
                <td>동아리 유형</td>
                <td>
					<select name="type">
					    <option value="0" selected>총동아리연합회</option>
					    <option value="1">과동아리/소모임</option>
					</select>
                </td>
            </tr>
            <tr>
                <td>연락처</td>
                <td>
                	<input type="text" name="contact">
                </td>
            </tr>
            <tr>
                <td>프로필 사진</td>
                <td>
                    <input type="file" name="profile_url">
                </td>
            </tr>
            <tr>
                <td>지역</td>
                <td>
                    <input type="text" name="region">
                </td>
            </tr>
             <tr>
                <td>대학교</td>
                <td>
                    <input type="text" name="university">
                </td>
            </tr>
             <tr>
                <td>학과</td>
                <td>
                    <input type="text" name="major">
                </td>
            </tr>
        </table>
        <input type="submit" value="확인">
    </form>    
    <script>
    	function onClickPasswordChck(){
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