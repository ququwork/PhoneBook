package c4.PhoneBook2;

import java.io.*;

public abstract class phone implements Serializable {
	private int id;
	private String name;
	private long number;
	private String address;
	private int type;

	public int compareTo(phone e) {
		return getName().compareTo(e.getName());
	}

	public void settype(int i) {
		type = i;
	}

	public abstract int getType();

	public abstract String getphoneInfo();

	private static int nextId = 1;

	public static void setNextId(int id) {
		nextId = id;
	}

	public static int getNextId() {
		return nextId;
	}

	public static int autoNexId() {
		return nextId += 1;
	}

	public phone() {
        this("Unknown");
    }

    public phone(long num) {
        this(autoNexId(),"=null",num,"",1);
    }

    public phone(String n) {
        this(autoNexId(), n, 000, "NULLaddress",1);
    }

    public phone(String n, long num) {
        this(autoNexId(), n, num, "NULLaddress",1);
    }

    public phone(String n, long number, String address) {
        this(autoNexId(), n, number, address,1);
    }

    public phone(int i, String n, long number) {
        this(i, n, number, "NULLaddress",1);
    }

    public phone(int i, String n, long num, String ad,int k) {
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

	public abstract void output();


	public abstract void addpen();
	
	public static void main(String[] args) {
		
	}
	// public static phone get(int i) {
	// // TODO Auto-generated method stub
	// ArrayList<phone> k = new ArrayList<>();
	// for(int i= 0;i<phs.size)
	// k[i]= phs[i]
	// return phs[i];
	// }
}
