package by.epam.task03.logic.impl;

import javax.servlet.http.HttpServletRequest;

import by.epam.task03.controller.JspPageName;
import by.epam.task03.logic.CommandException;
import by.epam.task03.logic.ICommand;

public class NoSuchCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        return JspPageName.ERROR_PAGE;
    }
}
