
public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("актош", " дом");
        Dog dog = new Dog(" dog1", " овчарка", " лови мячик");
        Dog dog2 = new Dog(" сосиска", " питбуль", Color.BLACK, shelter);
        Dog dog3 = new Dog(" борсок", " хаски", Color.WHITE, shelter, "принеси мячик");

        System.out.println(dog.getinfo());
        System.out.println(dog2.getinfo());
        System.out.println(dog3.getinfo());
        dog.maceVoice("гаф", 1);
        dog2.maceVoice("af", 2);
        dog3.maceVoice("ayyyy", 3);

    }

 }
