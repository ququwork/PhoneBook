package c4.PhoneBook2;

import java.util.*;

public class phonetest {

    private phonemanage em = new phonemanage();

	public void dodail(){
		System.out.println("请输入你要拨打的电话：");
		Scanner in = new Scanner(System.in);
		long k;
		k=in.nextLong();
		em.dail(k);	
	}
	
	public void doblack(){
		
		System.out.println("请输入号码加入黑名单:");
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
        System.out.println("输入姓名，电话，地址：");
       
        n = in.nextLine();
        num = in.nextLong();
        add = in.next();
        System.out.println("输入联系人类型：1、朋友 2、同学 3、家人");
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
        System.out.println("输入姓名:");
        Scanner in = new Scanner(System.in);
        n = in.next();
        em.removePhone(n);

    }

    public void doFindPhone() {
        String n;
        System.out.println("输入姓名:");
        Scanner in = new Scanner(System.in);
        n = in.next();
        em.findphone(n);
     
    }
    public void doDisplayPhone() {
		em.displayPhones();
    }
    public void doappen() {
    	System.out.println("输入要添加附加信息的联系人姓名：");
    	Scanner in = new Scanner(System.in);
    	String n= in.nextLine();
    	em.addpen(n);
    }

    

	public static void main(String[] args) {
		System.out.println("=====欢迎进入电话本管理系统！======");
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
				System.out.println("!非法输入");
				break;
			}
		}
		et.em.saveData("Phone11.dat");
		System.out.println("再见!");
	}

	public String menu() {
		String choice;
		System.out.println("| 	0、 退出系统		|");
		System.out.println("|	1、 添加联系人		|");
		System.out.println("| 	2、 移除联系人		|");
		System.out.println("| 	3、 查找联系人		|");
		System.out.println("| 	4、 查看所有联系人		|");
		System.out.println("| 	5、 拨打电话		|");
		System.out.println("| 	6、 设置黑名单		|");
		System.out.println("| 	7、 添加联系人附加信息	|");
		System.out.println("=请选择功能:				");
		Scanner in = new Scanner(System.in);
		choice = in.nextLine();	
		return choice;
	}

}
