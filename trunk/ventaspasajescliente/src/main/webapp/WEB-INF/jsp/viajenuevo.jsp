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
                    
                    <li><a class="current" href="index.html">Pagina de Inicio</a></li>
                    <li><a href="">Mantenimiento<!--[if IE 7]><!--></a><!--<![endif]-->
                    <!--[if lte IE 6]><table><tr><td><![endif]-->
                        <ul>
                        <li><a href="agencia_lista.html" title="">Mantenimiento de Agencias</a></li>
                        <li><a href="bus_lista.html" title="">Mantenimiento de buses</a></li>
                        </ul>
                    <!--[if lte IE 6]></td></tr></table></a><![endif]-->
                    </li>

                    <li><a href="">Distribucion<!--[if IE 7]><!--></a><!--<![endif]-->
                    <!--[if lte IE 6]><table><tr><td><![endif]-->
                        <ul>
                        <li><a href="ruta_lista.html" title="">Gestion de Ruta</a></li>
                        <li><a href="tarifa_lista.html" title="">Gestion de Tarifa</a></li>
                        <li><a href="viaje_lista.html" title="">Gestion de Viaje</a></li>
                        </ul>
                    <!--[if lte IE 6]></td></tr></table></a><![endif]-->
                    </li>

                    <li><a href="">Punto de Venta<!--[if IE 7]><!--></a><!--<![endif]-->
                    <!--[if lte IE 6]><table><tr><td><![endif]-->
                        <ul>
                        <li><a href="pasajero_lista.html" title="">Pasajeros</a></li>
                        <li><a href="reserva_lista.html" title="">Reservas</a></li>
                        <li><a href="boleto_lista.html" title="">Boletos</a></li>
                        </ul>
                    <!--[if lte IE 6]></td></tr></table></a><![endif]-->
                    </li>


                    
                    </ul>
                    </div> 
                    
                    
                    
                    
	<div class="center_content">

<div class="left_content">
  <div class="sidebarmenu">
          <a class="menuitem" href="ruta_lista.html">Lista</a></div>
            
            
        
    </div>


<div class="right_content">            
        
     <h2>Nuevo Viaje</h2>
     
         <div class="form">
         <form action="" method="post" class="niceform">
         
                <fieldset>
                    <dl>
                        <dt><label for="idviaje">IdViaje:</label></dt>
                        <dd><input type="text" name="txtidviaje" id="txtidviaje" size="54" /></dd>
                    </dl>

                      
                    <dl>
                        <dt><label for="origen">Origen:</label></dt>
                        <dd>
                            <select size="1" name="cboOrigen" id="cboOrigen">
                                <option value="1">LIMA</option>
                                <option value="2">AREQUIPA</option>
                            </select>
                        </dd>
                    </dl>
                    
                    <dl>
                        <dt><label for="destino">Destino:</label></dt>
                        <dd>
                            <select size="1" name="cboDestino" id="cboDestino">
                                <option value="1">LIMA</option>
                                <option value="2">AREQUIPA</option>
                            </select>
                        </dd>
                    </dl>
                    
                    <dl>
                        <dt><label for="tipobus">Tipo Bus:</label></dt>
                        <dd>
                            <select size="1" name="cbotipobus" id="cbotipobus">
                                <option value="1">VIP</option>
                                <option value="2">PRIMERA CLASE</option>
                                <option value="3">NEGOCIO</option>
                                <option value="4">ECONOMICO</option>                                
                            </select>
                        </dd>
                    </dl>

                    <dl>
                        <dt><label for="bus">Bus:</label></dt>
                        <dd>
                            <select size="1" name="cbobus" id="cbobus">
                                <option value="1">XLX-111</option>
                                <option value="2">842-555</option>                           
                            </select>
                        </dd>
                    </dl>

                    <dl>
                        <dt><label for="fecha">Fecha:</label></dt>
                        <dd><input type="text" name="txtfecha" id="txtfecha" size="54" /></dd>
                    </dl>

                    <dl>
                        <dt><label for="hora">Hora:</label></dt>
                        <dd><input type="text" name="txthora" id="txthora" size="54" /></dd>
                    </dl>
                    
                    <dl>
                        <dt><label for="piso1">Precio Piso 1:</label></dt>
                        <dd><input type="text" name="txtpreciopiso1" id="txtpreciopiso1" size="54" /></dd>
                    </dl>
                    
                    <dl>
                        <dt><label for="piso2">Precio Piso 2:</label></dt>
                        <dd><input type="text" name="txtpreciopiso2" id="txtpreciopiso2" size="54" /></dd>
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