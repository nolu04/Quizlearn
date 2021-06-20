package nolu04.quizlearn.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdUser;

    @NotNull
    private String firstName;

    @NotNull
    private String name;

    @NotNull
    private String userName;

    private String email;

    @NotNull
    private String password;

    public User(String firstname, String name, String userName, String email, String password) {
        this.firstName = firstname;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public User(){
    }

    //Getter & Setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
