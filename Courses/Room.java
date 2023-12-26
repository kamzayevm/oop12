package src.Courses;

import java.io.Serializable;

public class Room implements Serializable {

    private int numOfRoom;
    private Lesson lesson;

    public int getNumOfRoom() {
        return this.numOfRoom;
    }

    public void setNumOfRoom(int numOfRoom) {
        this.numOfRoom = numOfRoom;
    }

    public Lesson getLesson() {
        return this.lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public boolean isEmpty() {
        
        return false;
    }
}
