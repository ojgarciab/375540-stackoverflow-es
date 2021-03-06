public class Pruebas {
    /* Trucamos la clase para facilitar el código */
    static class daoF {
        static long numFI = 0, numFA = 0;
        static long getNumFI() {
            return numFI;
        }
        static long getNumFA() {
            return numFA;
        }
    }

    /* Método orginal */
    public static long obtenerNum() {
        long numFI = daoF.getNumFI();
        long numFA = daoF.getNumFA();

        if (numFI>=0 && numFA>=0) {
            if (numFI == numFA) {
            if (numFI == 0) {
                return numFI + 1;    
            }
            return numFI  + 1;
            } else if (numFI > numFA) {
            return numFI + 1;
            } else if (numFA > numFI) {
            return numFA + 1;
            } else {
            return -1;
            }
        } else {
            return  -1;
        }
    }

    static public long obtenerNum_Oscar() {
        long numFI = daoF.getNumFI();
        long numFA = daoF.getNumFA();

        if (numFI >= 0 && numFA >= 0) {
            return Math.max(numFI, numFA) + 1;
        }
        return -1;
    }

    static public long sumarUnoAlNumeroMayor() {
        long numFI = daoF.getNumFI();
        long numFA = daoF.getNumFA();

        if (numFI<0 && numFA<0) {
            return -1;
        }
        return numFI > numFA ? numFI + 1 : numFA + 1;
    }

    public static void main(String args[]) {
        long obtenerNum, obtenerNum_Oscar, sumarUnoAlNumeroMayor;
        for (daoF.numFI = -2; daoF.numFI <= 2; daoF.numFI++) {
            for (daoF.numFA = -2; daoF.numFA <= 2; daoF.numFA++) {
                System.out.printf(
                    "numFI: %+02d, numFA: %+02d: ",
                    daoF.numFI, daoF.numFA
                );
                System.out.printf(
                    "obtenerNum: %+02d, ",
                    obtenerNum = obtenerNum()
                );
                System.out.printf(
                    "obtenerNum_Oscar: %+02d [%s], ",
                    obtenerNum_Oscar = obtenerNum_Oscar(),
                    obtenerNum == obtenerNum_Oscar ? " " : "X"
                );
                System.out.printf(
                    "sumarUnoAlNumeroMayor: %+02d [%s]",
                    sumarUnoAlNumeroMayor = sumarUnoAlNumeroMayor(),
                    obtenerNum == sumarUnoAlNumeroMayor ? " " : "X"
                );
                System.out.println();
            }
        }
    }
}
