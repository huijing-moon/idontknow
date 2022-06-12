
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="{pageContext.request.contextPath}" />
<html>
<head>
    <meta charset="utf-8">
    <title>write</title>
</head>
<body>
<div class="col-lg-12">
    <form role="form" id="writeForm" method="post" action="${path}/article/write">
        <div class="box">
            <h3 class="box-title">게시글 작성</h3>
        </div>
        <div class="body">
            <div class="form-group">
                <label for="title"> 제목</label>
                <input class="form-control" id="title" name="title" placeholder="제목을 입력하세요">
            </div>
            <br>
            <div class="form-content">
                <label for="content">내용</label>
                <textarea id="content" name="content" placeholder="내용을 입력하세요.">
                </textarea>
            </div>
            <div class="button">
                <button type="submit">저장</button>


                <button type="reset">취소</button>
        </div>
        </div>
    </form>
</div>
</body>
</html>
