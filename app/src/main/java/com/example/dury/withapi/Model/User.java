package com.example.dury.withapi.Model;


import java.util.List;

public class User {
    private String id;
    private String username;
    private String password;
    private List<Category> listCategories;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(){}

    // Getter và Setter cho id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter và Setter cho username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter và Setter cho password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter và Setter cho listCategories
    public List<Category> getListCategories() {
        return listCategories;
    }

    public void setListCategories(List<Category> listCategories) {
        this.listCategories = listCategories;
    }

    // Phương thức toString để trả về thông tin chi tiết của User
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", listCategories=" + listCategories +
                '}';
    }

    // Các phương thức hashCode và equals để so sánh đối tượng User
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(id, user.id) &&
//                Objects.equals(username, user.username) &&
//                Objects.equals(password, user.password) &&
//                Objects.equals(listCategories, user.listCategories);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, username, password, listCategories);
//
//    }
}
