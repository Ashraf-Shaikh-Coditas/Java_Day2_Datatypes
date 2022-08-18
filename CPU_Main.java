package Week1.Day2;

class CPU {
    double price;

    // nested class
    class Processor {
        // members of nested class
        double cores;
        String manufacturer;

        double getCache() {
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM {
        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}

public class CPU_Main {
    public static void main(String[] args) {
        CPU cpu_obj = new CPU();
        cpu_obj.price = 1000;

        System.out.println("Price of CPU is : "+cpu_obj.price);

        CPU.Processor processor_obj = cpu_obj.new Processor();
        processor_obj.cores = 4.4;
        processor_obj.manufacturer = "Intel";

        System.out.println("No. of cores in Processor is :: "+processor_obj.cores);
        System.out.println("Manufacturer of Processor is :: "+processor_obj.manufacturer);
        System.out.println("getCache() from Processor Class :: "+processor_obj.getCache());

        CPU.RAM ram_obj = cpu_obj.new RAM();
        ram_obj.manufacturer = "ASUS";
        ram_obj.memory = 100;

        System.out.println("Manufacturer of RAM is :: "+ram_obj.manufacturer);
        System.out.println("RAM has memory of GB :: "+ram_obj.memory);
        System.out.println("getClockSpeed() from RAM Class :: "+ram_obj.getClockSpeed());


    }
}

/* OUTPUT

Price of CPU is : 1000.0

No. of cores in Processor is :: 4.4
Manufacturer of Processor is :: Intel
getCache() from Processor Class :: 4.3

Manufacturer of RAM is :: ASUS
RAM has memory of GB :: 100.0
getClockSpeed() from RAM Class :: 5.5

* */