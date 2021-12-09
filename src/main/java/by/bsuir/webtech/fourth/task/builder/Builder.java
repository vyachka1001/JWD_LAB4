package by.bsuir.webtech.fourth.task.builder;

import by.bsuir.webtech.fourth.task.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
