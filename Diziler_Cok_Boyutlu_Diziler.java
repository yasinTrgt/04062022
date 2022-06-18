public class Diziler_Cok_Boyutlu_Diziler {

    public static void main(String[] args) {

        int a[][] = new int[5][5];// Boş tanımlama

        int dizi[][] = {{1, 2, 3}, {1, 2, 3}};

        System.out.println(dizi[1][2]);

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.println(dizi[i][j]);

            }

        }


    }
}
