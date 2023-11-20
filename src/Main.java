public class Main {
        public static void main(String[] args) {
            isLeap(2024);
            versSelect(0, 2023);
            versSelect(1, 2010);
            deliveryDist(97);
        }
    public static void isLeap(int year) {
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (leapYear) {
            System.out.println(("Год ") + year + (" - високосный."));
        } else {
            System.out.println(("Год ") + year + (" - не високосный."));
        }
    }
    public static void versSelect(int client, int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            if (client == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (client == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (client == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (client == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }


    }
    public static void deliveryDist (int deliveryDistance){
            int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 100){
            deliveryTime = deliveryTime + 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
    }