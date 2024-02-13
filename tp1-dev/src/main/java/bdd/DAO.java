package bdd;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class DAO<T> {

    protected Connection connect = null;

    public DAO(Connection connect){
        this.connect = connect;
    }

    public abstract boolean create(T entity) throws SQLException;
    public abstract boolean update(T entity) throws SQLException;
    public abstract boolean delete(int id) throws SQLException;
    public abstract T read(int id) throws SQLException;
    public abstract List<T> fetchAll() throws SQLException;
}
