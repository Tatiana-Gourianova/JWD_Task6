package by.gourianova.binocularvision.dao;

import by.gourianova.binocularvision.db.ConnectionPool;
import by.gourianova.binocularvision.db.ProxyConnection;
import by.gourianova.binocularvision.bean.Role;
import by.gourianova.binocularvision.exception.DaoException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class RoleDao extends AbstractDao<Role> {
    private final static String SQL_FIND_ALL_ROLES = "SELECT * FROM roles";
    private final static String SQL_CREATE_ROLE = "INSERT INTO roles (Role) VALUES (?);";
    private final static String SQL_FIND_ROLE_BY_ID = "SELECT * FROM roles WHERE id = ?;";

    @Override
    public ArrayList<Role> findAll() throws DaoException {
        ArrayList<Role> rolesList = new ArrayList<>();
        ProxyConnection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionPool.getInstance().getConnection();
            preparedStatement = connection.prepareStatement(SQL_FIND_ALL_ROLES);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Role role = new Role();
                role.setId(resultSet.getInt(1));
                role.setRole(resultSet.getString(2));
                rolesList.add(role);
            }
        } catch (SQLException e) {
            throw new DaoException("Error in findAll", e);
        } finally {
            close(preparedStatement);
            close(connection);
        }
        return rolesList;
    }

    @Override
    public Role findEntityById(Integer id) throws DaoException {
        ProxyConnection connection = null;
        PreparedStatement preparedStatement = null;
        Role role = null;
        try {
            connection = ConnectionPool.getInstance().getConnection();
            preparedStatement = connection.prepareStatement(SQL_FIND_ROLE_BY_ID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                role = new Role();
                role.setId(resultSet.getInt(1));
                role.setRole(resultSet.getString(2));
            }
        } catch (SQLException e) {
            throw new DaoException("Error in findEntityById", e);
        } finally {
            close(preparedStatement);
            close(connection);
        }
        return role;
    }

    @Override
    public boolean createEntity(Role entity) throws DaoException {
        ProxyConnection connection = null;
        PreparedStatement preparedStatement = null;
        boolean isCreate;
        try {
            connection = ConnectionPool.getInstance().getConnection();
            preparedStatement = connection.prepareStatement(SQL_CREATE_ROLE);
            preparedStatement.setString(1, entity.getRole());
            preparedStatement.executeUpdate();
            isCreate = true;
        } catch (SQLException e) {
            throw new DaoException("Error in createEntity", e);
        } finally {
            close(preparedStatement);
            close(connection);
        }
        return isCreate;
    }
}
