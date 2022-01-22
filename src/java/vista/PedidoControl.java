
package vista;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.*;

@WebServlet(name = "PedidoControl", urlPatterns = {"/PedidoControl"})
public class PedidoControl extends HttpServlet {
    private PedidoServicio pedSer;
    private PedidoPresentador pedPre;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //eventos del formulario
        String acc=request.getParameter("acc");
        if(acc.equals("Nuevo")){
            pedSer=new PedidoServicioImp();
            pedPre=new PedidoPresentador();            
            String cod=request.getParameter("cod");              
            pedPre.setFil(pedSer.nuevoPedido(cod));
            
            request.getSession().setAttribute("pedPre", pedPre);
            response.sendRedirect("PedidoGui.jsp");
        }
        if(acc.equals("Listar")){
            pedPre.setLis(pedSer.ListarArticulos());
            response.sendRedirect("ArticuloLista.jsp");
        }
        if(acc.equals("Agregar")){
            String cod=request.getParameter("cod");
            String nom=request.getParameter("nom");
            String pre=request.getParameter("pre");
            String can=request.getParameter("can");
            pedPre.setLis(pedSer.agregarArticulo(cod, nom, pre, can));
            response.sendRedirect("PedidoGui.jsp");
            
        }
        if(acc.equals("Quitar")){
            String cod=request.getParameter("cod");
            pedPre.setLis(pedSer.quitarArticulo(cod));
            response.sendRedirect("PedidoGui.jsp");
            
        }
        if(acc.equals("Buscar")){
            String cod=request.getParameter("cod");
            Object[]fil=pedSer.BuscarCliente(cod);
            if(fil!=null){
                pedPre.setFil2(fil);//PERSONA
            }
            else{
                pedPre.setMsg("El Cliente no existe en la BD");
            }
            response.sendRedirect("PedidoGui.jsp");
        }  
        if(acc.equals("Grabar")){
            String cod=request.getParameter("codcli");
            pedPre.setMsg(pedSer.grabarPedido(cod));
            response.sendRedirect("PedidoGui.jsp");
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
