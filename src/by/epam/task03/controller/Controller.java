package by.epam.task03.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.epam.task03.logic.CommandException;
import by.epam.task03.logic.CommandHelper;
import by.epam.task03.logic.ICommand;

public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Controller() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String commandName =
                request.getParameter(RequestParameterName.COMMAND_NAME);
        ICommand command = CommandHelper.getInstance().getCommand(commandName);
        String page = null;
        try {
            page = command.execute(request);
        } catch (CommandException e) {
            page = JspPageName.ERROR_PAGE;
        } catch (Exception e) {
            page = JspPageName.ERROR_PAGE;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        if (dispatcher != null) {
            dispatcher.forward(request, response);
        } else {
            errorMessageDireclyFromresponse(response);
        }
    }

    private void errorMessageDireclyFromresponse(HttpServletResponse response) throws
            IOException {
        response.setContentType("text/html");
        response.getWriter().println("E R R O R");
    }
}
