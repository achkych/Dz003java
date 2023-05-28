import java.util.ArrayList;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) {
        // Создаем список для хранения планет
        ArrayList<String> planets = new ArrayList<>();

        // Заполняем список названиями планет с повторениями
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Марс");
        planets.add("Венера");

        // Выводим названия каждой планеты и количество его повторений в списке
        for (String planet : planets) {
            int frequency = Collections.frequency(planets, planet);
            System.out.println(planet + " - " + frequency + " раз(а)");
        }
    }
}