<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Grupo CYANOGEN | Desarrollado por Jonathan</title>
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

<script type="text/javascript" src="jconfirmaction.jquery.js"></script>
<script type="text/javascript">
	
	$(document).ready(function() {
		$('.ask').jConfirmAction();
	});
	
</script>

<script language="javascript" type="text/javascript" src="niceforms.js"></script>
<link rel="stylesheet" type="text/css" media="all" href="niceforms-default.css" />


	<link rel="stylesheet" href="themes/base/jquery.ui.all.css" />

	<script src="ui/jquery.ui.core.js"></script>
	<script src="ui/jquery.ui.widget.js"></script>
	<script src="ui/jquery.ui.datepicker.js"></script>

	<script>
	$(function() {
		$( "#txtFecha" ).datepicker({dateFormat: 'dd/mm/yy'});
	});
	</script>

</head>
<body>
<br /> <br /> <br /> <br /> <br />
<div id="main_container">

	<div class="header_login">
	
    <div class="logo"><a href="#"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>
	     
    </div>


         <div class="login_form">
         
         <h3>ITINERARIOS</h3>
                   
         <form action="itinerario_busqueda.htm" method="post" class="niceform">
         
                <fieldset>

                    <dl>
                        <dt><label for="fecha">Fecha:</label></dt>
                        <dd><input type="text" name="txtFecha" id="txtFecha" size="54" /></dd>                      
                    </dl>
                    
                    <dl>
                        <dt><label for="Origen">Origen:</label></dt>
                        <dd>
                            <select size="1" name="cboOrigen" id="cboOrigen">
                            <c:forEach items="${agencias}" var="agencia">
                                <option value="${agencia.idAgencia}">${agencia.nombre}</option>
							</c:forEach>                   
                            </select>
                        </dd>
                    </dl>

                    <dl>
                        <dt><label for="Destino">Destino:</label></dt>
                        <dd>
                            <select size="1" name="cboDestino" id="cboDestino">
                            <c:forEach items="${agencias}" var="agencia">
                                <option value="${agencia.idAgencia}">${agencia.nombre}</option>
							</c:forEach>
                            </select>
                        </dd>
                    </dl>




                
                   
                     <dl class="submit"> 
                    	<input type="submit" name="submit" id="submit" value="Buscar" />
                     </dl>
                    
                </fieldset>
                
         </form>
              
         </div>  
          
	
    
    <div class="footer_login">
    
    	
    	<div class="left_footer">Sistema de Buses | Desarrollado por <a href="http://indeziner.com">Jonathan Roa</a></div>
    	<div class="right_footer_login"><a href="http://indeziner.com"><img src="images/indeziner_logo.gif" alt="" title="" border="0" /></a></div>
    
    </div>

</div>		
</body>
</html>