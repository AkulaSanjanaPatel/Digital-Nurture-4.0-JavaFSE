public class Test {
    public static void main(String[] args) {
        Computer gamingPc = new Computer.Builder()
                .setCPU("Intel Core i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();
        gamingPc.display();   

        Computer officePc = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("8GB")
                .setStorage("1TB HDD")
                .build();
        officePc.display();
        
    }
}
