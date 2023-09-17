package ru.geekbrains.lesson4.task3.exceptions;

public abstract class TicketProviderException extends RuntimeException {
    public TicketProviderException(String mg) {
        super(mg);
    }
}
