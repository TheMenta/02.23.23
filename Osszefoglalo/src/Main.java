public class Main {
    public static void main(String[] args)
    {
        kiir(String.format("Az első 10 szám összege: %d", elso10SzamOsszege()));
        kiir(String.format("%d + %d = %d", 3, 4, osszead(3, 4)));
        kiir(String.format("%d + %d + %d + %d = %d\n", 1, 2, 3, 4, osszead(osszead(1, 2), osszead(3, 4))));
        kiir(String.format("%d + %d + %d gyöke: %f\n", 3, 4, 2,
    }

    static int elso10SzamOsszege()
    {
        int osszeg = 0;
        for (int i = 0; i < 10; i++)
        {
            osszeg += i;
        }
        return osszeg;
    }

    static int osszead(int a, int b)
    {
        return a + b;
    }

    static void kiir(String szoveg)
    {
        System.out.println(szoveg);
    }
}