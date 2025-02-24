public class Cat {
    public static int numOfAnimals = 0;
    public static final int MAX_LIVES = 9;
    private static int catCount =0;
    String name;
    int age;
    int livesRemaining;

    public void meow(){
        System.out.println("Meow");
    }

    public Cat (){
        numOfAnimals++;
        catCount++;
        livesRemaining = MAX_LIVES;
        System.out.println("New Cat created. Total Cats now: " + numOfAnimals);
    }
    public static int getCatCount(){

        return catCount;
    }
}