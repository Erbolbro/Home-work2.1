public final class Dog extends  Pet {
    private  String name;
    private String bread;
    private String commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public Dog(String name, String bread, String commands) {
        this.name = name;
        this.bread = bread;
        this.commands = commands;
    }public Dog(String name, String bread,Color color, Shelter shelter ) {
        this.name = name;
        this.bread = bread;
    }public Dog(String name, String bread,Color color, Shelter shelter,String commands ) {
        this.name = name;
        this.bread = bread;
        this.commands = commands;
    }
    public void maceVoice(String voice,int number){
        System.out.println(voice);
    }
//    public String getinfo(){
//        return "color" + getColor()+ "name" + getName() + "shelter" + getShelter() + "bread" + getBread() + "commands" + getCommands();
//    }
}
