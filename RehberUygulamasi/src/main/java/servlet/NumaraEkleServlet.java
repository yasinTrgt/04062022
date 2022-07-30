package servlet;

import com.google.gson.Gson;
import db.entity.Numara;
import db.service.NumaraServis;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

public class NumaraEkleServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        NumaraServis servis = new NumaraServis();

        StringBuffer stringBuffer = new StringBuffer();
        String line = null;

        try {

            BufferedReader bufferedReader = request.getReader();
            while ((line = bufferedReader.readLine()) != null) stringBuffer.append(line);

            String rehberAsJson = stringBuffer.toString();

            Gson gson = new Gson();
            Numara number = gson.fromJson(rehberAsJson, Numara.class);

            number.setId(1L);
            servis.addNumara(number);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
