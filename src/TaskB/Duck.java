package TaskB;

public class Duck extends Animal{
    private String voice;
    private String name;

    public Duck(String voice, String name){
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