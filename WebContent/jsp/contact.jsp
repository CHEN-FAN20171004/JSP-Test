<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<form action = "contact" method = "post">

<p>氏名</p>
<input type ="text" name = "name" required="required">

<p>会社</p>
<input type ="text" name = "company" >

<p>メールアドレス</p>
<input type ="text" name = "mail" required="required">

<p>お問合せ内容</p>
<p><textarea name="review" cols="30" rows="6" required="required"></textarea></p>

<p>メルマガ種類</p>
<p><input type ="checkbox" name = "genre" value = "総合案内">総合案内</p>
<p><input type ="checkbox" name = "genre" value = "セミナー案内">セミナー案内</p>
<p><input type ="checkbox" name = "genre" value = "求人採用情報">求人採用情報</p>

<p>資料請求希望</p>
<input type ="radio" name = "select" value = "yes">Yes
<input type ="radio" name = "select" value = "no">No

<p><input type ="submit" value ="送信"></p>
</form>

<%@include file="../footer.html" %>