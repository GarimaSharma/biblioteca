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

    public String getDetails() {
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.append("  ");
        stringBuilder.append(email);
        stringBuilder.append("  ");
        stringBuilder.append(ph_no);
        return stringBuilder.toString();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (ph_no != user.ph_no) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + ph_no;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
