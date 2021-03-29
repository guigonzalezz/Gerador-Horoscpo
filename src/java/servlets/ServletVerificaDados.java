package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import util.VerificaDados;

@WebServlet(name = "ServletVerificaDados", urlPatterns = {"/ServletVerificaDados"})
public class ServletVerificaDados extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        String email, senha;
        String resp1 = "Acessando...", resp2="Email ou senha inválidos !!";
        boolean logou = false;
        
//        VerificaDados[] usuarios;
//        int tl=0;
//        
//        //FALTOU SALVAR NA SESSAO
//        
//        if(sessao.isNew()){
//            usuarios = new VerificaDados[20];
//            tl=0;
//        }
//        else {
//            usuarios = (VerificaDados[])sessao.getAttribute("vetor");
//            tl = (int)sessao.getAttribute("tl");
//        }
//        
        
        try {
            email = request.getParameter("email");
            senha = request.getParameter("senha");
        }
        catch(Exception e)
        {email=""; senha="";}
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            VerificaDados vd = new VerificaDados(email, senha);
            
            if(email != null && !email.isEmpty() && vd.verificaEmail())
            {
                if(vd.verificaSenha())
                {
                    HttpSession sessao = request.getSession();
                    sessao.setAttribute("usuario", vd);
                    logou = true;
                }
            }
            
            if(logou)
            {
                out.println(resp1);
                //response.sendRedirect("horoscopo.jsp");
            }
            else
            {
                out.println(resp2);
                //response.sendRedirect(".");
            }
                
            
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
