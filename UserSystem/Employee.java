package src.UserSystem;

import src.MessageSystem.Message;

import java.util.ArrayList;
import java.util.List;

public class Employee extends User {

    private int salary;
    private int workExperience;
    private List<Message> messages;

    public Employee(String username, String password, int salary, int workExperience) {
        super(username, password);
        this.salary = salary;
        this.workExperience = workExperience;
        this.messages = new ArrayList<>();
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkExperience() {
        return this.workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public void viewMessages() {
        for (Message message : this.messages) {
            System.out.println(message.getContent());
        }
    }

    public boolean sendMessage(Message message) {
        return this.messages.add(message);
    }
}
