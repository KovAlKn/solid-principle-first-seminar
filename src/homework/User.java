package homework;

public class User implements Saveable,Reportable{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void report() {
        System.out.println("Report user: " + name);
    }

    @Override
    public void save() {
        System.out.println("Save user: " + name);

    }
}
