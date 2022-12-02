public class Encapsulation {
    public static void main(String[] args) {
        enCap e= new enCap();
        e.setColor("blue");
        e.setId(25);
        e.setName("car");
        System.out.println(e.getName());
        System.out.println(e.getId());


    }
}

class enCap{
    private String name;
    private int id;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}