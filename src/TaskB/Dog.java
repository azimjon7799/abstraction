package TaskB;

public class Dog extends Animal{
    private String voice;
    private String name;
    
    public Dog(String voice, String name){
        this.voice = voice;
        this.name = name;
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
