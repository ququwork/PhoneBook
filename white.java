package c4.PhoneBook2;

import java.util.Scanner;

public class white extends phone {
    private int id;
    private String name;
    private long number;
    private String address,bei="";
    private int type=1 ;
    public void settype(int i){
        type= i;
    }
    public int getType() {
        return 1;
    }
    public String getphoneInfo() {
		return "1," + getId() + "," + getName() + "," + getNumber() + "," + getAddress();
	}

    public white() {
        this("Unknown");
    }

    public white(long n) {
        this(autoNexId(),"null",n,"",1);
    }

    public white(String n) {
        this(autoNexId(), n, 000, "NULLaddress",1);
    }

    public white(String n, long num) {
        this(autoNexId(), n, num, "NULLaddress",1);
    }

    public white(String n, long number, String address,int k) {
        this(autoNexId(), n, number, address,k);
    }

    public white(int i, String n, long number,int k) {
        this(i, n, number, "NULLaddress",k);
    }

    public white(int i, String n, long num, String ad,int k) {
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
    	System.out.println("���ѱ�ע");
    	String s;
    	Scanner in =new Scanner(System.in);
    	s=in.nextLine();
    	
    	bei=s; 
    }
    
    public void output() {
     
       // System.out.println("��ϵ�����: " + id);
        System.out.print("===����: ����==");
        System.out.println("������ " + name);
        System.out.println("��ͥסַ�� " + address);
        System.out.println("�绰���룺 " + number);
        System.out.println("---���ѱ�ע�� " + bei);
        
    }

}
