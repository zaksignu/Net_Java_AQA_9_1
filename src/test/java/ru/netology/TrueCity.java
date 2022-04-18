package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TrueCity {
    private String[] cities = {
            "Горно-Алтайск",
            "Уфа",
            "Улан-Удэ",
            "Махачкала",
            "Магас",
            "Нальчик",
            "Элиста",
            "Черкесск",
            "Петрозаводск",
            "Сыктывкар",
            "Симферополь",
            "Йошкар-Ола",
            "Саранск",
            "Якутск",
            "Владикавказ",
            "Казань",
            "Кызыл",
            "Ижевск",
            "Абакан",
            "Грозный",
            "Чебоксары",
            "Барнаул",
            "Чита",
            "Петропавловск-Камчатский",
            "Краснодар",
            "Красноярск",
            "Пермь",
            "Владивосток",
            "Ставрополь",
            "Хабаровск",
            "Благовещенск",
            "Архангельск",
            "Астрахань",
            "Белгород",
            "Брянск",
            "Владимир",
            "Волгоград",
            "Вологда",
            "Воронеж",
            "Иваново",
            "Иркутск",
            "Калининград",
            "Калуга",
            "Кемерово",
            "Киров",
            "Кострома",
            "Курган",
            "Курск",
            "Гатчина",
            "Липецк",
            "Магадан",
            "Красногорск",
            "Мурманск",
            "Нижний Новгород",
            "Великий Новгород",
            "Новосибирск",
            "Омск",
            "Оренбург",
            "Орёл",
            "Пенза",
            "Псков",
            "Ростов-на-Дону",
            "Рязань",
            "Самара",
            "Саратов",
            "Южно-Сахалинск",
            "Екатеринбург",
            "Смоленск",
            "Тамбов",
            "Тверь",
            "Томск",
            "Тула",
            "Тюмень",
            "Ульяновск",
            "Челябинск",
            "Ярославль"};
    private List<String> listOfCities = Arrays.asList(cities);
    public String ValidCity() {
        return listOfCities.get((int) (Math.random()*cities.length));
    }

}

