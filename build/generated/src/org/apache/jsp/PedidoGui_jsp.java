package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vista.PedidoPresentador;

public final class PedidoGui_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String tot;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos.css\"/>      \n");
      out.write("        <style>@import\"Estilos.css\";</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light border\">\n");
      out.write("\n");
      out.write("                <div class=\"container justify-content-between \">\n");
      out.write("                    <a class=\"navbar-brand text-success \" href=\"Portal.jsp\">SuperMercado</a>\n");
      out.write("\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\"\n");
      out.write("                            aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"nav-item \">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-outline-success\" onclick=\"window.location.href = 'Portal.jsp'\">Inicio</button>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">Productos</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link disabled\" href=\"#\">Iniciar sesión</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle active text-success\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Registrar</a>\n");
      out.write("                                <div class=\"dropdown-menu\">\n");
      out.write("                                    <a class=\"dropdown-item text-success \" href=\"EmpleadoGui.jsp\">Empleado</a>\n");
      out.write("                                    <a class=\"dropdown-item text-success \" href=\"ClienteGui.jsp\">Cliente</a>\n");
      out.write("                                    <a class=\"dropdown-item text-success \" href=\"ProveedorGui.jsp\">Proveedor</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row text-center\">\n");
      out.write("                    <div class=\"col-12 col-xl-2 \" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-xl-8 border rounded p-5\" >\n");
      out.write("\n");
      out.write("                        <h3 class=\"text-light bg-secondary border border-dark rounded p-2\" >Nota de pedido</h3>\n");
      out.write("\n");
      out.write("                        ");
 PedidoPresentador pedPre = (PedidoPresentador) session.getAttribute("pedPre"); 
      out.write("\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            ");
 Object[] f1 = pedPre.getFil(); 
      out.write("\n");
      out.write("                            ");
 tot = f1[2].toString();
      out.write("\n");
      out.write("                            <div class=\"col-12 col-md-4\" >\n");
      out.write("                                <p>Número : ");
      out.print( f1[0]);
      out.write("</p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12 col-md-4\" >\n");
      out.write("                                <p>Fecha :  ");
      out.print( f1[1]);
      out.write("</p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12 col-md-4\" >\n");
      out.write("                                <p>Empleado :  ");
      out.print( f1[3]);
      out.write("</p>\n");
      out.write("\n");
      out.write("                            </div>                            \n");
      out.write("                        </div>    \n");
      out.write("\n");
      out.write("                        <div class=\"dropdown-divider col-12\"></div>   \n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <form action=\"PedidoControl\" method=\"post\" >\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");
 Object[] f3 = pedPre.getFil2();
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"col-6\">\n");
      out.write("                                        <p>Codigo del cliente : </p>\n");
      out.write("\n");
      out.write("                                        <div class=\"input-group mb-3\">\n");
      out.write("                                            <input type=\"text\" name=\"cod\" class=\"form-control\" placeholder=\"\" value=\"");
      out.print( f3[0]);
      out.write("\">\n");
      out.write("                                            <div class=\"input-group-append\">\n");
      out.write("                                                <input class=\"btn btn-outline-info\" type=\"submit\" name=\"acc\" value=\"Buscar\" >\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-6\">\n");
      out.write("                                        <p>Nombre del cliente : </p>\n");
      out.write("                                        <input class=\"form-control text-center\" type=\"text\" name=\"nom\" value=\"");
      out.print( f3[1]);
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>                                 \n");
      out.write("                            </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                        <div class=\"dropdown-divider col-12\"></div>                   \n");
      out.write("                                    \n");
      out.write("                        <div class=\"table-responsive\" >\n");
      out.write("                            <table class=\"table table-striped\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"col\">#</th>\n");
      out.write("                                        <th scope=\"col\">Código</th>\n");
      out.write("                                        <th scope=\"col\">Nombre</th>\n");
      out.write("                                        <th scope=\"col\">Precio</th>\n");
      out.write("                                        <th scope=\"col\">Cantidad</th>\n");
      out.write("                                        <th scope=\"col\">Importe</th>\n");
      out.write("                                        <th scope=\"col\"></th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
 for (int i = 0; i < pedPre.getLis().size(); i++) { 
      out.write("\n");
      out.write("                                    ");
 Object[] f2 = (Object[]) pedPre.getLis().get(i); 
      out.write("\n");
      out.write("                                    ");
 tot = f2[5].toString();
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <tr>\n");
      out.write("                                        <form action=\"PedidoControl\" method=\"post\" >\n");
      out.write("                                            <th scope=\"row\"></th>\n");
      out.write("                                            <td><input class=\"form-control text-center\" size=\"3\" type=\"text\" name=\"cod\" value=\"");
      out.print( f2[0] );
      out.write("\"></td>\n");
      out.write("                                            <td>");
      out.print( f2[1]);
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( f2[2]);
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( f2[3]);
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( f2[4]);
      out.write("</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input class=\"btn btn-outline-danger\" type=\"submit\" name=\"acc\" value=\"Quitar\" />\n");
      out.write("                                            </td>\n");
      out.write("                                        </form>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                                <thead>\n");
      out.write("                                    <th scope=\"col\"></th>\n");
      out.write("                                    <th scope=\"col\"></th>\n");
      out.write("                                    <th scope=\"col\"></th>\n");
      out.write("                                    <th scope=\"col\"></th>\n");
      out.write("                                    <th scope=\"col\">Total : </th>\n");
      out.write("                                    <th><input class=\"form-control text-center\" type=\"text\" size=\"5\" value='");
      out.print( tot);
      out.write("' /></th>\n");
      out.write("                                    <th scope=\"col\"></th>\n");
      out.write("                                </thead>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <form action=\"PedidoControl\" method=\"post\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <input type=\"hidden\" name=\"codcli\" value=\"");
      out.print( f3[0]);
      out.write("\" >\n");
      out.write("                                    <div  class=\"col-4\">\n");
      out.write("                                        <input class=\"btn btn-success col-11\" type=\"submit\" name=\"acc\" value=\"Nuevo\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div  class=\"col-4\">\n");
      out.write("                                        <input class=\"btn btn-success col-11\" type=\"submit\" name=\"acc\" value=\"Listar\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-4\">\n");
      out.write("                                        <input class=\"btn btn-success col-11\" type=\"submit\" name=\"acc\" value=\"Grabar\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <p class=\"text-danger text-center col-12\">");
      out.print( pedPre.getMsg());
      out.write("</p>  \n");
      out.write("                        <br>\n");
      out.write("                                             \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-xl-2 \" >\n");
      out.write("                    </div>              \n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <a class=\"btn btn-outline-success\" href=\"Menu.jsp\"> < Volver al menu</a>\n");
      out.write("        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("        <div class=\"footer-copyright text-center py-3 bg-dark text-muted\" > 2021 Copyright:\n");
      out.write("            <a  class=\"text-white\" href=\"\"> Rodrigo Loayza Abal</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}