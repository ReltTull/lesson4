package ru.geekbrains.lesson4.task3.exceptions;

public class TicketNotFoundException extends TicketProviderException {
    public TicketNotFoundException(String mg) {
        super(mg);
    }
}
