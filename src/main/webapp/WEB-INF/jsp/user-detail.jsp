<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../Layout/taglib.jsp" %>
<h1>${user.name }</h1>
<c:forEach items="${user.blogs}" var="blog">
<h1>${blog.name}</h1>
<p>${blog.url}</p>
<table>
<thead>
<tr>Title</tr>
<tr>Link</tr>
</thead>
<tbody>
<c:forEach items="${blog.items}" var="item">
<tr>
<td>${item.title}</td>
<td>${item.link}</td>
</tr>

</c:forEach>

</tbody>
</table>
</c:forEach>
