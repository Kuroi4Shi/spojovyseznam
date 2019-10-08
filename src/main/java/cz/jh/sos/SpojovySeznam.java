package cz.jh.sos;

public class SpojovySeznam {
    public static Uzel initSeznam(int delkaSeznamu) {
        Uzel prvniUzel = new Uzel(1);
        Uzel temp = prvniUzel;
        for (int i = 2; i <= delkaSeznamu; i++) {
            Uzel newUzel = new Uzel(i);
            newUzel.setPredchozi(temp);
            temp.setNasledujici(newUzel);
            temp = newUzel;
        }
        return prvniUzel;
    }
}
