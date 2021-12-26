package ru.netology;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {}

    private static final Faker faker = new Faker(new Locale("ru"));

    public static String generateDate(int shift) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

public static String generateCity() {
    String city = faker.options().option("Москва", "Санкт-Петербург", "Майкоп", "Горно-Алтайск", "Уфа", "Магас", "Новосибирск", "Барнаул", "Абакан" , "Томск", "Тула", "Тюмень", "Ульяновск", "Челябинск", "Ярославль");
    return city;
}
    public static String generateName() {
        return faker.name().fullName();
    }

    public static String generatePhone() {
        return faker.phoneNumber().phoneNumber();
    }
}