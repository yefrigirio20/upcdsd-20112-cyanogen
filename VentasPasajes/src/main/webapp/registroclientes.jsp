<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>REGISTRO DE CLIENTES</title>
<link href="estilos/estilos.css" rel="stylesheet" type="text/css" />
</head>


<body>
      <form id="form2" name="form2" method="post" action="">

	  <table width="760" border="0" cellpadding="0" cellspacing="2" align="center">
	  
          <tr>
          <td>Nombre :</td>
          <td colspan="2"><html:text property="rutas" /></td>
          </tr>
          
          <tr>
          <td>Apellido Paterno :</td>
          <td colspan="2"><html:text property="apellidopaterno" /></td>
          </tr>
          
            <tr>
          <td>Apellido Materno  :</td>
          <td colspan="2"><html:text property="apellidomaterno"   /></td>
          </tr>
          
           <tr>
          <td>Tipo de Documento :</td>
          
          	<select name="select"  id="select" >
                                  <option  value="0" selected="selected">--Seleccionar--</option>
                                  <option  value="1">DNI</option>
                                  <option  value="2">RUC</option>
								  <option  value="3">CE</option>
                                </select>
           </tr>
           
          <tr>
          <td>Numero de Documento  :</td>
          <td colspan="2"><html:text property="numerodocumento" /></td>
          </tr>
          
           <tr>
          <td>Sexo :</td>
          </tr>
          
           <tr>
          <td>email  :</td>
          <td colspan="2"><html:text property="email" /></td>
          </tr>
          
          
          <tr>
          <td>password  :</td>
          <td colspan="2"><html:text property="password" /></td>
          </tr>
          
           <tr>
          <td>Confirmar Password  :</td>
          <td colspan="2"><html:text property="confirmarpassword" /></td>
          </tr>
          
       <tr>
          <td>
              <html:submit value="Grabar Datos" />   
              <html:submit value="Cancelar" />   
          </td>
        </tr>
        
       
      </table>
	  <table width="760" border="0" align="center" cellpadding="0" cellspacing="2" class="txtpiepagina">
        <tr>
          <td width="10%">UPC</td>
          <td width="80%">&nbsp;</td>
          <td width="10%" align="right">Copyright</td>
        </tr>
      </table>
      </form>
</body>


</html>
	