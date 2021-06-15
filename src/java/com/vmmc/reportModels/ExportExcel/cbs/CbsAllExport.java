package com.vmmc.reportModels.ExportExcel.cbs;

import com.vmmc.entities.Cbs;
import com.vmmc.services.cbsablePatientImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lmbano
 */
@WebServlet(name = "CbsAllExport", urlPatterns = {"/CbsAllExport"})
public class CbsAllExport extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CbsAllExport</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CbsAllExport at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("export/CbsReport.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String startDatef = request.getParameter("txtRptStartDate");
        String endDatef = request.getParameter("txtRptEndDate");
        Date startDate = null;
        Date endDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            startDate = sdf.parse(startDatef);
            endDate = sdf.parse(endDatef);
        } catch (ParseException ex) {
            Logger.getLogger(CbsAllExport.class.getName()).log(Level.SEVERE, null, ex);
        }

        cbsablePatientImpl cbsimp = new cbsablePatientImpl();
        List<Cbs> cbslist = cbsimp.getExportCbs();//change to return all Vmmcs
        List<Cbs> epmtylist = new ArrayList();
        if (!cbslist.isEmpty()) {
            for (Cbs currentApp : cbslist) {
                if (currentApp.getDateFormCompleted().compareTo(startDate) >= 0 && currentApp.getDateFormCompleted().compareTo(endDate) <= 0) {
                    epmtylist.add(currentApp);
                }
            }
        }
        request.setAttribute("startDate", startDate);
        request.setAttribute("endDate", endDate);
        request.setAttribute("epmtylist", epmtylist);
        RequestDispatcher rd = request.getRequestDispatcher("export/CbsExportExcel.jsp");
        rd.forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
