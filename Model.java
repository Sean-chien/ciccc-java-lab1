package Lab1;

public class Model {
    private static String modeling;

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;
    private static final String value = "modeling";


    public Model(String firstName,String lastName,int height, double weight, boolean canTravel, boolean smokes)
    {
        this.height = height;
        this.weight = weight;
        this.canTravel = canTravel;
        this.smokes = smokes;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeightDog() {
        return weight;
    }

    public void setWeightDog(double weight) {
        this.weight = weight;
    }

    public boolean isCanTravel() {
        return canTravel;
    }

    public boolean isSmokes() {
        return smokes;
    }

    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    public final void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }


}




