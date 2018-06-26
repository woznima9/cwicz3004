package builder;

public class FormApp {


    public static void main(String[] args) {

        //  Moto moto = MotoBuilder.builder().formName("Pierwszy").build();

        //  System.out.println(moto.toString());

        //     Bicycle bicycle = Turistic.builder().laod(55).build();
//        System.out.println(bicycle.toString());
//        bicycle.setType(typRoweru);
//        System.out.println(bicycle.toString());
 //       Bicycle bicycle1 = new Turistic("Szosowy", 52, "red", 1200.34, "Marek", 42, 150.33);

//        System.out.println(bicycle1.toString());
//        System.out.println(bicycle1.getOwnerName());
//        System.out.println(((Turistic) bicycle1).getLaod());



        Bicycle bicycle = Turistic.builder().color("Czerwony").ownerName("Krzychu").load(130).build();

        System.out.println(bicycle.toString());
        System.out.println(bicycle.getOwnerName());
        System.out.println(((Turistic) bicycle).getLaod());

    }

}
