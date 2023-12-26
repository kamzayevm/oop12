package src.Library;

import src.RequestSystem.Request;
import src.UserSystem.Student;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Librarian implements ManageRequest, Serializable {

    private Vector<Book> listOfBooks;
    private Queue<Request> listOfRequestsLibrary;

    public Librarian() {
        listOfBooks = new Vector<>();
        listOfRequestsLibrary = new LinkedList<>();
    }

    public boolean giveBook(Student student, Book book) {
        if (listOfBooks.contains(book)) {
            student.receiveBook(book);
            listOfBooks.remove(book);
            System.out.println("Книга успешно выдана студенту " + student.getUsername());
            return true;
        } else {
            System.out.println("Книга не доступна для выдачи.");
            return false;
        }
    }

    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    public boolean deleteBook(Book book) {
        return listOfBooks.remove(book);
    }

    public Request getRequest() {
        return listOfRequestsLibrary.poll();
    }

    public boolean respondRequest() {
        System.out.println("Обработка заявки:");
        if (!listOfRequestsLibrary.isEmpty()) {
            Request request = listOfRequestsLibrary.poll();
            handleRequest(request);
            return true;
        }
        System.out.println("Нет доступных заявок для обработки.");
        return false;
    }

    private void handleRequest(Request request) {
        switch (request.getStatus()) {
            case APPROVED:
                System.out.println("Заявка утверждена. Выполняем дальнейшие действия.");
                break;
            case REJECTED:
                System.out.println("Заявка отклонена. Уведомляем пользователя.");
                break;
            case COMPLETED:
                System.out.println("Заявка выполнена. Подтверждаем завершение работы.");
                break;
            case FAILED:
                System.out.println("Заявка не выполнена. Архивируем информацию.");
                break;
            default:
                System.out.println("Неизвестный статус заявки.");
                break;
        }
        request.viewRequest();
        System.out.println("Заявка успешно обработана.");
    }

    public Vector<Book> getListOfBooks() {
        return listOfBooks;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void receiveRequest(Request request) {
        listOfRequestsLibrary.offer(request);
        System.out.println("Новая заявка получена от " + request.getUser().getUsername());
    }
}
