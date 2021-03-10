package by.gourianova.binocularvision.service;

import by.gourianova.binocularvision.dao.UserDao;
import by.gourianova.binocularvision.bean.User;
import by.gourianova.binocularvision.exception.DaoException;
import by.gourianova.binocularvision.util.MD5;
import by.gourianova.binocularvision.util.ValidateUser;

import java.math.BigDecimal;
import java.util.ArrayList;


public class UserService {

    private UserDao userDao = new UserDao();

    public User findUserByLoginAndPassword(String login, String password) throws ServiceException {
        password = MD5.md5Encode(password);
        try {
            return userDao.findEntityByLoginAndPassword(login, password);
        } catch (DaoException e) {
            throw new ServiceException("Transaction failed in findUserByLoginAndPassword method", e);
        }
    }

    public boolean registerUser(User user) throws ServiceException {
        user.setPassword(MD5.md5Encode(user.getPassword()));
        try {
            return !userDao.findEntityByLogin(user.getLogin()) && userDao.createEntity(user);
        } catch (DaoException e) {
            throw new ServiceException("Transaction failed in registerUser method", e);
        }
    }

    public User findUserById(Integer id) throws ServiceException {
        try {
            return userDao.findEntityById(id);
        } catch (DaoException e) {
            throw new ServiceException("Transaction failed in findUserById method", e);
        }
    }

    public User updateBalance(User user, BigDecimal balance) throws ServiceException {
        try {
            return userDao.updateBalance(user, balance);
        } catch (DaoException e) {
            throw new ServiceException("Transaction failed in updateBalance method", e);
        }
    }

    public ArrayList<User> findAll() throws ServiceException {
        try {
            return userDao.findAll();
        } catch (DaoException e) {
            throw new ServiceException("Transaction failed in findAll method", e);
        }
    }

    public void updateUser(User user) throws ServiceException {
        try {
            userDao.updateEntity(user);
        } catch (DaoException e) {
            throw new ServiceException("Transaction failed in updateUser method", e);
        }
    }

    public String validateUser(User user) {

        return ValidateUser.validate(user);
        // return user.toString();}*/
    }
}
