package org.jboss.as.quickstarts.helloworld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Александр on 28.03.2015.
 */
@WebServlet("/do.test")
public class ServletTest extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Action='" + request.getParameter("action") + "'");
        request.setAttribute("infoMessage", "blablabla");

        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        ss ps1 = new ss();
        ps1.setName("sas3");

        ss p2 = new ss();
        p2.setName("sas1");
        session.saveOrUpdate(ps1);
        session.saveOrUpdate(p2);

        session.getTransaction().commit();
        session.close();

        RequestDispatcher resultView = request.getRequestDispatcher("index.jsp");
        resultView.forward(request, response);
    }
}
