
public class TestEmployee {
    public static void main(String[] args) {
        Manager mg1 = new Manager(10000,0001,"Alex",9.46);   
        mg1.setEmpId("M041");
        System.out.println(mg1.toString());
        
        HourlyWork hw1 = new HourlyWork(6,00002,"Pim",8.12);
        System.out.println(hw1.toString());
        HourlyWork hw2 = new HourlyWork(3,00002,"Pimmy",6.0);
        System.out.println(hw2.toString());
        System.out.println(hw1.equals(hw2));
    }
}
