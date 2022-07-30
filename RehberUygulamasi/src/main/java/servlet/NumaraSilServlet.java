package servlet;

import com.sun.deploy.net.HttpResponse;
import db.service.NumaraServis;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NumaraSilServlet extends HttpServlet {

    NumaraServis servis = new NumaraServis();

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        String id = request.getParameter("id");

        if (id == null) {
            try {
                response.sendError(404);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            Boolean status = servis.deleteNumar(Long.valueOf(id));
            if (status) {
                response.setStatus(203);
            }
        }
    }

}
