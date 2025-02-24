public class Dog {
    public static int numOfAnimals = 0;
    public static final int MAX_GOODBOY = 1000;
    private static int dogCount =0;
    String name;
    int age;
    int GOODBOY;

    public static int getDogCount() {
        return dogCount;
    }

    public void bark(){
        System.out.println("WOOF!");
    }

    public Dog (){
        numOfAnimals++;
        dogCount++;
        GOODBOY = MAX_GOODBOY;
        System.out.println("A New Dog created. Total Dogs now: " + numOfAnimals);
    }
    public static int getCatCount(){

        return dogCount;
    }
}