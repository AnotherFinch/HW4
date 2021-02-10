public class Main {

    public static void main(String[] args) {
       //numbers();

        Gift gift = new Gift();
        gift.addSweetness(new Cookie("Orio", 20.50, 20, "chocolate"));
        gift.addSweetness(new ChocolateBar("AlpineGold", 5.5 , 25, "square"));
        gift.addSweetness(new Apple("Подмосковные яблоки", 10.0, 5, "red"));
        gift.showThePrice();
        gift.showTheGiftWeight();
        gift.showTheGift();
    }










    public static void numbers(){
        int [] array = new int[20];
        int maxMin = -10;
        int minMax = 1;
        int a = -10;
        int b = 10;

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 20 + 1) - 10;
            System.out.print(array[i] + ", ");
            if (array[i] < 0 && array [i] >= maxMin){
                maxMin = array[i];
                a = i;
            }
            if (array[i] > 0 && array[i] <= minMax){
                minMax = array[i];
                b = i;
            }
        }
        System.out.println(" ");
        System.out.println("максимальное отрицательное число = " + maxMin + " под номером " + (a + 1));
        System.out.println("минимальное положительное число = " + minMax + " под номером " + (b + 1));

        //меняем местами максимльное отрицательное число и минимальное положительное
        int с = array[a];
        array[a] = array[b];
        array[b] = с;
        // проверяем поменялись ли местами элементы
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }

    }

}
