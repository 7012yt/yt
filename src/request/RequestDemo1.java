package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rd1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求的方式：Get
        String method = req.getMethod();
        System.out.println(method);
        //获取虚拟目录: /war exploded
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //获取Servlet路径
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        //获得get方式请求参数：name = zhangsan
        String queryString = req.getQueryString();
        System.out.println(queryString);
        //获取请求URI；/.../rd1下面的第二个会将http也写上去
        String requestURI = req.getRequestURI();
        StringBuffer requestURL2 = req.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL2);
        //获取协议一起版本 HTTP/1.1
        String protocol = req.getProtocol();
        System.out.println(protocol);
        //获取客户机的IP地址
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
