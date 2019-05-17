<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de ventas</title>
    </head>
    <body>
        <%@include file="Lista.jsp" %>
        <%            
            String Id = request.getParameter("txtId");
            String nombre = request.getParameter("txtNom");
            int cantidad = 0;
            try {
                cantidad = Integer.parseInt(request.getParameter("cantidad"));

            } catch (Exception e) {
            }
            int precio_c = 0;
            try {
                cantidad = Integer.parseInt(request.getParameter("precio_c"));
            } catch (Exception e) {
            }
            
             int precio_v = 0;
            try {
                cantidad = Integer.parseInt(request.getParameter("precio_c"));

            } catch (Exception e) {
            }
            
          

            if (Id != null && nombre != null && nombre != null ) {

                String qry = "insert into producto(Id,Nombre,Cantidad,Precio_compra,Precio_venta) values"
                        + "('" + Id + "','" + nombre + "'," + cantidad + ",'" + precio_c + "','" + precio_v + "'" + ")";
                st.executeUpdate(qry);
                out.print("Venta registrada correctamente ");
            } else {
                System.out.println("Ha ocurrido un error");
            }
        %>
        <h1>Inserte los datos requeridos</h1>
        <form method="post" action="Alta.jsp">       
            <table>
                <tr>
                    <td>Código:</td>
                    <td><input type="text" size="10" name="txtId"></td>
                </tr>
                <tr>
                    <td>Nombre:</td>
                    <td><input type="text" size="20" name="txtNom"></td>
                </tr>
                <tr>
                    <td>Cantidad:</td>
                    <td><input type="text" size="20" name="cantidad"></td>
                </tr>
                <tr>
                    <td>Precio compra:</td>
                    <td><input type="text" size="20" name="precio_c"></td>
                </tr>
                <tr>
                    <td>Precio venta:</td>
                    <td><input type="text" size="20" name="precio_v"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Registrar"></td>
                </tr>
            </table>
        </form>            
    </body>
</html>
