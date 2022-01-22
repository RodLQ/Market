<%-- 
    Document   : Portal
    Created on : 16-abr-2021, 8:30:30
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>@import"Estilos.css";</style>
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
                                <a class="nav-link" href="Acceso.jsp">Iniciar sesión</a>
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
        <div>
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                  <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                  <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                  <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                  <div class="carousel-item active">
                    <img class="d-block w-100" src="img/imagensuper1.jpg" alt="First slide">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Calidad</h5>
                        <p>Los mejores productos de limpieza para el hogar</p>
                    </div>
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-100" src="img/imagensuper4.jpg" alt="Second slide">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Preciazos</h5>
                        <p>Los mejores precios en SM</p>
                    </div>
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-100" src="img/imagensuper3.jpg" alt="Third slide">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Preciazos</h5>
                        <p>Los mejores precios en SM</p>
                    </div>
                  </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                  <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                  <span class="carousel-control-next-icon" aria-hidden="true"></span>
                  <span class="sr-only">Next</span>
                </a>
            </div>
            
            <div class="container mt-4" >
                <div class="card-deck">
                    <div class="card text-center">
                      <img class="card-img-top" src="img/producto1.png" alt="Card image cap">
                      <div class="card-body">
                        <h5 class="card-title">ARROZ COSTEÑO</h5>
                        <p class="card-text">Bolsa 750 gr</p>
                        <p class="card-text">s/ 3.50</p>
                        <p class="card-text"><button type="button" class="btn btn-outline-success">Comprar</button>
                            <button type="button" class="btn btn-success">Agregar al carrito</button>
                        </p>
                      </div>
                    </div>
                    <div class="card text-center">
                      <img class="card-img-top" src="img/producto2.png" alt="Card image cap">
                      <div class="card-body">
                        <h5 class="card-title">LECHE EVAPORADA GLORIA SIXPACK</h5>
                        <p class="card-text">s/ 20.00</p>
                        <p class="card-text"><button type="button" class="btn btn-outline-success">Comprar</button>
                            <button type="button" class="btn btn-success">Agregar al carrito</button>
                        </p>
                      </div>
                    </div>
                    <div class="card text-center">
                      <img class="card-img-top" src="img/producto3.jpg" alt="Card image cap">
                      <div class="card-body">
                        <h5 class="card-title">MANTEQUILLA GLORIA CON SAL</h5>
                        <p class="card-text">100 gr</p>
                        <p class="card-text">s/ 6.00</p>
                        <p class="card-text"><button type="button" class="btn btn-outline-success">Comprar</button>
                            <button type="button" class="btn btn-success">Agregar al carrito</button>
                        </p>
                      </div>
                    </div>
                </div>
            </div>
            
            <div class="container mt-4" >
                <div class="card-deck">
                    <div class="card text-center">
                      <img class="card-img-top" src="img/producto4.jpg" alt="Card image cap">
                      <div class="card-body">
                        <h5 class="card-title">PAPEL HIGIENICO FAIMILIA</h5>
                        <p class="card-text">s/ 15.00</p>
                        <p class="card-text"><button type="button" class="btn btn-outline-success">Comprar</button>
                            <button type="button" class="btn btn-success">Agregar al carrito</button>
                        </p>
                      </div>
                    </div>
                    <div class="card text-center">
                      <img class="card-img-top" src="img/producto5.jpg" alt="Card image cap">
                      <div class="card-body">
                        <h5 class="card-title">SOPA INSTANTANEA AJINOMEN</h5>
                        <p class="card-text">s/ 2.00</p>
                        <p class="card-text"><button type="button" class="btn btn-outline-success">Comprar</button>
                            <button type="button" class="btn btn-success">Agregar al carrito</button>
                        </p>
                      </div>
                    </div>
                    <div class="card text-center">
                      <img class="card-img-top" src="img/producto6.jpg" alt="Card image cap">
                      <div class="card-body">
                        <h5 class="card-title">GASEOSA GUARANA SIXPACK</h5>
                        <p class="card-text">Lata 355 ml paquete 6 unidades</p>
                        <p class="card-text">s/ 13.00</p>
                        <p class="card-text"><button type="button" class="btn btn-outline-success">Comprar</button>
                            <button type="button" class="btn btn-success">Agregar al carrito</button>
                        </p>
                      </div>
                    </div>
                </div>
            </div>
            
        </div>
        <br>
        <div class="footer-copyright text-center py-3 bg-dark text-muted" > 2021 Copyright:
            <a  class="text-white" href=""> Rodrigo Loayza Abal</a>
        </div>        
    </body>
</html>
