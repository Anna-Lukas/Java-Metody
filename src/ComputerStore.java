public class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Intel I 5");
        comp1.memory = 8192;
        comp1.printInfo();
      /*  comp1.proccessor = "Intel I5";
        comp1.memory = 8192;*/

        Computer comp2 = new Computer("zzzzz" );
        comp2.printInfo();

    }
}
