import com.sun.tools.javac.Main;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.antProgramiCikar("k",43,3,12,3));

    }

    public static String antProgramiCikar(String buttonText, int yas, int kg, int boy, int yagOranı) {
        int[] yasArrayi = {12, 18, 60};
        int[] yagOraniArrayi = {6, 14, 17, 18};
        String[] yasAraligiArrayi = {"Genç","Yetişkin","İleri Yaş"};
        String[] sonucArrayi = {"Hacim Programı", "Kas Geliştirme Programı", "Zayıflama Programı"};
        for (int i = 0; i < yasArrayi.length; i++) {
            if (yas > 60){
                return "Yetişkin("+buttonText+") İleri Yaş Programı";
            }
            if (yas >= yasArrayi[i] && yas < yasArrayi[i + 1]) {
                for (int j = 0; j < yagOraniArrayi.length; j++) {
                    if (yagOranı < yagOraniArrayi[0]){
                        return yasAraligiArrayi[i]+"("+buttonText+") "+sonucArrayi[0];
                    }
                    if (yagOranı >= 18) {
                        return yasAraligiArrayi[i]+"("+buttonText+") "+sonucArrayi[sonucArrayi.length - 1];
                    }
                    if (yagOranı >= yagOraniArrayi[j] && yagOranı < yagOraniArrayi[j + 1]) {
                        return yasAraligiArrayi[i]+"("+buttonText+") "+sonucArrayi[j];
                    }
                }
            }

        }
        return "çocuk programı";
        /*
        if (buttonText.equals("Erkek")) {


            if (yas < 12) {
                return "Çocuk Programı";

            } else if (yas >= 12 && yas < 18) {

                if (yagOranı >= 18) {
                    return "Genç(e) Zayıflama Programı";
                } else if (14 <= yagOranı && yagOranı < 17) {
                    return "Genç(e) Kas Geliştirme Programı";
                } else if (6 < yagOranı && yagOranı < 14) {
                    return "Genç(e) Hacim Programı";
                }

                //Genç Programı
            } else if (yas < 60 && yas >= 18) {
                if (yagOranı >= 18) {
                    return "Yetişkin(e) Zayıflama Programı";
                } else if (14 <= yagOranı && yagOranı <= 17) {
                    return "Yetişkin(e) Kaslanma Programı";
                } else if (6 <= yagOranı && yagOranı < 14) {
                    return "Yetişkin(e) Hacim Programı";
                }

            } else if (yas >= 60) {
                return "Yetişkin(e) İleri Yaş Programı";
            }

        } else {

            if (yas < 12) {
                return "Çocuk Programı";

            } else if (yas >= 12 && yas < 18) {

                if (yagOranı >= 22) {
                    return "Genç(k) Zayıflama Programı";
                } else if (15 <= yagOranı && yagOranı < 22) {
                    return "Genç(k) Sıkılaşma Programı";
                } else if (6 < yagOranı && yagOranı < 15) {
                    return "Genç(k) Hacim Programı";
                } else {
                    //gecerli degerler giriniz..
                }

                //Genç Programı
            } else if (yas < 60 && yas >= 18) {
                if (yagOranı >= 23) {
                    return "Yetişkin(k) Zayıflama Programı";
                } else if (14 <= yagOranı && yagOranı < 23) {
                    return "Yetişkin(k) Sıkılaşma Programı";
                } else if (6 < yagOranı && yagOranı < 14) {
                    return "Yetişkin(k) Hacim Programı";

                }

            } else if (yas >= 60) {
                return "Yetişkin(k) İleri Yaş Programı";
            }

        }
        return null;*/

    }
}
