package InnerClasses;

public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);

//        Using PUBLIC Inner Class:
//        Gearbox.Gear first = mcLaren.new Gear(1,12.3);
//        System.out.println(first.driveSpeed(1000));

//        Using PRIVATE inner class and some more code:
//        Evitamos acceder a GEAR inner class, encapsulate it.

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

    }
}
