public class Main {
    public static void main(String[] args) {
        // Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.print("\n\n");

//Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.print("\n\n");

//Задача 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.print("\n\n");

//Задача 4
        for (int i = 10; i >= (-10); i--) {
            System.out.println(i);
        }
        System.out.print("\n\n");

//Задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }
        System.out.print("\n\n");

//Задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.print("\n\n");

//Задача 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.print("\n\n");

//Задача 8
        int savedPerMonth = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.print("Месяц ");
            switch (i) {
                case 1:
                    System.out.print("январь, ");
                    break;
                case 2:
                    System.out.print("февраль, ");
                    break;
                case 3:
                    System.out.print("март, ");
                    break;
                case 4:
                    System.out.print("апрель, ");
                    break;
                case 5:
                    System.out.print("май, ");
                    break;
                case 6:
                    System.out.print("июнь, ");
                    break;
                case 7:
                    System.out.print("июль, ");
                    break;
                case 8:
                    System.out.print("август, ");
                    break;
                case 9:
                    System.out.print("сентябрь, ");
                    break;
                case 10:
                    System.out.print("октябрь, ");
                    break;
                case 11:
                    System.out.print("ноябрь, ");
                    break;
                case 12:
                    System.out.print("декабрь, ");
                    break;
            }
            total = total + savedPerMonth;
            System.out.printf("сумма накоплений равна %d рублей.\n", total);
        }
        System.out.print("\n\n");

//Задача 9
        savedPerMonth = 29000;
        total = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.print("Месяц ");
            switch (i) {
                case 1:
                    System.out.print("январь, ");
                    break;
                case 2:
                    System.out.print("февраль, ");
                    break;
                case 3:
                    System.out.print("март, ");
                    break;
                case 4:
                    System.out.print("апрель, ");
                    break;
                case 5:
                    System.out.print("май, ");
                    break;
                case 6:
                    System.out.print("июнь, ");
                    break;
                case 7:
                    System.out.print("июль, ");
                    break;
                case 8:
                    System.out.print("август, ");
                    break;
                case 9:
                    System.out.print("сентябрь, ");
                    break;
                case 10:
                    System.out.print("октябрь, ");
                    break;
                case 11:
                    System.out.print("ноябрь, ");
                    break;
                case 12:
                    System.out.print("декабрь, ");
                    break;
            }
            total = total + savedPerMonth;
            total = total + total / 100;
            System.out.printf("сумма накоплений равна %d рублей.\n", total);
        }
        System.out.print("\n\n");

//Задача 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }
    }
}