<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%--<script type="text/javascript">--%>
<%--     $(document).ready(function(){--%>

<%--     })--%>
<%-- function deleteTodo(){--%>

<%-- }--%>
<%-- function changeType(){--%>

<%-- }--%>
<%-- function clickAddBtn(){--%>

<%-- }--%>
<%-- function addTodo(){--%>
<%--         let contents = $(".newTodoContents").val();--%>
<%--         let subType = document.getElementsByClassName('active')[0].value;--%>

<%--         if(contents.length ==0 ){--%>
<%--             alert("값을 입력해주세요.");--%>
<%--         }else{--%>
<%--             //성공--%>
<%--             alert("등록되었습니다.");--%>
<%--         }--%>
<%-- }--%>


<%--</script>--%>
<html>
<head>
    <meta charset="utf-8">
    <title>home</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link href="/resources/css/todocss.css" rel="stylesheet"/>
</head>
<body>
    <div class="list_box" style="margin: 5rem auto;">
        <div class="time_wrap"style="text-align: center; height: 90px; margin-top: 1rem;">
        <div>
            <input type="date" id="currentDate">
        </div>

    <div class="time_wrap_box">
        <div id="box_hour1"></div>
        <div id="box_hour2"></div>
        <span></span>
        <div id="box_minute1"></div>
        <div id="box_minute2"></div>
    </div>
    </div>
    <div class="btn_box">
        <div class="subTab">
            <li class="active" value="0" onclick="changeType(0)">All</li>
            <li value="1" onclick="changeType(1)">ACTIVE</li>
            <li value="2" onclick="changeType(2)">COMPLETED</li>
            <div class="btn_add" onclick="clickAddBtn()">ADD
            </div>
        </div>
    </div>
    <div class="list">
        <c:choose>
            <c:when test="${fn:length(todoList) == 0}">
                <span class="empty_notice">등록된 할 일이 없습니다.</span>
            </c:when>
            <c:otherwise>
                <c:forEach var="item" items="${todoList}">
                    <li class="list${item.idx} ${item.complete_yn == 'Y' ? 'checked' : ''}">
                        <input type="checkbox" value="${item.idx}" id ="middle${item.idx}" ${item.complete_yn == 'Y' ? 'checked' : ''}><label for="middle${item.idx}">${item.contents}</label>
                        <button class="delBtn" onclick="deleteTodo(${item.idx})" style="display: none;">삭제</button>
                    </li>

                </c:forEach>
            </c:otherwise>
        </c:choose>
    </div>
    </div>

</body>
</html>
