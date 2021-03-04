

import by.gourianova.binocularvision.Index;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/index")
public class MainServlet extends HttpServlet {
Index index=new Index();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Integer visitCounter = (Integer) session.getAttribute("visitCounter");
        if (visitCounter == null) {
            visitCounter = 1;
        } else {
            visitCounter++;

        }


        session.setAttribute("visitCounter", visitCounter);
        String username = req.getParameter("username");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("<title>Welcome servlet</title>");
        out.write("</head>");
        out.write("<body>");



        if (username == null) {
            //TODO: revise how on site
            out.write("<center>"+"<img src=\"/images/logo.jpg\">"+"</center>");
            out.write("<center>"+"<h3>"+"Good day, Anonymous" + "<br>");
            out.write("<br>"+"<h3>"+"<center>"+
            "We represent the scope of medical apps for the training and rehabilitation of disorders of binocular"+
                   "and monocular vision"+
                    "<br> (including  strabismus  amblyopia),<br>"+
                    "prevention of these disorders in healthy individuals,"+
                    "as well as developing apps for the stimulation of sensory-motor mechanisms and improve coordination and logical thinking. <br> Our apps are effectively used for children of preschool and school age"+
                    "</center>"+"</h3>");

            out.write("before you'll got an app or contact, you should register<br><br> " +
                    "<h3>"+"<a href=\"/registration\">&Cscr;ontinue</a> "+"</h3>"+"</center>");


        } else {
            out.write("Good day, " + username + "<br>");
            out.write("Page was visited " +visitCounter + " times.");



            //TODO: to correct number of loading  this page
            //TODO: to stop application after 3 wrong entering of password
        }





        out.write("</body>");
        out.write("</html>");
        out.close();
    }




}