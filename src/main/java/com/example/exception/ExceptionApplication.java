package com.example.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionApplication {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        try {
            UserRegistrationUtils.registerUser(login, password, confirmPassword);
            System.out.println("Пользователь успешно зарегистрирован");
        } catch (WrongLoginException e) {
            System.out.println("Ошибка регистрации: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка регистрации: " + e.getMessage());
        }
    }
}