package geekbrains.lesson_1;

public class car {
    public void start(){System.out.println("Поехали!");}
    public void stop(){System.out.println("рокатились с ветерком");}
    public int drive(int howlong){
        int distance = howlong*60;
        return distance;
    }
}
