package model;
import java.util.Objects;

public class User {
    private Long id;
    private String name;
    private String password;
    private Long money;

    public User() {

    }

    public User(String name, String password, Long money) {
        this.name = name;
        this.password = password;
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                name.equals(user.name) &&
                password.equals(user.password) &&
                money.equals(user.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, money);
    }
}
