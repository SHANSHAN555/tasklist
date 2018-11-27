<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="name">名前</label><br />
<input type="text" name="name" value="{tasklist.name}"/>
<br /><br />
<label for="content">課題</label><br />
<input type="text" name="content" value="[tasklist.content]"/>
<br /><br />
<input type="hidden" name="_token" value="${_token}"/>
<button type="submit">追加</button>