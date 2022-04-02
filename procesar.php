<h1>mostrar datos</h1>
<?php
if(isset($_REQUEST["carnet"]))
{  echo "<br>carnet:".$_REQUEST["carnet"];
   echo "<br>nombre:".$_REQUEST["nombre"];
   echo "<br>fecha de nacimiento:".$_REQUEST["fecha"]; 

}
?>