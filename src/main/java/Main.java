public class Main
{
    public static void main(String[] args) {
        Theatre tehatre = new Theatre("Olympian", 9, 12);
        tehatre.getSeats();
        if (tehatre.reserveSeat("H11")){
            System.out.println("please pay");
        } else {
            System.out.println("Sorry, east is taken");
        }
        if (tehatre.reserveSeat("H11")){
            System.out.println("please pay");
        } else {
            System.out.println("Sorry, east is taken");
        }

    }
}
