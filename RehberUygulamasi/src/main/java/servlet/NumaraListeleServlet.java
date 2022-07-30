package servlet;

import com.google.gson.Gson;
import db.entity.Numara;
import db.service.NumaraServis;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class NumaraListeleServlet extends HttpServlet {

    NumaraServis servis = new NumaraServis();

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        response.setContentType("text/html");
        try {
            PrintWriter writer = response.getWriter();
            List<Numara> numaraList = servis.findAll();

            Gson gson = new Gson();
            String listAsJson = gson.toJson(numaraList);
            writer.write(listAsJson);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
