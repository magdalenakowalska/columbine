package pl.lodz.p.spjava.alaska.controller;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.lodz.p.spjava.alaska.dao.UserDaoLocal;
import pl.lodz.p.spjava.alaska.model.User;

/**
 *
 * @author Artur
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

    @EJB
    private UserDaoLocal userDao;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        String userIdStr = request.getParameter("userId");
        int userId = 0;
        if (userIdStr != null && !userIdStr.equals("")) 
            userId = Integer.parseInt(userIdStr);        
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String telephoneNumber = request.getParameter("telephoneNumber");
        User user = new User(userId, login, password, name, telephoneNumber);

        if ("Add".equalsIgnoreCase(action)) {
            userDao.addUser(user);
        } else if ("Edit".equalsIgnoreCase(action)) {
            userDao.editUser(user);
        } else if ("Delete".equalsIgnoreCase(action)) {
            userDao.deleteId(userId);
        } else if ("Search".equalsIgnoreCase(action)) {
            user = userDao.getUser(userId);
        }
        request.setAttribute("user", user);
        request.setAttribute("allUsers", userDao.getAllUsers());
        request.getRequestDispatcher("userinfo.jsp").forward(request, response);
    }
}
