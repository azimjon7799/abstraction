package TaskB;

public class Cat extends Animal{
    private String voice;
    private String name;

    public Cat(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    @Override
    String sound(){
        return voice;
    }

    @Override
    String getName(){
        return name;
    }
}