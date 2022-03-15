public class Solution {
    public String solution (int U, int L) {

        int[] C = {2,0,2,0};
        int karakterSayisi = C.length;
        int karakterToplamı = 0;
        int[][] matris;
        int[] ilkDizi = new int[karakterSayisi];
        int[] ikinciDizi = new int[karakterSayisi];

        for (int i = 0; i < karakterSayisi; i++) {
            karakterToplamı += C[i];
        }
        if (L + U != karakterToplamı) {
            System.out.println("IMPOSSIBLE");
        }else {

            for (int i = 0; i < karakterSayisi; i++) {
                if (C[i] > 1 & U > 0) {
                    ilkDizi[i] = 1;
                    ikinciDizi[i] = 1;
                    U--;
                    L--;
                } else if (C[i] == 1 & U > 0) {
                    ilkDizi[i] = 1;
                    ikinciDizi[i] = 0;
                    U--;
                } else if (C[i] == 1 & U == 0) {
                    ilkDizi[i] = 0;
                    ikinciDizi[i] = 1;
                    L--;
                } else if (C[i] == 0) {
                    ilkDizi[i] = 0;
                    ikinciDizi[i] = 0;
                }

            }

            for (int i = 0; i < karakterSayisi; i++) {
                System.out.print(ilkDizi[i]);


            }
            System.out.println();
            for (int i = 0; i < karakterSayisi; i++) {
                System.out.print(ikinciDizi[i]);


            }
        }



        return "";
    }
}
