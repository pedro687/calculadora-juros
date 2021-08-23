<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP</title>
</head>
<body>
<h1><%= "Pedro Emanoel do Nascimento SIlva" %></h1>
<h1><%= "RA: 1290482012028" %></h1>
<br/>
<hr>
<h1>Juros Simples</h1>
<form action="juros-simples.html" method="post">
  <input type="number" name="valorPresente" placeholder="Digite o valor presente">
  <input type="number" name="taxa" placeholder="Digite a taxa">
  <input type="number" name="tempo" placeholder="Digite o tempo">
  <input type="submit">
</form>
<hr>
<h1> Juros Composto </h1>
<form action="juros-composto.html" method="post">
  <input type="number" name="valorPresente" placeholder="Digite o valor presente">
  <input type="number" name="taxa" placeholder="Digite a taxa">
  <input type="number" name="tempo" placeholder="Digite o tempo">
  <input type="submit">
</form>

</body>
</html>