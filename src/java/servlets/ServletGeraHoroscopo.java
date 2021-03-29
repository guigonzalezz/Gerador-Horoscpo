package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.VerificaHoroscopo;

@WebServlet(name = "ServletGeraHoroscopo", urlPatterns = {"/ServletGeraHoroscopo"})
public class ServletGeraHoroscopo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Date data;
       
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            VerificaHoroscopo vh = new VerificaHoroscopo();
            String signo = vh.verificaSigno(request.getParameter("date"));
            String mensagem = vh.verificaMensagem(signo);
            
            Path path = Paths.get("C:\\Users\\nkdz\\Desktop\\Horoscopo\\web");
            Path path2 = Paths.get("assets\\"+ signo+".png");
            Path finalpath = path.resolve(path2);
            
            out.println("<p id='horoscopo-signo'>" + signo + "</p>");
            out.println("<p id='horoscopo-mensagem'>" + mensagem + " </p>");
            out.println("<div id'horoscopo-imagem'><img src='"+ finalpath +"' /></div>");
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
