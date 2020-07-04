package SecondPackage;

public class leftEye extends  genaral {

    private String color;

    public leftEye(String name, String medicalCondition) {
        super(name, medicalCondition);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
