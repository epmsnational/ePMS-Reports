///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.htc.controllers;
//
//import com.vmmc.reportsDAO.Hts;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.ServletOutputStream;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import net.sf.dynamicreports.report.base.expression.AbstractSimpleExpression;
//import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
//import static net.sf.dynamicreports.report.builder.DynamicReports.ctab;
//import static net.sf.dynamicreports.report.builder.DynamicReports.field;
//import static net.sf.dynamicreports.report.builder.DynamicReports.report;
//import static net.sf.dynamicreports.report.builder.DynamicReports.stl;
//import net.sf.dynamicreports.report.builder.ReportTemplateBuilder;
//import net.sf.dynamicreports.report.builder.crosstab.CrosstabBuilder;
//import net.sf.dynamicreports.report.builder.crosstab.CrosstabColumnGroupBuilder;
//import net.sf.dynamicreports.report.builder.crosstab.CrosstabMeasureBuilder;
//import net.sf.dynamicreports.report.builder.crosstab.CrosstabRowGroupBuilder;
//import net.sf.dynamicreports.report.builder.style.StyleBuilder;
//import net.sf.dynamicreports.report.constant.Calculation;
//import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
//import net.sf.dynamicreports.report.constant.PageOrientation;
//import net.sf.dynamicreports.report.constant.PageType;
//import net.sf.dynamicreports.report.definition.ReportParameters;
//import net.sf.dynamicreports.report.exception.DRException;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperPrint;
//
///**
// *
// * @author karma
// */
//@WebServlet(name = "HtsReport", urlPatterns = {"/HtsReport"})
//public class HtsReport1 extends HttpServlet {
//    
//    public String start;
//    public String finish;
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
//            out.println("<title>Servlet HtsReport</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet HtsReport at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    
//    private void build(HttpServletResponse response){
//        Hts cal = new Hts();
//        JasperPrint myReport = null;
//        CrosstabRowGroupBuilder<String> rowGroup = ctab.rowGroup("state", String.class)
//                .setTotalHeader("TOTAL").setHeaderWidth(200);
//
//        //Crosstab
//        CrosstabColumnGroupBuilder<String> columnMoHccGroup = ctab.columnGroup(new HtsReport1.MoHccExpression());
//
//        CrosstabMeasureBuilder<Integer> maleMeasure = ctab.measure("M", "male", Integer.class, Calculation.SUM);
//        CrosstabMeasureBuilder<Integer> femaleMeasure = ctab.measure("F", "female", Integer.class, Calculation.SUM);
//
//        CrosstabColumnGroupBuilder<String> columnGroup = ctab.columnGroup("item", String.class);
//        CrosstabBuilder crosstab = ctab.crosstab()
//                .headerCell(cmp.text("Age Group").setStyle(com.vmmc.services.Templates.boldStyle))
//                .highlightEvenRows()
//                .rowGroups(rowGroup).setCellWidth(50)
//                .columnGroups(columnGroup).setCellWidth(50)
//                .columnGroups(columnMoHccGroup)
//                .measures(maleMeasure, femaleMeasure);
//
//        StyleBuilder columnStyle = stl.style()
//                .setName("columnStyle")
//                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);
//        ReportTemplateBuilder template = com.vmmc.services.Templates.reportTemplate;
//        template.addTemplateStyle(columnStyle);
//
//        try {
//            ServletOutputStream servletOutputStream = response.getOutputStream();
//            myReport = report()
//                    .setPageFormat(PageType.A3, PageOrientation.LANDSCAPE)
//                    .addBackground(cmp.text("zim epms"))
//                    .setTemplate(template)
//                    .fields(field("agegroups", String.class))
//                    .setColumnStyle(stl.style().setHorizontalTextAlignment(HorizontalTextAlignment.LEFT))
//                    .title(com.vmmc.services.Templates.createTitleComponent("B.HIV TESTING SERVICES, including PMTCT and testing done at all the other entry points e.g VMMC, Wards, EPI etc"))
//                    .summary(crosstab)
//                    .pageFooter(com.vmmc.services.Templates.footerComponent)
//                    .setDataSource(cal.createDataSource())
//                    //.show();
//                    .toJasperPrint();
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            response.setContentType("application/pdf");
//
//            JasperExportManager.exportReportToPdfStream(myReport, baos);
//
//            response.setContentLength(baos.size());
//            baos.writeTo(servletOutputStream);
//        } catch (DRException | IOException | JRException e) {
//            e.printStackTrace();
//        }
//    }
//    
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        RequestDispatcher disp = request.getRequestDispatcher("reporsFilteringtJsps/reportHts.jsp");
//        disp.forward(request, response);
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
//
//        build(response);
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
//    private class IndivExpression extends AbstractSimpleExpression<String> {
//
//        private static final long serialVersionUID = 1L;
//
//        @Override
//        public String evaluate(ReportParameters reportParameters) {
//            return reportParameters.getValue("couplestatus");
//        }
//    }
//
//    private class MoHccExpression extends AbstractSimpleExpression<String> {
//
//        private static final long serialVersionUID = 1L;
//
//        @Override
//        public String evaluate(ReportParameters reportParameters) {
//            return reportParameters.getValue("agegroups");
//        }
//    }
//
//}
