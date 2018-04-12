package com.dec.operaciones;

/*
* Dante Colombo
* Sistema de Salud
* 
* 2018
* Todos los derechos reservados.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dante
 */
public class suma extends HttpServlet {
    
    HttpServletResponse response;
    static String dato;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet suma</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet suma at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.response = response;
        //processRequest(request, response);
        String n1 = request.getParameter("num1");
        
        if (n1.isEmpty()) {
            response.sendRedirect("elegir.jsp");
            return;
        }
        
        dato = "No existen datos con ese cuit.";
        
        ArrayList<ArrayList<Object>> lista = getLista();
        int contador = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            ArrayList<Object> subLista = lista.get(i);
            
            if (subLista.contains(n1)) {
                dato = subLista.get(0).toString() + " - " + subLista.get(1).toString();
            }
            
            contador++;
        }
        //<editor-fold defaultstate="collapsed" desc="comment">
        //        PrintWriter salida = response.getWriter();
        //        //salida.println(Integer.parseInt(n1) + Integer.parseInt(n2));
        //        salida.println(dato);
        //</editor-fold>
        
        if (true) {
            getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, this.response);
        }
        
        
    }
    
    public static String getDato() {
        return dato;
    }
    
    private ArrayList<ArrayList<Object>> getLista() {
        ArrayList<ArrayList<Object>> lista = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {
            ArrayList<Object> subLista = new ArrayList<>();
            
            for (int j = 0; j < 2; j++) {
                String num = "20" + i;
                String nom = "Dante Colombo " + i;
                subLista.add(num);
                subLista.add(nom);
            }
            
            lista.add(subLista);
        }
        
        return lista;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        //doGet(request, response);
        response.sendRedirect("elegir.jsp");
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
