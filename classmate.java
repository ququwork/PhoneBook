package c4.PhoneBook2;

import java.util.Scanner;

public class classmate extends phone {
    private int id;
    private String name;
    private long number;
    private String address;
    private int type =2;
    private String school;
    private String classm;
    public void settype(int i){
        type= i;
    }
    public int getType() {
        return 2;
    }

    public String getphoneInfo() {
		return "0," + getId() + "," + getName() + "," + getNumber() + "," + getAddress()+","+"黑名单";
	}
    ////////=========================
    public classmate(String n, long number, String address) {
        this(autoNexId(), n, number, address,2);
    }
    public classmate() {
        this("Unknown");
    }

    public classmate(long n) {
        this(autoNexId(), "NULLname", n, "NULLAddress",2);
    }

    public classmate(String n) {
        this(autoNexId(), n, 000, "NULLaddress",2);
    }

    public classmate(String n, long num) {
        this(autoNexId(), n, num, "NULLaddress",2);
    }

    

    public classmate(int i, String n, long number) {
        this(i, n, number, "NULLaddress",2);
    }
    public classmate(String n, long number, String address,int k) {
        this(autoNexId(), n, number, address,k);
    }
   /////////////==================================
    public classmate(int i, String n, long num, String ad,int k) {
        id = i;
        name = n;
        number = num;
        address = ad;
        type =k;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public void setNumber(int n) {
        number = n;
    }

    public void setAddress(String ad) {
        address = ad;
    }
    
    public void addpen() {
    	System.out.println("输入同学学校，班级");
    	String s,cl;
    	Scanner in =new Scanner(System.in);
    	s=in.nextLine();
    	cl= in.nextLine();
    	school=s; classm = cl;
    }

     public void output() {
        //System.out.println("联系人序号: " + id);
    	System.out.print("==分组：同学==");
        System.out.println("姓名： " + name);
        System.out.println("家庭住址： " + address);
        System.out.println("电话号码： " + number);
        System.out.println("---学校：  " + school+" 班级： "+classm);
        
    }

}
