package prog.prak;
/*
mixing content of 2 arrays into a third with size of both
 */
public class ArrayInterleave {

    public static int[] interleave(int[] a, int[] b) {
        int[] erg = new int[a.length + b.length];
        int i = 0;
        int minlen = 0;

        if (a.length > b.length) {
            minlen = b.length;
        } else {
            minlen = a.length;
        }

        for (i = 0; i < minlen; i++) {
            erg[2 * i + 0] = a[i];
            erg[2 * i + 1] = b[i];
        }

        if (minlen == a.length) {
            for (i = 0; i < erg.length - 2*minlen; i++) {
                erg[2*minlen+i] = b[minlen+i];
            }
        }else{
            for (i = 0; i < erg.length - 2*minlen; i++) {
                erg[2*minlen + i] = a[minlen+i];
            }
        }

        return erg;
    }
}
