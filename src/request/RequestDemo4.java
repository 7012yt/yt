package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rd4")
public class RequestDemo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //来判断用户是从哪里来的
        String header = req.getHeader("referer");
        System.out.println(header);
        if(header != null){
            if(header.contains("Servlet")){
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().write("播放电影.....");
            }else {
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().write("滚....");
            }
        }
    }
}