package com.juros.juros;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "jurossimplesservlet", value = "/juros-simples.html")
public class JurosSimplesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        Double valorPresente = Double.parseDouble(request.getParameter("valorPresente"));
        Double tempo = Double.parseDouble(request.getParameter("tempo"));
        Double taxa = Double.parseDouble(request.getParameter("taxa"));
        taxa = taxa / 100;

        Double valorFuturo = valorPresente * (1 + (taxa * tempo));

        out.println("<html><body>");
        out.println("O Valor a se pagar é: " + valorFuturo);
        out.println("</body></html>");

    }
}
