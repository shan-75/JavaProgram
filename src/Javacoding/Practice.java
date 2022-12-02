package Javacoding;

public class Practice {
    public static void main(String[] args) {
        Bus b1= new Bus();
        b1.setModel("Audi");
        b1.setYear(1995);

        System.out.println(b1.getModel());
        System.out.println(b1.getYear());


    }
}

class Bus{
    private String model;
    private int year;

    public String getModel() {
        return model;
    }
//need parameter in set
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
