<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section>

<p>氏名：${product.name}</p>
<p>会社：${product.company}</p>
<p>メールアドレス：${product.mail}</p>
<p>お問合せ内容：${product.review}</p>

<p>メルマガ種類：<c:forEach var="p" items="${product.genre}"></c:forEach></p>

<p>この度は資料請求いただきありがとうございます。以下のリンクから資料ダウンロードが可能です。https://www.a-force.biz/</p>

</section>

<%@include file="../footer.html" %>