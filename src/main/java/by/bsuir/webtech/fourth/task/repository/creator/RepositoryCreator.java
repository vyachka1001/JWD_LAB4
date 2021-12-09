package by.bsuir.webtech.fourth.task.repository.creator;

import by.bsuir.webtech.fourth.task.database.ConnectionPool;
import by.bsuir.webtech.fourth.task.repository.impl.RoomRepository;
import by.bsuir.webtech.fourth.task.repository.impl.UserRepository;

import java.sql.Connection;

public class RepositoryCreator implements AutoCloseable {

    private final ConnectionPool connectionPool;
    private final Connection connection;

    public RepositoryCreator() {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.getConnection();
    }

    public UserRepository getUserRepository() {
        return new UserRepository(connection);
    }

    public RoomRepository getRoomRepository() {
        return new RoomRepository(connection);
    }

    @Override
    public void close() {
        connectionPool.returnConnection(connection);
    }


}
