<%@ include file="/WEB-INF/jsp/include.jsp" %>

<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="jconfirmaction.jquery.js"></script>
<script type="text/javascript">
	
	$(document).ready(function() {
		$('.ask').jConfirmAction();
	});
	
</script>
		<br />
		<strong>Asientos Seleccionados</strong>
<table id="rounded-corner2" summary="' Profit">
    <thead>
    	<tr>
        	<th scope="col" class="rounded-company">Item</th>
            <th scope="col" class="rounded">Asiento</th>
            <th scope="col" class="rounded">Precio</th>
            <th scope="col" class="rounded-q4">&nbsp;</th>
        </tr>
    </thead>
        <tfoot>
    	<tr>
        	<td colspan="3" class="rounded-foot-left"><em>Asientos Seleccionados</em></td>
        	<td class="rounded-foot-right">&nbsp;</td>
        </tr>
    </tfoot>
    <tbody>
		<c:forEach items="${carrito}" var="carrito">    
    	<tr>
            <td>${carrito.item}</td>
            <td>${carrito.asiento.numeroAsiento}</td>
            <td>${carrito.asiento.viaje.costo}</td>
            <td><a onClick="eliminar('${carrito.asiento.numAsiento}');"><img src="images/trash.png" alt="" title="" border="0" /></a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>	