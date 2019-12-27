public class Computer {
    String proccessor;
    int memory;

    Computer (String proc){
        proccessor = proc;

        System.out.println("Tworzę nowy komputer");
    }

    void printInfo(){

        System.out.println(proccessor + " " + memory);
    }


}
