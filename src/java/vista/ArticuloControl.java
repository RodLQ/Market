
package vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ArticuloServicioImp;


@WebServlet(name = "ArticuloControl", urlPatterns = {"/ArticuloControl"})
public class ArticuloControl extends HttpServlet {
    
    private ArticuloServicioImp artSer;
    public ArticuloControl() {
        artSer= new ArticuloServicioImp();
    }
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acc=request.getParameter("acc");
        
        if(acc.equals("Grabar")){
            String cod=request.getParameter("cod");
            String nom=request.getParameter("nom");
            double pre=Double.parseDouble(request.getParameter("pre"));
            int sto=Integer.parseInt(request.getParameter("sto"));

            String msg=artSer.grabar(cod, nom, pre, sto);

            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("ClienteMensaje.jsp");
        }
        
        if(acc.equals("Buscar")){
            String cod=request.getParameter("cod");
            Object[]fil=artSer.buscar(cod);
            if(fil!=null){
                request.getSession().setAttribute("fil", fil);
                response.sendRedirect("ArticuloEditar.jsp");
            }else{
                request.getSession().setAttribute("msg","El Articulo no existe");
                response.sendRedirect("ClienteMensaje.jsp");
            }
        }
        if(acc.equals("Listar")){
            List lis=artSer.listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("ArticuloListar.jsp");
        }
        if(acc.equals("Modificar")){
            String cod=request.getParameter("cod");
            String nom=request.getParameter("nom");
            double pre=Double.parseDouble(request.getParameter("pre"));
            int sto=Integer.parseInt(request.getParameter("sto"));

            String msg=artSer.Actualizar(cod, nom, pre, sto);

            request.getSession().setAttribute("msg", "Articulo Modificado");
            response.sendRedirect("Mensaje.jsp");
        }
        if (acc.equals("Eliminar")) {
            String cod = request.getParameter("cod");
            artSer.eliminar(cod);
            request.getSession().setAttribute("msg", "Articulo Eliminado");
            response.sendRedirect("ClienteMensaje.jsp");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
