<%-- 
    Document   : EmpleadoListar
    Created on : 04-may-2021, 20:57:05
    Author     : PC
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Estilos.css"/>      
        <style>@import"Estilos.css";</style>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-light bg-light border">

                <div class="container justify-content-between ">
                    <a class="navbar-brand text-success " href="Portal.jsp">SuperMercado</a>

                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav ml-auto">
                            <li class="nav-item ">
                                <button type="button" class="btn btn-outline-success" onclick="window.location.href = 'Portal.jsp'">Inicio</button>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="#">Productos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link disabled" href="#">Iniciar sesión</a>
                            </li>

                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle active text-success" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Registrar</a>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item text-success " href="EmpleadoGui.jsp">Empleado</a>
                                    <a class="dropdown-item text-success " href="ClienteGui.jsp">Cliente</a>
                                    <a class="dropdown-item text-success " href="ProveedorGui.jsp">Proveedor</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <div class="container" >
            <br>
            <div class="row text-center">
                <div class="col-12 col-xl-2 " >
                </div>
                <div class="col-12 col-xl-8 border rounded p-5" >
                    <h3 class="text-dark border border-dark rounded p-2" >Lista de Empleados</h3>
                    <% List lis = (List) session.getAttribute("lis"); %>
                    <div class="table-responsive" >
                        <table class="table table-striped">
                            <thead>
                              <tr>
                                <th scope="col">#</th>
                                <th scope="col">Código</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Tipo</th>
                                <th scope="col">Uusario</th>
                                <th scope="col">Password</th>
                                <th scope="col"></th>
                              </tr>
                            </thead>
                            <tbody>
                                <% for (int i = 1; i < lis.size(); i++) { %>
                                <% Object[] f = (Object[]) lis.get(i);%>
                                    <tr>
                                        <th scope="row"><%= i %></th>
                                        <td><%= f[0]%></td>
                                        <td><%= f[1]%></td>
                                        <td><%= f[2]%></td>
                                        <td><%= f[3]%></td>
                                        <td><%= f[4]%></td>
                                        <td>
                                            <form action="EmpleadoControl" method="post">
                                                <input type="hidden" name="cod" id="cod" value='<%= f[0] %>'>
                                                <button type="submit" name="acc" class="btn btn-outline-danger" value="Eliminar">Eliminar</button>
                                            </form>
                                        </td>
                                    </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                    <br>
                    <a class="btn btn-outline-success" href="Menu.jsp"> < Volver al menu</a>                     
                </div>
                <div class="col-12 col-xl-2 " >
                </div>
                
            </div>
            <br>
        </div>
        <div class="footer-copyright text-center py-3 bg-dark text-muted" > 2021 Copyright:
            <a  class="text-white" href=""> Rodrigo Loayza Abal</a>
        </div>  
    </body>
</html>
