<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Make a new group</title>
</head>
<body>

<h3>Add a New Group</h3>

<form action="processNewGroup" id="processNewGroup">

	<input type="text" name="groupModerator" placeholder="Username of moderator" />
	
	<br><br>
	
	<input type="text" name="groupName" placeholder="Name of group" />
	
	<br><br>
	
	<textarea name="groupDescription" form="processNewGroup" cols="50" rows="6" placeholder="Short description of group"></textarea>
	
	<br><br><br>
	
	<input type="submit" value="Submit" />
	

	
	

</form>

</body>
</html>