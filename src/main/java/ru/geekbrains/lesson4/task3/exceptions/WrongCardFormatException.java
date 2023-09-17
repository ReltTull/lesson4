package ru.geekbrains.lesson4.task3.exceptions;

public class WrongCardFormatException extends PaymentException{

    public WrongCardFormatException(String mg) {
        super(mg);
    }
}
