<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">
        <h2>id:${tasklist.id}の詳細ページ</h2>
        <table>
            <tbody>
                <tr>
                    <th>番号</th>
                    <td><c:out value="${tasklist.id}"/></td>
                </tr>
                <tr>
                    <th>名前</th>
                    <td><c:out value="${tasklist.name}"/></td>
                </tr>
                <tr>
                    <th>詳細</th>
                    <td><c:out value="${tasklist.content}"/></td>
                </tr>

            </tbody>
        </table>
        <p><a href="${pageContext.request.contextPath}/edit?id=${tasklist.id}">編集する</a></p>
        <p><a href="${pageContext.request.contextPath}/index">一覧に戻る</a></p>
    </c:param>
</c:import>