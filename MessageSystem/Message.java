package src.MessageSystem;

import src.UserSystem.User;
import src.Enums.SpeedMessage;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {

    private Date date;
    private String content;
    private User receiver;
    private User sender;
    private SpeedMessage speed;

    public Message(Date date, String content, User receiver, User sender, SpeedMessage speed) {
        this.date = date;
        this.content = content;
        this.receiver = receiver;
        this.sender = sender;
        this.speed = speed;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public SpeedMessage getSpeed() {
        return speed;
    }

    public void setSpeed(SpeedMessage speed) {
        this.speed = speed;
    }
}
