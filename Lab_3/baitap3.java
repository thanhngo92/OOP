public class baitap3
{
    public static void main(String[] args)
    {
        Student st = new Student(24, "Chien", "Khai");
        System.out.println(st);
        st.setID(31);
        System.out.println(st);
        st.setLastName("Li");
        System.out.println(st.getLastName());
        System.out.println(st);
    }
}