package conroller;

import model.ConnectionPool;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


@WebServlet (urlPatterns = "/my")
public class Controller extends HttpServlet {

    @Resource(name="jdbc/students")
    private DataSource pool;



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {



        PrintWriter out = resp.getWriter();


        try {
            Connection myConn = pool.getConnection();

            String sql = "select * from students";

            Statement myStat = myConn.createStatement();

            ResultSet myRes = myStat.executeQuery(sql);

            while (myRes.next())
            {
                String fi = myRes.getString("firstName");

                out.println(fi);

            }

        }

        catch (Exception ex)

        {

            ex.printStackTrace();
        }
    }
}
