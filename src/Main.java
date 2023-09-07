public class Main {
    public static void main(String[] args) {
        {// Task 1
            int accumulation = 0;
            int money = 15000;
            int month = 0;
            while (accumulation < 2_459_000) {
                accumulation += money;
                month += 1;
                System.out.println("Месяц, " + month + " сумма накоплений равна " + accumulation + " рублей");
            }
        }

        {// Task 2
            int i = 0;
            while (i < 10) {
                i++;
                System.out.print(" " + i);
            }
            System.out.println();
            for (i = 10; i > 0; i--) {
                System.out.print(" " + i);
            }
        }

        {// Task 3
            System.out.println();
            int country = 12_000_000;
            int born = 17;
            int die = 8;
            int koeficient = 1000;
            int plusPeopleInYear = (country / koeficient) * (born - die);
            int year = 2023;
            while (year < 2033) {
                year++;
                country += plusPeopleInYear;
                System.out.println("Год " + year + ", численность населения составляет " + country);
            }
        }

        {// Task 4 тут только через long получается норм число через double выдает фигню
            long accumulation = 15000;
            int month = 0;
            double bankPercent = 0.07;
            while (accumulation < 12_000_000) {
                accumulation += accumulation * bankPercent;
                month++;
                System.out.println("Месяц, " + month + " сумма накоплений равна " + accumulation + " рублей");
            }
        }
        {//Task 5
            long accumulation = 15000;
            int month = 0;
            double bankPercent = 0.07;
            while (accumulation < 12_000_000) {
                accumulation += accumulation * bankPercent;
                month++;
                if(month % 6 == 0){
                    System.out.println("Месяц, " + month + " сумма накоплений равна " + accumulation + " рублей");
                }
            }
        }

        {//Task 6
            long accumulation = 15000;
            int month = 0;
            double bankPercent = 0.07;
            int needTerm = 12*9;
            while (needTerm != month) {
                accumulation += accumulation * bankPercent;
                month++;
                if(month % 6 == 0){
                    System.out.println("Месяц, " + month + " сумма накоплений равна " + accumulation + " рублей");
                }
            }

        }

        {//Task 7
            int firstFriday = 1;
            for(int number = firstFriday; number<31;number+=7){
                System.out.println("Сегодня пятница " + number + " число");
            }
        }

        {//Task 8
            for (int i = 1823; i < 2123; i++) {
                if (i % 79 == 0) {
                    System.out.println(i);
                }
            }
        }



    }
}