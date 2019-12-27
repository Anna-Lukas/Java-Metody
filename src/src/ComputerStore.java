package src;

public class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.proccessor = "Intel I5";
        comp1.memory = 8192;

        ComputerFactory factory = new ComputerFactory();
        Computer comp2 = factory.create("AMD Ryzen 1700", 16_384);

        System.out.println(comp1.proccessor + " "+ comp1.memory);
        System.out.println(comp2.proccessor + " "+ comp2.memory);

        comp1.printInfo();
        comp2.printInfo();

        System.out.println(comp1.getInfo());
        //lub
        String opisKompa  = comp2.getInfo();
        System.out.println(opisKompa);

        //zwiększanie pamięci:
        comp2.memory = comp2.memory+ 1024;
        System.out.println(comp2.memory);

        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.upgradeMemory(comp1, 1024);
        comp1.printInfo();
    }
}
