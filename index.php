<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Formulario de ingreso de datos</h1>
    <form method="post" action="procesar.php">
        carnet: <input type="number" name="carnet" required="true"> <br>
        nombre: <input type="text" name="number" required size="40" maxlength="35"><br>
        fecha de nacimiento: <input type="date" name="fecha" required> 
        <input type="submit" value="Enviar datos" name="btn">
        </form>

</body>
</html>