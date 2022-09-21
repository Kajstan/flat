public class Main {
    public static void main(String[] args) {
        Flat mieszkanie1=new Flat (2,"Wroclaw", true);
        System.out.println(mieszkanie1.getFloor());
        System.out.println(mieszkanie1.getCity());
        System.out.println(mieszkanie1.getBalcony());
        mieszkanie1.setBalcony(false);
        System.out.println(mieszkanie1.getBalcony());
        mieszkanie1.setCity("Poznan");
        System.out.println(mieszkanie1.getCity());
        Flat mieszaknie2 = new Flat(3,"Poznan",true);
        mieszaknie2.setFloor(3);
        System.out.println(mieszaknie2.getFloor());
    }
}