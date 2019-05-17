<!DOCTYPE html>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="cabecera">
    <br>
    <nav> <H1 align="center">Registro de ventas</H1></nav>   
</nav>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP and MySQL</title>
    </head>
    <style>
        
        body{
            margin: 0px;
            padding: 0px;
            background-image: url(fondo1.jpg);
            font-family: Lucida Grande, Lucida Sans Unicode, Lucida Sans, DejaVu Sans, Verdana," sans-serif";
        }
        .cabecera{
            background: #476D7B;
        }
        .cabecera nav {
            color: #E8E8E8;
            font-weight: bold;
            padding: 0px 400px 3px 550px;
        }
        #user{
            margin: 120px;
        }
        #datosUsuario{
            line-height: 40px;
            border-radius: 50px;
            border: 50px Color  #FF0000;
            padding: 0px 0px 0px 80px;
            background: rgba(230,230,230,0.50);
        }
    </style>
    <body>
 <img src="iconoventa-c2.png"
     width="200"
     height="71">
        <section id="user">
            <nav id="datosUsuario">
          
                <table> 
                    <H1 align="center">Listado de ventas registradas</H1>          

                    <form action="Alta.jsp" method="get">
                        <table border="1" width="800">
                            <tr bgcolor="purple">
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>Cantidad</th>
                                <th>Precio compra</th>
                                <th>Precio venta</th>
                            </tr>
                            <%
                                Connection cn = null;
                                Statement st = null;
                                ResultSet rs = null;
                                try {

                                    Class.forName("com.mysql.jdbc.Driver");
                                    cn = DriverManager.getConnection("jdbc:mysql://localhost/tienda?user=root&password=");
                                    st = cn.createStatement();
                                    rs = st.executeQuery("select * from producto");

                                    while (rs.next()) {
                            %>
                            <tr>
                                <th><%=rs.getString(1)%></th>
                                <th><%=rs.getString(2)%></th>
                                <th><%=rs.getString(3)%></th>
                                <th><%=rs.getString(4)%></th>
                                <th><%=rs.getString(5)%></th>
                            </tr>
                            <%
                                    }

                                } catch (Exception e) {

                                }

                            %>
                            </section>
                        </table>
                        </div>
                        <h1><a href="Alta.jsp"> Registrar una nueva venta </a></h1>
                    </form>
                    </body>
                    </html>
