package ru.geekbrains.lesson4.task3.exceptions;

public abstract class PaymentException extends RuntimeException{
    public PaymentException(String mg) {
        super(mg);
    }
}
