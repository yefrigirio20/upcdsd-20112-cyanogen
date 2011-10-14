<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>IN ADMIN PANEL | Powered by INDEZINER</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="ddaccordion.js"></script>
<script type="text/javascript">
ddaccordion.init({
	headerclass: "submenuheader", //Shared CSS class name of headers group
	contentclass: "submenu", //Shared CSS class name of contents group
	revealtype: "click", //Reveal content when user clicks or onmouseover the header? Valid value: "click", "clickgo", or "mouseover"
	mouseoverdelay: 200, //if revealtype="mouseover", set delay in milliseconds before header expands onMouseover
	collapseprev: true, //Collapse previous content (so only one open at any time)? true/false 
	defaultexpanded: [], //index of content(s) open by default [index1, index2, etc] [] denotes no content
	onemustopen: false, //Specify whether at least one header should be open always (so never all headers closed)
	animatedefault: false, //Should contents open by default be animated into view?
	persiststate: true, //persist state of opened contents within browser session?
	toggleclass: ["", ""], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively ["class1", "class2"]
	togglehtml: ["suffix", "<img src='images/plus.gif' class='statusicon' />", "<img src='images/minus.gif' class='statusicon' />"], //Additional HTML added to the header when it's collapsed and expanded, respectively  ["position", "html1", "html2"] (see docs)
	animatespeed: "fast", //speed of animation: integer in milliseconds (ie: 200), or keywords "fast", "normal", or "slow"
	oninit:function(headers, expandedindices){ //custom code to run when headers have initalized
		//do nothing
	},
	onopenclose:function(header, index, state, isuseractivated){ //custom code to run whenever a header is opened or closed
		//do nothing
	}
})
</script>
<script src="jquery.jclock-1.2.0.js.txt" type="text/javascript"></script>
<script type="text/javascript" src="jconfirmaction.jquery.js"></script>
<script type="text/javascript">
	
	$(document).ready(function() {
		$('.ask').jConfirmAction();
	});
	
</script>
<script type="text/javascript">
$(function($) {
    $('.jclock').jclock();
});
</script>

<script language="javascript" type="text/javascript" src="niceforms.js"></script>
<link rel="stylesheet" type="text/css" media="all" href="niceforms-default.css" />

</head>
<body>
<div id="main_container">

	<div class="header">
    <div class="logo"><a href="#"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>
    
    <div class="right_header">Welcome Admin, <a href="#">Visit site</a> | <a href="#" class="messages">(3) Messages</a> | <a href="#" class="logout">Logout</a></div>
    <div class="jclock"></div>
    </div>
    
    <div class="main_content">

                    <div class="menu">
                    <ul>
                    
                    <li><a class="current" href="itinerario.htm">Inicio</a></li>

                    <li><a href="">Administrador<!--[if IE 7]><!--></a><!--<![endif]-->
                    </li>

                    <li><a href="">Registro de Viaje<!--[if IE 7]><!--></a><!--<![endif]-->
                    </li>
                    
                    </ul>
                    </div>  

                    
	<div class="center_content">




<div class="right_content">            

	<br /> <br />        
     <h2>Registrar Nuevo Usuario</h2>
     
         <div class="form">
         <form action="registrar_usuario.htm" method="post" class="niceform">
         
                <fieldset>
                    <dl>
                        <dt><label for="codUsuario">codUsuario:</label></dt>
                        <dd><input type="text" name="txtcodUsuario" id="txtcodUsuario" size="54" /></dd>
                    </dl>

                    <dl>
                        <dt><label for="nombre">Nombre:</label></dt>
                        <dd><input type="text" name="txtnombre" id="txtnombre" size="54" /></dd>
                    </dl>

                    <dl>
                        <dt><label for="apellido">Apellido Paterno:</label></dt>
                        <dd><input type="text" name="txtapellidoPaterno" id="txtapellidoPaterno" size="54" /></dd>
                    </dl>                      

                    <dl>
                        <dt><label for="apellido">Apellido Materno:</label></dt>
                        <dd><input type="text" name="txtapellidoMaterno" id="txtapellidoMaterno" size="54" /></dd>
                    </dl> 

                    <dl>
                        <dt><label for="dni">DNI:</label></dt>
                        <dd><input type="text" name="txtdni" id="txtdni" size="54" /></dd>
                    </dl>                   

                    <dl>
                        <dt><label for="email">E-Mail:</label></dt>
                        <dd><input type="text" name="txtemail" id="txtemail" size="54" /></dd>
                    </dl>                   

                    <dl>
                        <dt><label for="email">Password:</label></dt>
                        <dd><input type="password" name="txtpassword" id="txtpassword" size="54" /></dd>
                    </dl>                   

                    <dl>
                        <dt><label for="email">Confirme Password:</label></dt>
                        <dd><input type="password" name="txtpasswordconfirm" id="txtpasswordconfirm" size="54" /></dd>
                    </dl>                   

                    
                     <dl class="submit">
                    <input type="submit" name="btnGrabar" id="btnGrabar" value="Grabar" />
                    <input type="reset" name="btnCancelar" id="btnCancelar" value="Cancelar" />
                     </dl>

                     
                    
                </fieldset>
                
         </form>
         </div>  
      
     
     </div>    <!-- end of right content-->
            
                    
	</div>   <!--end of center content -->               
                    
                    
    
    
    <div class="clear"></div>
    </div> <!--end of main content-->
	
    
    <div class="footer">
    
    	<div class="left_footer">Sistema de Buses | Desarrollado por <a href="http://indeziner.com">Jonathan Roa</a></div>
    	<div class="right_footer"><a href="http://indeziner.com"><img src="images/indeziner_logo.gif" alt="" title="" border="0" /></a></div>
    
    </div>

</div>		
</body>
</html>