<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome to telusko
<br>
${welcomemsg}
<br>
To get Animals
<form action="getAnimals">
<input type="submit"></form>
<hr>

To set Animal
<form action="addAnimal" method="post">
Enter id: <input type="text" name="aid"><br>
Enter Name: <input type="text" name="aname"><br>
Enter age: <input type="text" name="aage"><br>
<input type="submit"></form>
<hr>

To get Animal
<form action="animal">
Enter id: <input type="text" name="aid"><br>
<input type="submit"></form>
<hr>
Get Animals By Name
<form action="getAnimalsByName"><br>
Enter Name: <input type="text" name="name"><br>
<input type="submit"></form>

<hr>
Get Animals with Name (Query version)
<form action="getAnimalsWithName"><br>
Enter Name: <input type="text" name="name"><br>
<input type="submit"></form>

</body>
</html>