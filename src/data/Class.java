package src.data;

public class Class {

    private String name;
    private String classroom;

    public Class(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
