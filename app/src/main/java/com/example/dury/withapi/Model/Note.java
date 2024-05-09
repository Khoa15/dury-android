package com.example.dury.withapi.Model;
public class Note {
    private String id;
    private String note;
    private int priority;
    private Category category;
    private Notification notification;


    // Constructor
    public Note(String note, int priority, Category category) {
        this.note = note;
        this.priority = priority;
        this.category = category;
    }
    public Note(){}

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    /*
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
*/
    // toString method
    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", note='" + note + '\'' +
                ", priority=" + priority +
                //", category=" + category +
                //", notification=" + notification +
                '}';
    }

    // equals and hashCode methods
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Note note1 = (Note) o;
//
//        if (priority != note1.priority) return false;
//        if (!id.equals(note1.id)) return false;
//        if (!note.equals(note1.note)) return false;
//        //if (!category.equals(note1.category)) return false;
//        //return notification.equals(note1.notification);
//    }

//    @Override
//    public int hashCode() {
//        int result = id.hashCode();
//        result = 31 * result + note.hashCode();
//        result = 31 * result + priority;
//        result = 31 * result + category.hashCode();
//        result = 31 * result + notification.hashCode();
//        return result;
//    }
}
