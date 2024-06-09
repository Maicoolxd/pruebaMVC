package org.maicol.mvc.pruebamvc.controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.maicol.mvc.pruebamvc.modelo.Cliente;
import org.maicol.mvc.pruebamvc.modelo.Credito;

import java.io.IOException;

@WebServlet("/ServletCredito")
public class ServletCredito extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener cliente de la sesión
        HttpSession session = request.getSession();
        Cliente cliente = (Cliente) session.getAttribute("cliente");

        // Redirigir al index si el cliente no existe
        if (cliente == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        // Redirigir al formulario de crédito
        RequestDispatcher rd = request.getRequestDispatcher("vistas/credito.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener cliente de la sesión
        HttpSession session = request.getSession();
        Cliente cliente = (Cliente) session.getAttribute("cliente");

        if (cliente == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        // Obtener parámetros del formulario
        double monto;
        int plazo;

        try {
            monto = Double.parseDouble(request.getParameter("monto"));
            plazo = Integer.parseInt(request.getParameter("plazo"));
        } catch (NumberFormatException e) {
            response.sendRedirect("vistas/credito.jsp");
            return;
        }

        // Crear objeto Credito y configurar la solicitud
        Credito credito = new Credito(monto, plazo);
        request.setAttribute("credito", credito);

        // Redirigir a la vista resultado.jsp
        RequestDispatcher rd = request.getRequestDispatcher("vistas/resultado.jsp");
        rd.forward(request, response);
    }
}
