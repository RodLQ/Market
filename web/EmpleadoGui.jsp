<%-- 
    Document   : EmpleadoGui
    Created on : 16-abr-2021, 8:53:53
    Author     : PC
--%>

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
                                <button type="button" class="btn btn-outline-success" onclick="window.location.href='Portal.jsp'">Inicio</button>
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
        <div class="ordenar-footer-empleado" >
            <div class="container">
                <br>
                <br>
                <br>
                <div class="row" >
                    <div class="col-1" >
                    </div>
                    <div class="col-10">
                        <div class="row">
                            <div class="col-12 col-xl-6 border rounded bordesombra" >
                                <form  class="p-4" action="EmpleadoControl" method="post">
                                    <h4 class="text-secondary" >Registrar Empleado</h4>
                                    <div class="m-3 text-secondary" >
                                        <div class="row"><h5>Código :</h5></div>
                                        <div class="row"><div class="col-12"><input class="btn-lg border-success col-12" type="text" name="cod"></div></div>
                                        <div class="row"><h5>Nombre :</h5></div>
                                        <div class="row"><div class="col-12"><input class="btn-lg border-success col-12 " type="text" name="nom"></div></div>
                                        <div class="row"><h5>Tipo :</h5></div>
                                        <div class="row"><div class="col-12"><input class="btn-lg border-success col-12 " type="text" name="tip"></div></div>
                                        <div class="row"><h5>Usuario :</h5></div>
                                        <div class="row"><div class="col-12"><input class="btn-lg border-success col-12 " type="text" name="usu"></div></div>
                                        <div class="row"><h5>Contraseña :</h5></div>
                                        <div class="row"><div class="col-12"><input class="btn-lg border-success col-12 " type="password" name="pas"></div></div>
                                        <div class="row">
                                            <div class="col-12 pt-4" >
                                                <input class="btn btn-success btn-lg col-12" type="submit" name="acc" value="Grabar">
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="col-12 col-xl-6 border rounded borrarimagen bordesombra" >
                                <div class="row" >
                                    <img src="img/emp2.jpg" class="img-fluid rounded" >
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <br>
        </div>       
        
        <div class="footer-copyright text-center py-3 bg-dark text-muted" > 2021 Copyright:
            <a  class="text-white" href=""> Rodrigo Loayza Abal</a>
        </div>
    </body>
</html>
