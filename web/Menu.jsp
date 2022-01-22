<%-- 
    Document   : Menu
    Created on : 28-abr-2021, 20:35:50
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
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

        <div class="ordenar-footer-all container">
            <% Object[] fil = (Object[]) session.getAttribute("fil");%>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <!--buton menu-->
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class=" navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Archivos
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <li class="dropdown-submenu">
                                    <a class="dropdown-item dropdown-toggle" href="#">Empleado</a>

                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="EmpleadoBuscar.jsp">Buscar</a></li>
                                        <li>
                                            <form action="EmpleadoControl" >
                                                <input class="dropdown-item" id="bbto" type="submit" name="acc" value="Listar" />
                                            </form>
                                        </li>
                                    </ul>
                                </li>

                                <li class="dropdown-submenu">
                                    <a class="dropdown-item dropdown-toggle" href="#">Cliente</a>

                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="ClienteBuscar.jsp">buscar</a></li>
                                        <li>
                                            <form action="ClienteControl" >
                                                <input class="dropdown-item" id="bbto" type="submit" name="acc" value="Listar" />
                                            </form>
                                        </li>
                                    </ul>
                                </li>

                                <li class="dropdown-submenu">
                                    <a class="dropdown-item dropdown-toggle" href="#">Proveedor</a>

                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="ProveedorBuscar.jsp">Buscar</a></li>
                                        <li>
                                            <form action="ProveedorControl" >
                                                <input class="dropdown-item" id="bbto" type="submit" name="acc" value="Listar" />
                                            </form>
                                        </li>
                                        <li><a class="dropdown-item" href="ProveedorGui.jsp">Agregar</a></li>
                                    </ul>
                                </li>

                                <li class="dropdown-submenu">
                                    <a class="dropdown-item dropdown-toggle" href="#">Articulos</a>

                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="ArticuloBuscar.jsp">Buscar</a></li>
                                        <li>
                                            <form action="ArticuloControl" >
                                                <input class="dropdown-item" id="bbto" type="submit" name="acc" value="Listar" />
                                            </form>
                                        </li>
                                        <li>
                                            <a class="dropdown-item" href="ArticuloGui.jsp">Agregar Articulo</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Procesos
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <li class="dropdown-submenu">
                                    <a class="dropdown-item dropdown-toggle" href="#">Nota de pedido</a>

                                    <ul class="dropdown-menu">
                                        <li>
                                            <form action="PedidoControl" >
                                                <input type="hidden" name="cod" value='<%= fil[0]%>'>
                                                <input class="dropdown-item" id="bbto" type="submit" name="acc" value="Nuevo" />
                                            </form>
                                        </li>
                                    </ul>
                                </li>
                                <li class="dropdown-submenu">
                                    <a class="dropdown-item dropdown-toggle" href="#">Orden de compra</a>

                                    <ul class="dropdown-menu">
                                        <li>
                                            <form action="CompraControl" >
                                                <input type="hidden" name="cod" value='<%= fil[0]%>'>
                                                <input class="dropdown-item" id="bbto" type="submit" name="acc" value="Nuevo" />
                                            </form>
                                        </li>
                                    </ul>
                                </li> 
                            </ul>
                        </li>
                        
                        <%--
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Procesos
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <li>
                                    <form action="PedidoControl" >
                                        <input type="hidden" name="cod" value='<%= fil[0]%>'>
                                        <input class="dropdown-item" id="bbto" type="submit" name="acc" value="Nuevo" />
                                    </form>
                                </li>

                                <li>
                                    <form action="CompraControl" >
                                        <input type="hidden" name="cod" value='<%= fil[0]%>'>
                                        <input class="dropdown-item" id="bbto" type="submit" name="acc" value="Nuevo" />
                                    </form>
                                </li>
                            </ul>
                        </li>
                        --%>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Consultas</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="#">Inventario</a>
                        </li>

                    </ul>
                </div>
            </nav>
            <div class="text-center">
                <br>
                <br>
                <h3>Menu principal</h3>


<!-- <%%> Expresion jsp -->
                <br>
                <p>bienvenido <%=fil[1]%></p>
                <p>Codigo : <%=fil[0]%></p>
            </div>
        </div>

        <div class="footer-copyright text-center py-3 bg-dark text-muted" > 2021 Copyright:
            <a  class="text-white" href=""> Rodrigo Loayza Abal</a>
        </div>
    </body>
</html>
