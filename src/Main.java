public class Main {
    public static void main(String[] args) {
        Flat mieszkanie1=new Flat (2,"Wroclaw", true);
        System.out.println(mieszkanie1.getFloor());
        System.out.println(mieszkanie1.getCity());
        mieszkanie1.setBalcony(false);
        System.out.println(mieszkanie1.getBalcony());
    }
}