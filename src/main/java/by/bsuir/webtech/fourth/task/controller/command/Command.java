package by.bsuir.webtech.fourth.task.controller.command;

import by.bsuir.webtech.fourth.task.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException;
}
