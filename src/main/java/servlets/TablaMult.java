/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pojos.Tabla;

/**
 *
 * @author a022595832b
 */
public class TablaMult extends HttpServlet {

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
        response.setContentType("application/json");
        try (PrintWriter out = response.getWriter()) {

            Integer x = 5;
            Integer y = 10;

            ArrayList<Tabla> tab = new ArrayList();

            Tabla table = new Tabla();

            for (int i = 0; i < x; i++) {
                table.setFila(i);
                for (int j = 0; j < y; j++) {
                    table.setColumna(j);
                    tab.add(table);
                }
            }

            Gson oGson = new GsonBuilder().create();
            out.print(oGson.toJson(tab));

////            Integer x = Integer.parseInt(request.getParameter("alto"));
////            Integer y = Integer.parseInt(request.getParameter("ancho"));
//            
//            Integer x = 5;
//            Integer y = 10;
//            
////            ArrayList a1 = new ArrayList();
////            ArrayList a2 = new ArrayList();
//
//            out.print("{");
//            for (int i = 1; i <= x; i++) {
//                out.print("\"fila\" : [");
//                for (int j = 1; j <= y; j++) {
//                    Integer z = i * j;
//                    if (j != y) {
//                        out.print("{\"columna\" : " + z.toString() + "},");
//                    } else {
//                        out.print("{\"columna\" : " + z.toString() + "}");
//                    }
//                }
//                if (i != x) {
//                    out.print("],");
//                } else {
//                    out.print("]");
//                }
//            }
//            out.print("");
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
