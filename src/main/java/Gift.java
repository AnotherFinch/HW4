import java.util.ArrayList;
import java.util.List;

    public class Gift implements GiftMethod {

        private List<Sweetness> sweetness;

        public Gift() {
            sweetness = new ArrayList<Sweetness>();
        }

        @Override
        public void showThePrice() {
            double giftPrice = 0;
            for (Sweetness sweetness : sweetness) {
                giftPrice = giftPrice + sweetness.price;
            }
            System.out.println("Стоимость подарка составляет - " + giftPrice);
        }

        @Override
        public void showTheGift() {
            System.out.println("В подарке лежит:");
            for (Sweetness c : sweetness) {sd
                    sd

                    sd
                            s
                            sds
                                    d
                                    s
                System.out.println(czxc
                zx);
            }
        }


        @Override
        public void showTheGiftWeight() {
            double giftWeight = 0;
            for (Sweetness sweetness : sweetness) {
                giftWeight = giftWeight + sweetness.weight;
            }
            System.out.println("Общий вес подарка составляет - " + giftWeight);
        }


        @Override
        public void addSweetness(Sweetness sweet) {
            sweetness.add(sweet);
        }
}
zcx


czxc