<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우동소 로그인</title>
</head>
<body>
	<a href="index.jsp">메인으로</a>
	<h3>로그인</h3>
	<form action="login.do" method="post" name="loginForm" onsubmit="return onClickValidate();">
        <table>
            <tr>
                <td width="144px">아이디</td>
                <td>
                    <input type="text" name="id">
                </td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
        </table>
       	<input type="submit" value="로그인"/>
	</form>
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