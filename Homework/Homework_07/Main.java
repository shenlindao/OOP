package Homework.Homework_07;

import Homework.Homework_07.DataBase.MeteoStore;
import Homework.Homework_07.NewSensor.ST500Info;
import Homework.Homework_07.NewSensor.SensorTemperature;
import Homework.Homework_07.OldSensor.MS200;
import Homework.Homework_07.OldSensor.MeteoSensor;

public class Main {

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с
    // этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от
    // предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные
        // отправить в метод save объекта meteoDb

        SensorTemperature sensorTemperature = new ST500Info().getData();
        ST500InfoAdapter st500InfoAdapter = new ST500InfoAdapter(sensorTemperature);
        meteoDb.save(st500InfoAdapter);
    }
}