package lesson3;

public class HomeWork2 {
    public static void main(String[] args) {
        String firstname = "Kirill";
        String surname = "Korniltsev";
        int age = 18;
        char space = '\n';
        String max = firstname + space + surname + space + age;
        System.out.println(max);
        String a = "Вход запрещен сегодня";
        System.out.println(a.replace("запрещен", "разрешен"));
        double pi = 3.14159;
        double b = 2;
        double circumference = b * pi;
        System.out.println("Circumference = " + circumference);

    }

    public static double circumference(double pi, double b) {
        int R = 5;
        double r = b * pi * R;
        return r;
    }
}
