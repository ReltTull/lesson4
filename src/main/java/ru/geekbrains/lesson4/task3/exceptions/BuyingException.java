package ru.geekbrains.lesson4.task3.exceptions;

public class BuyingException extends PaymentException{
    public BuyingException(String mg) {
        super(mg);
    }
}
