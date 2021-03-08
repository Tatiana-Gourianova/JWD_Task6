package by.gourianova.apptrainer.action;


import by.gourianova.apptrainer.action.admin.user.*;
import by.gourianova.apptrainer.action.locale.ChangeLocaleAction;
import by.gourianova.apptrainer.action.user.*;


public enum ActionType {
    LOGIN(new LoginUserAction()),
    LOGOUT(new LogoutUserAction()),
    REGISTER(new RegisterUserAction()),


    ADD_ROLE(new AddRoleAction()),


    CHANGE_LOCALE(new ChangeLocaleAction()),
    SHOW_ALL_ROLES(new ShowAllRoleAction());


    Action action;

    Action getAction(){
        return action;
    }

    ActionType(Action action){
        this.action = action;
    }

}
