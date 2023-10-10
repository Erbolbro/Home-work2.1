public abstract class Pet {
    private int age;
    private Color color;
    private  Shelter shelter;
    private int generalDefaultAge(){
        age= 10;
        return  age;
    }

    public  final String getinfo(){
        return "age" + age + "color" +color.getColorCode() + " shelter" + shelter.getName();
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Shelter getShelter() {
        return shelter;
    }
}
