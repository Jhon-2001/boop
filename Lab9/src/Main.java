public class Main {
    public static void main(String[] args) {
        CalendarLucru calendar = new CalendarLucru();
        Lucrator gigel = new Lucrator("Gigel", calendar);

        try {
            gigel.lucreaza("Luni");
            gigel.lucreaza("Marte");
            gigel.lucreaza("Duminica");
        } catch (ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }
    }
}