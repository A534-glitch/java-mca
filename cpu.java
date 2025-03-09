public class CPU {

    double price;
    CPU(double price){
        this.price = price;

    }

    public void printInfo(){
        System.out.println("CPU price is: " + price);

    }

    class Processor {
        int core;
        String manufacturer;

        Processor(int core, String manufacturer) {
            this.core = core;
            this.manufacturer = manufacturer;
        }
        public void printInfo(){
            System.out.println("Cores:"+ core);
            System.out.println("Manufacturer:"+ manufacturer);

        }
        
        
    }

    public static class RAM{
        int memory;
        String manufacturer;

        RAM(int memory,String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
       public void printInfo(){
        System.out.println("RAM Memory:"+ memory + "GB");
        System.out.println("RAM Manufacturer:"+ manufacturer);
       }
        

    }
    public static void main(String[] args) {
        CPU cpu1 = new CPU(300);
        CPU.Processor processor1 =cpu1.new Processor(4,"Intel");
        CPU.RAM ram1= new CPU.RAM(8,"Corsa");
        cpu1.printInfo();
        processor1.printInfo();
        ram1.printInfo();
    }
}