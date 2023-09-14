import java.util.Arrays;
import java.util.Scanner;


 class Student {
     private String name;
     private int course;
     private boolean ifHeHasScholarship;

     public Student(String name, int course, boolean ifHeHasScholarship) {
         this.name = name;
         this.course = course;
         this.ifHeHasScholarship = ifHeHasScholarship;
     }
     public Student(String name, int course) {
         this.name = name;
         this.course = course;
         this.ifHeHasScholarship = false;
     }

     public Student(String name) {
         this.name = name;
         this.course = 0;
         this.ifHeHasScholarship = false;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getCourse() {
         return course;
     }

     public void setCourse(int course) {
         this.course = course;
     }

     public boolean isIfHeHasScholarship() {
         return ifHeHasScholarship;
     }

     public void setIfHeHasScholarship(boolean ifHeHasScholarship) {
         this.ifHeHasScholarship = ifHeHasScholarship;
     }
 }

     class TV {
         private int volume;

         public TV() {
             volume = 50;
         }

         public int getVolume() {
             return volume;
         }

         public void setVolume(int newVolume) {
             if (newVolume >= 0 && newVolume <= 110) {
                 volume = newVolume;
             } else {
                 System.out.println("Недопустимое значение громкости. Громкость должна быть в диапазоне от 0 до 110.");
             }
         }

     }

     public class Main {
         public static void main(String[] args) {
             // Task 1
             // С помощью == мы можем проверить только ссылаются ли данные строки на один и тот же объект
             // С помощью equals мы можем проверить равны ли строки по содержанию

             String strokaOne = "Hello";
             String strokaTwo = "Good Bye";

             if (strokaOne == strokaTwo) {
                 System.out.println("Строки ссылаются на один и тот же объект");
             } else {
                 System.out.println("Строки ссылаются на разные объекты");
             }

             //Task 2

             {
                 Scanner scanner = new Scanner(System.in);
                 System.out.println("Введите первое число: ");
                 double numberOne = scanner.nextDouble();
                 System.out.println("Введите второе число: ");
                 double numberTwo = scanner.nextDouble();

                 double min = Math.min(numberOne, numberTwo);
                 System.out.println("Минимум: " + min);

                 double max = Math.max(numberOne, numberTwo);
                 System.out.println("Максимум: " + max);

                 double absoluteValue = Math.abs(numberOne);
                 System.out.println("Абсолютное значение: " + absoluteValue);

                 double squareRoot = Math.sqrt(numberOne);
                 System.out.println("Корень числа: " + squareRoot);

                 double power = Math.pow(numberOne, 2);
                 System.out.println("Число в степени: " + power);

                 double roundedNumber = Math.round(numberTwo);
                 System.out.println("Округленное число: " + roundedNumber);
             }
             // Task 3
             {

                 Scanner scanner = new Scanner(System.in);

                 System.out.print("Введите радиус круга: ");
                 double radius = scanner.nextDouble();

                 double area = Math.PI * Math.pow(radius, 2);

                 System.out.println("Площадь круга с радиусом " + radius + " равна " + area);
             }
             // Task 4
             TV tV = new TV();

             tV.setVolume(51);

             System.out.println("Текущая громкость: " + tV.getVolume());


             Student student1 = new Student("Иван", 2, true);

             Student student2 = new Student("Василий", 3);

             Student student3 = new Student("Петя");
             System.out.println("Студент 1: Имя - " + student1.getName() +
                     ", Курс - " + student1.getCourse() +
                     ", Наличие стипендии - " + student1.isIfHeHasScholarship());

             System.out.println("Студент 2: Имя - " + student2.getName() +
                     ", Курс - " + student2.getCourse() +
                     ", Наличие стипендии - " + student2.isIfHeHasScholarship());

             System.out.println("Студент 3: Имя - " + student3.getName() +
                     ", Курс - " + student3.getCourse() +
                     ", Наличие стипендии - " + student3.isIfHeHasScholarship());

             // Task 6

             Student1 student = new Student1("Петя", 2, 5.0, 10.0);

             System.out.println("Имя студента: " + student.getName());
             System.out.println("Курс студента: " + student.getCourse());
             System.out.println("Площадь круга: " + student.getArea());
             System.out.println("Длина окружности: " + student.getCircumference());
             System.out.println("Объем цилиндра: " + student.getVolume());
             System.out.println("Площадь боковой поверхности цилиндра: " + student.getLateralSurfaceArea());



         }
 }
