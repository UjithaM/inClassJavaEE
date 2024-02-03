package software.ujithamigara.inclassassignment;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value1 = req.getParameter("value");
        String value = req.getHeader("Value");
        System.out.println(value1 + "  :  " + value);
    }
}