
<%@page import="vista.CompraPresentador"%>
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
            <div class="container" >
                <br>
                <div class="row text-center">
                    <div class="col-12 col-xl-2 " >
                    </div>
                    <div class="col-12 col-xl-8 border rounded p-5" >

                        <h3 class="text-light bg-secondary border border-dark rounded p-2" >Orden de compra</h3>

                        <% CompraPresentador comPre = (CompraPresentador) session.getAttribute("comPre"); %>
                        <%! String tot;%>
                        <br>
                        <div class="row">
                            <% Object[] f1 = comPre.getFil(); %>
                            <% tot = f1[2].toString();%>
                            <div class="col-12 col-md-4" >
                                <p>Número : <%= f1[0]%></p>

                            </div>
                            <div class="col-12 col-md-4" >
                                <p>Fecha :  <%= f1[1]%></p>

                            </div>
                            <div class="col-12 col-md-4" >
                                <p>Empleado :  <%= f1[3]%></p>

                            </div>                            
                        </div>    

                        <div class="dropdown-divider col-12"></div>   

                        <div>
                            <form action="CompraControl" method="post" >
                                <div class="row">
                                    <% Object[] f3 = comPre.getFil2();%>

                                    <div class="col-6">
                                        <p>Codigo del proveedor : </p>

                                        <div class="input-group mb-3">
                                            <input type="text" name="cod" class="form-control" placeholder="" value="<%= f3[0]%>">
                                            <div class="input-group-append">
                                                <input class="btn btn-outline-info" type="submit" name="acc" value="Buscar" >
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <p>Nombre del proveedor : </p>
                                        <input class="form-control text-center" type="text" name="nom" value="<%= f3[1]%>">
                                    </div>

                                </div>                                 
                            </form>
                            
                        </div>
                                    
                                    
                        <div class="dropdown-divider col-12"></div>                   
                                    
                        <div class="table-responsive" >
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Código</th>
                                        <th scope="col">Nombre</th>
                                        <th scope="col">Precio</th>
                                        <th scope="col">Cantidad</th>
                                        <th scope="col">Importe</th>
                                        <th scope="col"></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <% for (int i = 0; i < comPre.getLis().size(); i++) { %>
                                    <% Object[] f2 = (Object[]) comPre.getLis().get(i); %>
                                    <% tot = f2[5].toString();%>
                                    
                                    
                                    <tr>
                                        <form action="CompraControl" method="post" >
                                            <th scope="row"></th>
                                            <td><input class="form-control text-center" size="3" type="text" name="cod" value="<%= f2[0] %>"></td>
                                            <td><%= f2[1]%></td>
                                            <td><%= f2[2]%></td>
                                            <td><%= f2[3]%></td>
                                            <td><%= f2[4]%></td>
                                            <td>
                                                <input class="btn btn-outline-danger" type="submit" name="acc" value="Quitar" />
                                            </td>
                                        </form>
                                    </tr>
                                    <% }%>
                                </tbody>
                                <thead>
                                    <th scope="col"></th>
                                    <th scope="col"></th>
                                    <th scope="col"></th>
                                    <th scope="col"></th>
                                    <th scope="col">Total : </th>
                                    <th><input class="form-control text-center" type="text" size="5" value='<%= tot%>' /></th>
                                    <th scope="col"></th>
                                </thead>
                            </table>
                        </div>
                        
                        
                        <div class="col-12">
                            <form action="CompraControl" method="post">
                                <input type="hidden" name="cod" value="<%= f1[3]%>" >
                                <div class="row">
                                    <input type="hidden" name="codpro" value="<%= f3[0]%>" >
                                    <div  class="col-4">
                                        <input class="btn btn-success col-11" type="submit" name="acc" value="Nuevo" />
                                    </div>
                                    <div  class="col-4">
                                        <input class="btn btn-success col-11" type="submit" name="acc" value="Listar" />
                                    </div>
                                    <div class="col-4">
                                        <input class="btn btn-success col-11" type="submit" name="acc" value="Grabar" />
                                    </div>
                                </div>
                            </form>
                        </div>
                        <p class="text-danger text-center col-12"><%= comPre.getMsg()%></p>  
                        <br>
                                             
                    </div>
                    <div class="col-12 col-xl-2 " >
                    </div>              
                </div>
                <br>
            </div>
            <br>
            <a class="btn btn-outline-success" href="Menu.jsp"> < Volver al menu</a>
        </div>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
        <div class="footer-copyright text-center py-3 bg-dark text-muted" > 2021 Copyright:
            <a  class="text-white" href=""> Rodrigo Loayza Abal</a>
        </div>
    </body>
</html>
