import java.util.Scanner;

public class getDataFromKeyboard {
    private String name;
    private int age;
    private String province;

    public getDataFromKeyboard(){};
    public getDataFromKeyboard(String name, int age, String province) {
        this.name = name;
        this.age = age;
        this.province = province;
    };

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    public String getProvince() {
        return province;
    }

    public void displayStudentInfo() {
        System.out.println("Your full information:" + name + "," + age + "," + province);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your full name?");
        String name = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Where do you come from?");
        String province = sc.nextLine();
        getDataFromKeyboard obj = new getDataFromKeyboard(name,age,province);
        obj.displayStudentInfo();
    }
}