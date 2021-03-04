package by.gourianova.binocularvision.dao;

import by.gourianova.binocularvision.bean.RegistrationInfo;
import by.gourianova.binocularvision.bean.User;

public interface UserDAO {
	
	User authorization(String login, String password) throws DAOException;
	boolean	registration(RegistrationInfo regInfo) throws DAOException;
	
}
