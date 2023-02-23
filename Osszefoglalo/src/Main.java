public class Main {
    public static void main(String[] args)
    {
        feladatok();
    }

    static void feladatok()
    {
        feladat1();
        feladat2();
        feladat3();
        feladat4();
    }

    static void feladat1()
    {
        int osszeg = elso10SzamOsszege();
        kiir(String.format("Az első 10 szám összege: %d\n", osszeg));
    }

    static void feladat2()
    {
        int a = 3;
        int b = 4;
        int osszeg = osszead(a, b);
        kiir(String.format("%d + %d = %d\n", a, b, osszeg));
    }

    static void feladat3()
    {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int osszeg = osszead(osszead(1, 2), osszead(3, 4));
        kiir(String.format("%d + %d + %d + %d = %d\n", a, b, c, d, osszeg));
    }

    static void feladat4()
    {
        int a = 3;
        int b = 4;
        int c = 2;
        int osszeg = osszead(3, osszead(4, 2));
        double gyok = Math.sqrt(osszeg);
        kiir(String.format("%d + %d + %d gyöke: %f\n", a, b, c, gyok));
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
        System.out.print(szoveg);
    }
}