package com.a21713885.l3.unicaen.android.gestionstock;

/**
 * Created by djelo bah on 03-08-18.
 */

public class User {
    private int useID;
    private String username;
    private String password;
    private String role;

    public User(int id, String username, String pwd, String role){
        this.setUseID(id);
        this.setUsername(username);
        this.setPassword(pwd);
        this.setRole(role);
    }

    public int getUseID() {
        return useID;
    }

    public void setUseID(int useID) {
        this.useID = useID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
