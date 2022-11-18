import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        example();
    }

    static void example() {
        List<List> biDemArrList = new ArrayList<>();
        String cell = "";
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, cell);
            }
            for (int j = 0; j < 8; j++) {

                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    biDemArrList.get(i).add(j, "◯");
                }

                if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {
                    biDemArrList.get(i).add(j, "●");
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}