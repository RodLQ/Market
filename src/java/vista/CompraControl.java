/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.CompraServicio;
import servicio.CompraServicioImp;

/**
 *
 * @author PC
 */
@WebServlet(name = "CompraControl", urlPatterns = {"/CompraControl"})
public class CompraControl extends HttpServlet {
    private CompraServicio comSer;
    private CompraPresentador comPre;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String acc=request.getParameter("acc");
        if(acc.equals("Nuevo")){
            comSer=new CompraServicioImp();
            comPre=new CompraPresentador();            
            String cod=request.getParameter("cod");              
            comPre.setFil(comSer.nuevoPedido(cod));
            
            request.getSession().setAttribute("comPre", comPre);
            response.sendRedirect("CompraGui.jsp");
        }
        if(acc.equals("Listar")){
            comPre.setLis(comSer.ListarArticulos());
            response.sendRedirect("ArticuloListaP.jsp");
        }
        if(acc.equals("Agregar")){
            String cod=request.getParameter("cod");
            String nom=request.getParameter("nom");
            String pre=request.getParameter("pre");
            String can=request.getParameter("can");
            comPre.setLis(comSer.agregarArticulo(cod, nom, pre, can));
            response.sendRedirect("CompraGui.jsp");
            
        }
        if(acc.equals("Quitar")){
            String cod=request.getParameter("cod");
            comPre.setLis(comSer.quitarArticulo(cod));
            response.sendRedirect("CompraGui.jsp");
            
        }
        if(acc.equals("Buscar")){
            String cod=request.getParameter("cod");
            Object[]fil=comSer.BuscarProveedor(cod);
            if(fil!=null){
                comPre.setFil2(fil);
            }
            else{
                comPre.setMsg("El Proveedor no existe en la BD");
            }
            response.sendRedirect("CompraGui.jsp");
        }  
        if(acc.equals("Grabar")){
            String cod=request.getParameter("codpro");
            comPre.setMsg(comSer.grabarCompra(cod));
            response.sendRedirect("CompraGui.jsp");
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
