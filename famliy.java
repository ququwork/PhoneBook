package c4.PhoneBook2;

import java.util.Scanner;

public class famliy extends phone {
    private int id;
    private String name;
    private long number;
    private String address;
    private String rel="";
    private int type =3;
    public void settype(int i){
        type= i;
    }
    public int getType() {
        return 3;
    }
  
    public String getphoneInfo() {
		return "0," + getId() + "," + getName() + "," + getNumber() + "," + getAddress()+","+"黑名单";
	}
    public famliy() {
        this("Unknown");
    }

    public famliy(long n) {
        this(autoNexId(),"null",n,"",3);
    }

    public famliy(String n) {
        this(autoNexId(), n, 000, "NULLaddress",3);
    }

    public famliy(String n, long num) {
        this(autoNexId(), n, num, "NULLaddress",3);
    }

    public famliy(String n, long number, String address,int k) {
        this(autoNexId(), n, number, address,3);
    }

    public famliy(int i, String n, long number) {
        this(i, n, number, "NULLaddress",3);
    }

    public famliy(int i, String n, long num, String ad,int k) {
        id = i;
        name = n;
        number = num;
        address = ad;
    	type= k;
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
    	System.out.println("输入家人关系");
    	String s;
    	Scanner in =new Scanner(System.in);
    	s=in.nextLine();
    	
    	rel=s; 
    }


     public void output() {
        //System.out.println("联系人序号: " + id);
    	System.out.print("==分组：家人==");
        System.out.println("姓名： " + name);
        System.out.println("家庭住址： " + address);
        System.out.println("电话号码： " + number);
        System.out.println("电话号码： " + number);
        System.out.println("---家人关系： " + rel);
        
    }

}
