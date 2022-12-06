import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние:");
        int x= scanner.nextInt();

        if (x==1) {
            System.out.println("Выберите единицу измерения: 1 - тонна, 2 - килограмм, 3 - грамм, 4 - миллиграмм:");
            int y= scanner.nextInt(); //выбранная единица измерения
            System.out.println("Введите количество");
            double massa = scanner.nextDouble(); //введенное число
            System.out.println("Результат:");
            switch (y) {
                case 1:
                    System.out.println("Тонны = " + massa);
                    System.out.println("Килограммы = " + massa*1000);
                    System.out.println("Граммы = " + massa*1000000);
                    System.out.println("Миллиграммы = " + massa*1000000000);
                    break;

                case 2:
                    System.out.println("Тонны = " + massa/1000);
                    System.out.println("Килограммы = " + massa);
                    System.out.println("Граммы = " + massa*1000);
                    System.out.println("Миллиграммы = " + massa*1000000);
                    break;

                case 3:
                    System.out.println("Тонны = " + massa/1000000);
                    System.out.println("Килограммы = " + massa/1000);
                    System.out.println("Граммы = " + massa);
                    System.out.println("Миллиграммы = " + massa*1000);
                    break;

                case 4:
                    System.out.println("Тонны = " + massa/1000000000);
                    System.out.println("Килограммы = " + massa/1000000);
                    System.out.println("Граммы = " + massa/1000);
                    System.out.println("Миллиграммы = " + massa);
                    break;
            }
        }
        else if (x==2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут:");
            int y= scanner.nextInt();
            System.out.println("Введите количество");
            double rasstoyanie = scanner.nextDouble();
            System.out.println("Результат:");
            switch (y) {
                case 1:
                    System.out.println("Метры = " + rasstoyanie );
                    System.out.println("Мили = " + rasstoyanie*0.00062);
                    System.out.println("Ярды = " + rasstoyanie*1.09);
                    System.out.println("Футы = " + rasstoyanie*3.28);
                    break;

                case 2:
                    System.out.println("Метры = " + rasstoyanie*1609.34);
                    System.out.println("Мили = " + rasstoyanie);
                    System.out.println("Ярды = " + rasstoyanie*1760);
                    System.out.println("Футы = " + rasstoyanie*5280);
                    break;

                case 3:
                    System.out.println("Метры = " + rasstoyanie*0.91);
                    System.out.println("Мили = " + rasstoyanie*0.00057);
                    System.out.println("Ярды = " + rasstoyanie);
                    System.out.println("Футы = " +rasstoyanie*3 );
                    break;

                case 4:
                    System.out.println("Метры = " +rasstoyanie*0.3 );
                    System.out.println("Мили = " + rasstoyanie*0.00019 );
                    System.out.println("Ярды = " + rasstoyanie*0.33);
                    System.out.println("Футы = " + rasstoyanie);
                    break;
            }
        }
        else {
            System.out.println("Некорректный ввод");
        }
    }
}