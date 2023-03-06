public class Main {
    public static void main(String[] args) {
        /**
         * Создать иерархию родительский и дочернии классы для Транспорта
         * Например Транспорт - > Автомобиль - > Автобус
         * Транспорт - > Автомобиль - > Легковой
         * Используем наследование, инкапсуляцию
         */
        Bus bus1 = new Bus(2010, 80,28, "diesel engine",230, 60);
        Van van1 = new Van(2000, 160, 3, "gasoline engine", 115, 1200);

        System.out.println(bus1.toString());

        System.out.println(van1.toString());
        van1.setLoadCapacity(2000);
        System.out.println(van1.toString());
    }
}