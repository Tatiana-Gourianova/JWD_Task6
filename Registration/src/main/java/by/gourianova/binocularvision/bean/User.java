package by.gourianova.binocularvision.bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class User {
    private int id;

    private String login;
    private String password;

    private String firstName;
    private String lastName;


    private BigDecimal balance;
    private int roleId;

    private LocalDate create_time;

    public User() {
    }

    public User(int id, String login, String password, String firstName, String lastName,  BigDecimal balance, int roleId, LocalDate create_time) {
        this.id = id;

        this.login = login;
        this.password = password;

        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.roleId = roleId;

        this.create_time=create_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public LocalDate getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDate create_time) {
        this.create_time = create_time;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                Objects.equals(getLogin(), user.getLogin()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getLastName(), user.getLastName()) &&
                Objects.equals(getBalance(), user.getBalance()) &&
                Objects.equals(getCreate_time(), user.getCreate_time()) &&
                getRoleId() == user.getRoleId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),  getLogin(), getPassword(), getFirstName(), getLastName(), getBalance(), getRoleId(), getCreate_time());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                ", roleId=" + roleId +
                ", create_time=" + create_time +
                "} " + super.toString();
    }

}
