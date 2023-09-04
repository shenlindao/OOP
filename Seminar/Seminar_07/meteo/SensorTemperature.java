package Seminar.Seminar_07.meteo;

interface SensorTemperature {
	int identifier(); // идентификатор датчика

	double temperature(); // температура датчика

	int year(); // Год

	int day(); // День года

	int second(); // Секунда дня
}
