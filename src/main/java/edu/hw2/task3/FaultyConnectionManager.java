package edu.hw2.task3;

public class FaultyConnectionManager implements ConnectionManager {
    @Override
    public Connection getConnection() throws Exception {
        return new FaultyConnection();
    }
}

