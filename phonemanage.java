package c4.PhoneBook2;

import java.io.*;

import java.util.Collections;
import java.util.Scanner;


import java.util.ArrayList;
public class phonemanage {
	private ArrayList<phone> phs;
	//private static int MAX_SIZE;
//	private int size = 0;

	public phonemanage() {
		phs = new ArrayList<>();
	}

	public void dail(long k) {
		int index = findByP(k);
		System.out.println("3eee");
		if ((index > 0)) {
			if (phs.get(index).getType() == 0)
				System.out.println("��ֹ���򣡴˺��봦�ں������С�");
		} else if (index == -1) {
			System.out.println("�����ڴ˺��롣");
		} else {
			System.out.println("����ɹ�");
			return;
		}

	}

	public void addpen(String n) {
		// TODO Auto-generated method stub
		int k= findByName(n);
		phs.get(k).addpen();
	}
	
	public void dblack(long k) {
		int index = findByP(k);
		if ((index != -1) && (phs.get(index).getType() == 1||phs.get(index).getType() == 2||phs.get(index).getType() == 3)) {

			String n = phs.get(index).getName();
			long num = phs.get(index).getNumber();
			String add = phs.get(index).getAddress();
			black e1 = new black(n, num, add);

			removePhone(phs.get(index).getName());
			addPhone(e1);
			System.out.println("��Ӻ������ɹ���");
			
		} else if (index == -1) {
			String n = "";
			long num = k;
			String add = "NULL";
			black e1 = new black(n, num, add);
			addPhone(e1);
			System.out.println("�������������,�ѽ�����벢�����������");
			return;

		} else {
			System.out.println("�˺����Ѵ��ں������У�");
		}

	}

	public void displayPhones() {
		System.out.println("�ܹ���ͨѶ¼��ϵ��Ϊ��" + phs.size());
		for (int i = 0; i < phs.size(); ++i) {
			phs.get(i).output();
		}
		System.out.println();
	}

//	public void addPhone(phone e) {
//
//		if (findByName2(e.getName()) !=null) {
//			System.out.println("��ϵ���Ѿ����ڡ�");
//			return;
//		}
//		phs.add(e);
//
//	}
	public void addPhone(phone e) {

		if (findByName(e.getName()) !=-1) {
			System.out.println("��ϵ���Ѿ����ڡ�");
			return;
		}
		phs.add(e);

	}


	public void removePhone(String n) {
		int index = findByName(n);
		if (index < 0) {
			System.out.println("��ϵ�˲����ڡ�");
			return;
		}
		phs.remove(index);
	}

	public int findByP(long n) {// �绰����
		for (int i = 0; i < phs.size(); ++i) {
			if (phs.get(i).getNumber() == n) {
				return i;
			}
		}
		System.out.println("û�д˺��롣");
		return -1;
	}
	


	
	public phone findByP2(long n) {// �绰����
		for (int i = 0; i < phs.size(); ++i) {
			if (phs.get(i).getNumber() == n) {
				return phs.get(i);
			}
		}
		System.out.println("û�д˺��롣");
		return null;
	}

	public int findByName(String n) {// ��������
		int i = 0;
		for (i = 0; i < phs.size(); ++i) {
			if (phs.get(i).getName().equals(n)) {
				return i;
			}
		}
		return -1;
	}

	public phone findByName2(String n) {// ��������
		int i = 0;
		for (i = 0; i < phs.size(); ++i) {
			if (phs.get(i).getName().equals(n)) {
				return phs.get(i);
			}
		}
		return null;
	}

	public void findphone(String n) {
		// ���������˵绰
		int i = findByName(n);
		if (i < 0) {
			System.out.println("�����ڣ�");

		} else {
			phs.get(i).output();
		}

	}

	public void findphone2(String n) {
		// ���������˵绰
		if (findByName2(n) == null) {
			System.out.println("�����ڣ�");

		} else {
			findByName2(n).output();
		}

	}

	public void saveData(String filename) {
		try {

			 ObjectOutputStream out = new ObjectOutputStream(new
			 FileOutputStream(filename));
			
			 out.writeInt(phone.getNextId());
			 out.writeObject(phs);
			 out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void loadData(String filename) {
		try {
			 File file = new File(filename);
			 if (!file.exists()) {
			 return;
			 }
			 ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
			 phone.setNextId(in.readInt());
			 phs = (ArrayList<phone>) in.readObject();
			 in.close();
		//	 MAX_SIZE=phs.length;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();

		} 
	}
	
//    public void saveData(String filename) {
//        try {
//            PrintWriter out = new PrintWriter(filename);
//            out.println(phs.size());
//            out.println(phone.getNextId()); // �洢���� id
//            for (int i = 0; i < phs.size(); ++i) {
//                out.println(phs.get(i).getphoneInfo());
//            }
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
	
	
	
//    public void loadData(String filename) {
//        File file = new File(filename);
//        if (file.exists() == false)
//            return;
//        try {
//            Scanner in = new Scanner(file);
//            int num = in.nextInt(); // �ȶ�ȡ����
//            int nextId = in.nextInt(); // ��ȡ�Զ����
//            in.nextLine();
//            int type, id;
//            String name;
//            String address;
//            long number;
//
//            for (int i = 0; i < num; ++i) {
//                String line = in.nextLine();
//                String tokens[] = line.split(",");
//                type = Integer.parseInt(tokens[0]);
//                id = Integer.parseInt(tokens[1]);
//                name = tokens[2];
//                if (type == 0) {
//                    number = Long.parseLong(tokens[3]);
//                    address = tokens[4];
//                    addPhone(new black(id, name, number, address));
//                } else {
//                    number = Long.parseLong(tokens[3]);
//                    address = tokens[4];
//                    addPhone(new white(id, name, number, address));
//                }
//            }
//            in.close();
//            phone.setNextId(nextId); // �ָ����
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

	public static void main(String[] args) {
		// phonemanage pm = new phonemanage(100);
		// pm.addPhone(new phone("qnx", 34324342323233l, "����"));
		// pm.addPhone(new phone("wjk", 2343242332l));
		// pm.displayPhones();
		// String n;
		// System.out.println("��������:");
		// Scanner in = new Scanner(System.in);
		// n = in.next();
		// pm.findphone(n);
		phonemanage em=new phonemanage();
		em.addPhone(new white("zhang",6000,"500",1));
		
		em.addPhone(new black("wang",30,"180"));
		em.displayPhones();

	}



}
