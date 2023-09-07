public class Main {
    public static void main(String[] args) {
        //Task 1
        for(int i = 1; i<=10; i++){
            System.out.print(" " + i);
        }
        System.out.println();

        //Task2

        for(int i = 10; i>0; i--){
            System.out.print(" " + i);
        }
        System.out.println();

        //Task 3

        for(int i = 0; i<17; i+=2){
            System.out.print(" " + i);
        }
        System.out.println();

        //Task 4

        for(int i = 10; i>=-10; i--){
            System.out.print(" " + i);
        }
        System.out.println();

        //Task 5

        for(int i = 1904; i<=2096; i+=4){
            System.out.print(" " + i);
        }
        System.out.println();

        // Task 6

        for(int i = 7; i<=98; i+=7){
            System.out.print(" " + i);
        }
        //Task 7

        System.out.println();

        for(int i = 1; i<=512;i+=i){
            System.out.print(" " + i);
        }

        System.out.println();
        // Task 8
        int accumulation = 0;
        int money = 29000;
        for(int i = 1; i<=12;i++){
            accumulation += money;
            System.out.println("Месяц, " + i + " сумма накоплений равна " + accumulation + " рублей");
        }

        //Task 9

        accumulation = 29000;
        for(int i = 1; i<=12;i++){
            accumulation+=29000 * 0.01;
            System.out.println("Месяц, " + i + " сумма накоплений равна " + accumulation + " рублей");
        }

        //Task 10
        for(int i = 1; i<=10; i++){
            int number = 2;
            int result = i * number;
            System.out.println("2*" + i + "=" + result);
        }
    }
}