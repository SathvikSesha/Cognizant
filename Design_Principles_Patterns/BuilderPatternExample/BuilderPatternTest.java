package Design_Principles_Patterns.BuilderPatternExample;

public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer gamingPc = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam(32)
                .setStorage(1024)
                .setGpu("RTX 4090")
                .build();

        Computer officePc = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam(16)
                .setStorage(512)
                .build();

        System.out.println(gamingPc);
        System.out.println(officePc);
    }

}
