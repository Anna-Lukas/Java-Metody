public class Computer {
    String proccessor;
    int memory;

    void printInfo(){
        System.out.println("Procesor: " + proccessor + ", " + "pamieć: "+ memory );
    }
    String getInfo(){
        return proccessor +" " +  memory;
    }

}
