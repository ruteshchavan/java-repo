//

class Student{
    private int roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll=roll;    // The this keyword is used to refer to the current object.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
        Student x= new Student();
        x.setRoll(30);
        x.setName("Rutesh Chavan");

        System.out.println("Roll : " +x.getRoll());
        System.out.print("Name : " +x.getName());

    }
}