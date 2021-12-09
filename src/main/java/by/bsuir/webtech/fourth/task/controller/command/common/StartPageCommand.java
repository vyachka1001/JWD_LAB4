package by.bsuir.webtech.fourth.task.controller.command.common;

import by.bsuir.webtech.fourth.task.controller.command.Command;
import by.bsuir.webtech.fourth.task.controller.command.CommandResult;
import by.bsuir.webtech.fourth.task.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartPageCommand implements Command {

    private static final String LOGIN_PAGE = "/index.jsp";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        return CommandResult.forward(LOGIN_PAGE);
    }
}
