package c4.PhoneBook2;

import java.util.Scanner;

public class black extends phone {
    private int id;
    private String name;
    private long number;
    private String address;
    private int type =0;
    private String btype ="";
    public void settype(int i){
        type= i;
    }
    public int getType() {
        return 0;
    }
  
    public String getphoneInfo() {
		return "0," + getId() + "," + getName() + "," + getNumber() + "," + getAddress()+","+"������";
	}
    public black() {
        this("Unknown");
    }

    public black(long n) {
        this(autoNexId(),"null",n,"",0);
    }

    public black(String n) {
        this(autoNexId(), n, 000, "NULLaddress",0);
    }

    public black(String n, long num) {
        this(autoNexId(), n, num, "NULLaddress",0);
    }

    public black(String n, long number, String address) {
        this(autoNexId(), n, number, address,0);
    }

    public black(int i, String n, long number) {
        this(i, n, number, "NULLaddress",1);
    }

    public black(int i, String n, long num, String ad,int k) {
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
    	System.out.println("������������ͣ�1����� 2��թƭ 3��Ӫ�� ��");
    	Scanner in = new Scanner(System.in);
    	String b;
    	b=in.nextLine();
    	btype= b;
    	System.out.println("������Ϣ��ӳɹ���");
    	
    }


     public void output() {
        //System.out.println("��ϵ�����: " + id);
    	System.out.print("!!!==="+"�ں�������:");
        System.out.println("������ " + name);
        System.out.println("��ͥסַ�� " + address);
        System.out.println("�绰���룺 " + number);
        System.out.println("---���������ͣ� " + btype);
        
    }

}
