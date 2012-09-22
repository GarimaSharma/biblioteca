package com.twu28.biblioteca;
public class User {
    private String name;
    private String email;
    private int ph_no;
    private String username = "1111-1111";
    private String password;
    static int usernameGeneratingData = 1111;

    public User(String name, String email, int ph_no, String password) {
        this.name = name;
        this.email = email;
        this.ph_no = ph_no;
        this.password = password;
        username = generateNextUserName();
    }

    private String generateNextUserName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1111-");
        stringBuilder.append(usernameGeneratingData);
        usernameGeneratingData++;
        return stringBuilder.toString();
    }

     public boolean checkPassword(String username, String password) {
        return (username.equals(this.username) && password.equals(this.password));
    }
}
