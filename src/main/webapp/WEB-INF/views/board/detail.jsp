<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/headerUser.jsp" %>

<style type="text/css">

#boardDetailDiv{
	margin: 30px;
	border: 1px solid #ccc;
	padding: 25px;

}

#boardDetailText{
	font-size: 20px;
}

</style>

<div id="boardDetailDiv">

	<div class="text-left">
	<h5>${board.bType } 게시판 <span>></span></h5>
	</div>
	<div  class="text-center">
	<h2>${board.bTitle }</h2>
	</div>
	
	<div class="text-left">
	<p><strong>작성자 : ${user.uNick }</strong></p>
	<p>작성일자 : <fmt:formatDate value="${board.bWriteDate }" pattern="yyyy/MM/dd"/> &nbsp; &nbsp; &nbsp; 조회수 ${board.bHit } <p>
	<hr>
	</div>

<div id="boardDetailText"  class="text-center" style="min-height: 500px; ">
${board.bContent }

</div>
<a href="/board/list"><button class="btn btn-default" type="button">목록으로</button></a>
<c:if test="${sessionScope.user.uNo eq board.uNo }">
<a href="/board/delete?boardNo=${board.bNo }"><button class="btn btn-default" type="button">게시글삭제</button></a>
</c:if>
</div>

<%@ include file="/WEB-INF/views/layout/footerUser.jsp" %>