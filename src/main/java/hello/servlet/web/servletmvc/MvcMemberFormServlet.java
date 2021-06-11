package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MVC Controller service");
        // WEB-INF 하위 경로는 servlet을 통한 forward만으로만 접근 가능.
        // 임의로 주소창을 통해 접근하면 404 error
        String viewPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        // forward는 redirect와는 달리 서버 내부에서 일어나는 호출로 클라이언트는 인지하지 못한다.
        // redirect는 통신이 2번 forward는 1번 발생한다.
        dispatcher.forward(request, response);

    }
}
