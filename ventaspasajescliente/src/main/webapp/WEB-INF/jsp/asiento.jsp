<%@ include file="/WEB-INF/jsp/include.jsp" %>
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


<script>
function agregar(valor){
 $('#hd_numAsiento').val(valor);

 $.ajax({
    type: "POST",
    url: "carrito_agregar.htm",
    data:{numAsiento : $("#hd_numAsiento").val()},
    success: function(data){
      $("#resultado").html(data);
    },
    error: function(jqXHR, textStatus, errorThrown) {
      $("#resultado").html(jqXHR.responseText);
     }
  }); 
};

function eliminar(valor){
	 $('#hd_numAsiento').val(valor);

	 $.ajax({
	    type: "POST",
	    url: "carrito_eliminar.htm",
	    data:{numAsiento : $("#hd_numAsiento").val()},
	    success: function(data){
	      $("#resultado").html(data);
	    },
	    error: function(jqXHR, textStatus, errorThrown) {
	      $("#resultado").html(jqXHR.responseText);
	     }
	  }); 
	};
</script>

</head>
<body>
<div id="main_container">

	<div class="header">
    <div class="logo"><a href="#"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>
    
    <div class="right_header">
	    <c:if test="${usuario!=null}">
	    	Bienvenido ${usuario.nomUsuario} ${usuario.apepatUsuario} ${usuario.apematUsuario}  
	    	<a href="desconectarse.htm" class="logout">Desconectarse</a>
	    </c:if>
    </div>   
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

<div class="left_content">
     <div class="sidebar_box">

         <div class="sidebar_box_top"></div>
         <div class="sidebar_box_content">
         <h3>Detalles del Viaje</h3>
         <img src="images/info.png" alt="" title="" class="sidebar_icon_right" />
         <ul>
			<li><strong>ORIGEN:</strong> ${viaje.agenciaOrigen.nombre}</li>
			<li><strong>DESTINO:</strong> ${viaje.agenciaDestino.nombre}</li>
			<li><strong>Bus:</strong> ${viaje.bus.placa}</li>
			<li><strong>Fecha:</strong> ${viaje.formatoFecha}</li>
			<li><strong>Hora:</strong> ${viaje.formatoHora}</li>
         </ul>                
         </div>

         <div class="sidebar_box_bottom"></div>
     </div>

	<c:if test="${usuario==null}">
	  <div class="sidebar_box">
	      <div class="sidebar_box_top"></div>
	      <div class="sidebar_box_content">
	
	      <h4>Comprar Boleto</h4>
	      <img src="images/notice.png" alt="" title="" class="sidebar_icon_right" />
	      <p>
	Para Poder Comprar el boleto Ud. primero debe logearse, en caso de no tener cuenta, registre sus datos para crear una cuenta de usuario
	      </p>                
	      </div>
	      <div class="sidebar_box_bottom"></div>
	  </div>

		<div class="sidebarmenu">
			<a class="menuitem" href="login.htm">Login</a>
			<a class="menuitem" href="abrir_registro_usuario.htm">Registrarse</a>
		</div>
	</c:if>

	<c:if test="${usuario!=null}">
		<div class="sidebarmenu">
			<a class="menuitem" href="registrar_boletos.htm">Comprar</a>
		</div>
	</c:if>

	<input id="hd_numAsiento" type="hidden" name="hd_numAsiento" />

<div id="resultado"></div>
	
	

</div>


<div class="right_content">            
        

     

<h2>Distribucion de Asientos ${cantidadAsientos}</h2>



<table>

<c:forEach items="${listaFilaAsientos}" var="filaAsiento">


<tr>
	<td>
		<c:if test="${filaAsiento.existeAsientoA==1}">
			<c:if test="${filaAsiento.asientoA.estado==0}">
				<a class="bt_green" <c:if test="${usuario!=null}"> onClick="agregar('${filaAsiento.asientoA.numeroAsiento}');"</c:if> >
				<span class="bt_green_lft"></span><strong>${filaAsiento.asientoA.numeroAsiento}</strong><span class="bt_green_r"></span>
				</a>				
			</c:if>

			<c:if test="${filaAsiento.asientoA.estado==1}">
				<a  class="bt_red" >
				<span class="bt_red_lft"></span><strong>${filaAsiento.asientoA.numeroAsiento}</strong><span class="bt_red_r"></span>
				</a>							
			</c:if>			
		</c:if>
		<c:if test="${filaAsiento.existeAsientoA==0}">
			<img src="images/vacio.jpg" alt="" />
		</c:if>
	</td>
	
	<td>
		<c:if test="${filaAsiento.existeAsientoB==1}">
			<c:if test="${filaAsiento.asientoB.estado==0}">
				<a class="bt_green" <c:if test="${usuario!=null}"> onClick="agregar('${filaAsiento.asientoB.numeroAsiento}');" </c:if>>
				<span class="bt_green_lft"></span><strong>${filaAsiento.asientoB.numeroAsiento}</strong><span class="bt_green_r"></span>
				</a>
			</c:if>
			<c:if test="${filaAsiento.asientoB.estado==1}">
				<a  class="bt_red">
				<span class="bt_red_lft"></span><strong>${filaAsiento.asientoB.numeroAsiento}</strong><span class="bt_red_r"></span>
				</a>
			</c:if>		
		</c:if>
		<c:if test="${filaAsiento.existeAsientoB==0}">
			<img src="images/vacio.jpg" alt="" />
		</c:if>	
	</td>
	
	<td><img src="images/vacio.jpg" alt="" /></td>
	<td><img src="images/vacio.jpg" alt="" /></td>
	
	<td>
		<c:if test="${filaAsiento.existeAsientoC==1}">
			<c:if test="${filaAsiento.asientoC.estado==0}">
				<a class="bt_green" <c:if test="${usuario!=null}"> onClick="agregar('${filaAsiento.asientoC.numeroAsiento}');" </c:if>>
				<span class="bt_green_lft"></span><strong>${filaAsiento.asientoC.numeroAsiento}</strong><span class="bt_green_r"></span>
				</a>		
			</c:if>
			<c:if test="${filaAsiento.asientoC.estado==1}">
				<a class="bt_red">
				<span class="bt_red_lft"></span><strong>${filaAsiento.asientoC.numeroAsiento}</strong><span class="bt_red_r"></span>
				</a>		
			</c:if>		
		</c:if>
		<c:if test="${filaAsiento.existeAsientoC==0}">
			<img src="images/vacio.jpg" alt="" />
		</c:if>	
	</td>
	
	<td>
		<c:if test="${filaAsiento.existeAsientoD==1}">
			<c:if test="${filaAsiento.asientoD.estado==0}">
				<a class="bt_green" <c:if test="${usuario!=null}">onClick="agregar('${filaAsiento.asientoD.numeroAsiento}');"  </c:if>>
				<span class="bt_green_lft"></span><strong>${filaAsiento.asientoD.numeroAsiento}</strong><span class="bt_green_r"></span>
				</a>		
			</c:if>
			<c:if test="${filaAsiento.asientoD.estado==1}">
				<a class="bt_red">
				<span class="bt_red_lft"></span><strong>${filaAsiento.asientoD.numeroAsiento}</strong><span class="bt_red_r"></span>
				</a>
			</c:if>
		</c:if>
		<c:if test="${filaAsiento.existeAsientoD==0}">
			<img src="images/vacio.jpg" alt="" />
		</c:if>	
	</td> 
</tr>

</c:forEach>

</table>
 
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