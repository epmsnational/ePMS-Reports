/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.vmmc.reportModels.ExportExcel.sti;
//
//import com.vmmc.entities.StiCsexposeinfant;
//import com.vmmc.services.StiCsexposeinfantableImpl;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author devoop
// */
//@WebServlet(name = "SyphilisExposedExport", urlPatterns = {"/SyphilisExposedExport"})
//public class SyphilisExposedExport extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet SyphilisExposedExport</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet SyphilisExposedExport at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//     <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        RequestDispatcher rd = request.getRequestDispatcher("export/SyphilisExposedReport.jsp");
//        rd.forward(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//       String startDatef = request.getParameter("txtRptStartDate");
//        String endDatef = request.getParameter("txtRptEndDate");
//        Date startDate = null;
//        Date endDate = null;
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        try {
//            startDate = sdf.parse(startDatef);
//            endDate = sdf.parse(endDatef);
//        } catch (ParseException ex) {
//            Logger.getLogger(StiAllExport.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//
//     StiCsexposeinfantableImpl exp = new StiCsexposeinfantableImpl();
//        List<StiCsexposeinfant> sticsexpos = exp.getAllStiCsexposeinfant();
//
//        if (!sticsexpos.isEmpty()) {
//            for (StiCsexposeinfant currentApp : sticsexpos) {
//                if (currentApp.get().compareTo(startDate) >= 0 && currentApp.getDateofReport().compareTo(endDate) <= 0) {
//                    cs.add(currentApp);
//                }
//            }
//        }
//        request.setAttribute("startDate", startDate);
//        request.setAttribute("endDate", endDate);
//        request.setAttribute("cs", cs);
//        RequestDispatcher rd = request.getRequestDispatcher("export/CongenitalExportExcel.jsp");
//        rd.forward(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
