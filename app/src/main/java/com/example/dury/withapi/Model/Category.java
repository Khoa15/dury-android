package com.example.dury.withapi.Model;


import java.util.List;

public class Category {
    private String id;
    private String name;
    private String color;
    private List<Note> categoryNotes;
    private User user;

    // Constructor
    public Category(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Category(){}

    // Getter và Setter cho id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter và Setter cho name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter và Setter cho color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter và Setter cho categoryNotes
    public List<Note> getCategoryNotes() {
        return categoryNotes;
    }

    public void setCategoryNotes(List<Note> categoryNotes) {
        this.categoryNotes = categoryNotes;
    }

    // Getter và Setter cho user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Phương thức toString để trả về thông tin chi tiết của Category
    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", categoryNotes=" + categoryNotes +
                ", user=" + user +
                '}';
    }

    // Các phương thức hashCode và equals để so sánh đối tượng Category
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Category category = (Category) o;
//        return Objects.equals(id, category.id) &&
//                Objects.equals(name, category.name) &&
//                Objects.equals(color, category.color) &&
//                Objects.equals(categoryNotes, category.categoryNotes) &&
//                Objects.equals(user, category.user);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, color, categoryNotes, user);
//    }
}