public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder a= new StringBuilder("Null");
        System.out.println(a);

        //chaAt
        System.out.println(a.charAt(0));

        //setCharAt
        a.setCharAt(0,'P');
        System.out.println(a);

        //insert
        a.insert(4,"y");
        System.out.println(a);

        //delete
        a.delete(4,5);
        System.out.println(a);

        //append
        a.append("e");
        a.append("r");
        System.out.println(a);
    }
}
