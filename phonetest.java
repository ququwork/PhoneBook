package c4.PhoneBook2;

import java.util.*;

public class phonetest {

    private phonemanage em = new phonemanage();

	public void dodail(){
		System.out.println("��������Ҫ����ĵ绰��");
		Scanner in = new Scanner(System.in);
		long k;
		k=in.nextLong();
		em.dail(k);	
	}
	
	public void doblack(){
		
		System.out.println("�����������������:");
		Scanner in = new Scanner(System.in);
		long k;
		k=in.nextLong();
		em.dblack(k);	
	}
	/////////========================addphone
    public void doAddPhone() {
        String n;
        long num;
        String add;
        Scanner in = new Scanner(System.in);
        System.out.println("�����������绰����ַ��");
       
        n = in.nextLine();
        num = in.nextLong();
        add = in.next();
        System.out.println("������ϵ�����ͣ�1������ 2��ͬѧ 3������");
        int k=in.nextInt();
        if(k==1) {
        	 white e1 = new white(n, num, add,k);
        em.addPhone(e1);
        }
        else if(k==2) {
        	classmate e2 = new classmate(n,num,add,k);
        	em.addPhone(e2);
        }else if(k==3){
        	famliy e3 = new famliy(n,num,add,k);
        	em.addPhone(e3);
        }
       
    }

    public void doRemovePhone() {
        String n;
        System.out.println("��������:");
        Scanner in = new Scanner(System.in);
        n = in.next();
        em.removePhone(n);

    }

    public void doFindPhone() {
        String n;
        System.out.println("��������:");
        Scanner in = new Scanner(System.in);
        n = in.next();
        em.findphone(n);
     
    }
    public void doDisplayPhone() {
		em.displayPhones();
    }
    public void doappen() {
    	System.out.println("����Ҫ��Ӹ�����Ϣ����ϵ��������");
    	Scanner in = new Scanner(System.in);
    	String n= in.nextLine();
    	em.addpen(n);
    }

    

	public static void main(String[] args) {
		System.out.println("=====��ӭ����绰������ϵͳ��======");
		String choice;
		phonetest et = new phonetest();
		et.em.loadData("Phone11.dat");//
		while (true) {
			choice = et.menu();
			if (choice.equals("0"))
				break;
			switch (choice) {
			case "1":
				et.doAddPhone();
				break;
			case "2":
				et.doRemovePhone();
				break;
			case "3":
				et.doFindPhone();
				break;
			case "4":
				et.doDisplayPhone();
				break;
			case "5":
				et.dodail();
				break;
			case "6":
				et.doblack();
				break;
			case "7":
				et.doappen();
			default:
				System.out.println("!�Ƿ�����");
				break;
			}
		}
		et.em.saveData("Phone11.dat");
		System.out.println("�ټ�!");
	}

	public String menu() {
		String choice;
		System.out.println("| 	0�� �˳�ϵͳ		|");
		System.out.println("|	1�� �����ϵ��		|");
		System.out.println("| 	2�� �Ƴ���ϵ��		|");
		System.out.println("| 	3�� ������ϵ��		|");
		System.out.println("| 	4�� �鿴������ϵ��		|");
		System.out.println("| 	5�� ����绰		|");
		System.out.println("| 	6�� ���ú�����		|");
		System.out.println("| 	7�� �����ϵ�˸�����Ϣ	|");
		System.out.println("=��ѡ����:				");
		Scanner in = new Scanner(System.in);
		choice = in.nextLine();	
		return choice;
	}

}
