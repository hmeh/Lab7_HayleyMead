
package models;

import java.io.Serializable;

/**
 * @author Hayley
 */
public class User implements Serializable{
    private String email;
    private Boolean active;
    private String first_name;
    private String last_name;
    private String password;
    private String role; // Might not need this 

    public User(String email, Boolean active, String first_name, String last_name, String password, String role) {
        this.email = email;
        this.active = active;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.role = role;
    }

    public User(String email, boolean active, String firstName, String lastName, String password, Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
