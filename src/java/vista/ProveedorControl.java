/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ProveedorServicioImp;

/**
 *
 * @author PC
 */
@WebServlet(name = "ProveedorControl", urlPatterns = {"/ProveedorControl"})
public class ProveedorControl extends HttpServlet {
    private ProveedorServicioImp proSer;
    public ProveedorControl() {
        proSer = new ProveedorServicioImp();
    }

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acc=request.getParameter("acc");
        
        if(acc.equals("Grabar")){
            String codPro=request.getParameter("codPro");
            String nom=request.getParameter("nom");
            String dir=request.getParameter("dir");

            String msg=proSer.grabar(codPro, nom, dir);

            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("ClienteMensaje.jsp");
        }
        
        if(acc.equals("Buscar")){
            String cod=request.getParameter("cod");
            Object[]fil=proSer.buscar(cod);
            if(fil!=null){
                request.getSession().setAttribute("fil", fil);
                response.sendRedirect("ProveedorEditar.jsp");
            }else{
                request.getSession().setAttribute("msg","El Proveedor no existe");
                response.sendRedirect("ClienteMensaje.jsp");
            }
        }
        if(acc.equals("Listar")){
            List lis=proSer.listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("ProveedorListar.jsp");
        }
        if (acc.equals("Eliminar")) {
            String cod = request.getParameter("cod");
            proSer.eliminar(cod);
            request.getSession().setAttribute("msg", "Proveedor Eliminado");
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
