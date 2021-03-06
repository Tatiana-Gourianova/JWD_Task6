package by.gourianova.binocularvision.util;

import by.gourianova.binocularvision.bean.User;
import by.gourianova.binocularvision.bean.User2;



import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;


public class UserInfoTag extends TagSupport {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            pageContext.getOut().write( " " + user.getFirstName() + ", " + user.getBalance() + " BYR");
        } catch (IOException e) {
            System.out.println("Under construction");
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
