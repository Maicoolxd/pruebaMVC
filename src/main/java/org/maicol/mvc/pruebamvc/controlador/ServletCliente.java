package org.maicol.mvc.pruebamvc.controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.maicol.mvc.pruebamvc.modelo.Cliente;

import java.io.IOException;

@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Obtener parámetros de la solicitud
        String nombre = request.getParameter("nombre");
        String sexo = request.getParameter("sexo");
        String edadStr = request.getParameter("edad");
        String sueldoMensualStr = request.getParameter("sueldoMensual");

        // Validar que los parámetros no sean nulos o vacíos
        if (nombre == null || nombre.isEmpty() ||
                sexo == null || sexo.isEmpty() ||
                edadStr == null || edadStr.isEmpty() ||
                sueldoMensualStr == null || sueldoMensualStr.isEmpty()) {
            response.sendRedirect("vistas/solicitud.jsp");
            return;
        }

        int edad;
        double sueldoMensual;

        // Validar y convertir parámetros a tipos numéricos
        try {
            edad = Integer.parseInt(edadStr);
            sueldoMensual = Double.parseDouble(sueldoMensualStr);
        } catch (NumberFormatException e) {
            response.sendRedirect("vistas/solicitud.jsp");
            return;
        }

        if (sueldoMensual > 700) {
            Cliente cliente = new Cliente(nombre, sexo, edad, sueldoMensual);
            HttpSession session = request.getSession();
            session.setAttribute("cliente", cliente);
            RequestDispatcher rd = request.getRequestDispatcher("vistas/credito.jsp");
            rd.forward(request, response);
        } else {
            response.sendRedirect("vistas/solicitud.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirigir al formulario de solicitud si se accede mediante GET
        response.sendRedirect("vistas/solicitud.jsp");
    }
}
