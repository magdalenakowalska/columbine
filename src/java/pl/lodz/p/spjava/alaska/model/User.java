
package pl.lodz.p.spjava.alaska.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Artur
 */
@Entity
@Table
@NamedQueries({@NamedQuery(name="User.getAll", query="SELECT e FROM User e")})
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int userId;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String telephoneNumber;

    public int getId() {
        return userId;
    }

    public void setId(int id) {
        this.userId = id;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
   
    
    public User(int id, String login, String password, String name, String telephoneNumber) {
        this.userId = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }
    
    public User(){
        
    }
}
