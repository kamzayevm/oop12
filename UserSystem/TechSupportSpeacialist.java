package src.UserSystem;

import java.util.Vector;

public class TechSupportSpecialist extends Employee {

    private Vector<String> orders;

    public TechSupportSpecialist(String username, String password, int salary, int workExperience) {
        super(username, password, salary, workExperience);
        this.orders = new Vector<>();
    }

    public Vector<String> getOrders() {
        return orders;
    }

    public void setOrders(Vector<String> orders) {
        this.orders = orders;
    }

    public boolean acceptOrder(String order) {
        if (orders.contains(order)) {
            System.out.println("Order accepted: " + order);
            return true;
        } else {
            System.out.println("Order not found.");
            return false;
        }
    }

    public boolean rejectOrder(String order) {
        if (orders.contains(order)) {
            orders.remove(order);
            System.out.println("Order rejected: " + order);
            return true;
        } else {
            System.out.println("Order not found.");
            return false;
        }
    }

    public Vector<String> viewOrders() {
        return orders;
    }
}
