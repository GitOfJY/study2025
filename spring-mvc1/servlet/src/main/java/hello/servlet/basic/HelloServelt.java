package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServelt extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // super.service(req, resp);

        System.out.println("HelloServelt.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);
        // HelloServelt.service
        // request = org.apache.catalina.connector.RequestFacade@5ab1f700
        // response = org.apache.catalina.connector.ResponseFacade@3b8cd469

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello " + username);
    }

}
