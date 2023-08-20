import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class cafe_management 
{
	public static int num_of_items=0;
	public static String admin_pass="admin";
	public static String staff_pass="staff";
	public static String[] menu=new String[100];
	static int[] pricing=new int[100];
	static int menu_num=0;
	public static String[] order=new String[100];
	public static int[] amount=new int[100];
	public static int or=0;
	public static int total=0;
	public static String store_name="Cafe O Latte";
	public static String admin_name="Parthib Pandit";
	public static String store_phno="9876543210";
	public static String store_time="10 am - 7 pm";
	public static String address="Bagdogra";
	public static String[] staff=new String[50];
	public static String[] phone=new String[50];
	public static String[] working_shift=new String[50];
	public static int[] payroll=new int[50];
	public static int staff_num=0;
	
	
	public static void initialiser()
	{
		int i=1;
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\menu items.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				menu[i]=str;
				i++;
			}
			menu_num=i-1;
		}catch (IOException e) {
			e.printStackTrace();	
		}
		
		i=1;
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\menu pricing.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				pricing[i]=Integer.valueOf(str);
				i++;
			}
		}catch (IOException e) {
			e.printStackTrace();	
		}
		
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\storename.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				store_name=str;
				
			}
		}catch (IOException e) {
			e.printStackTrace();	
		}
		
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\adminname.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				admin_name=str;
				
			}
		}catch (IOException e) {
			e.printStackTrace();	
		}
		
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\store phno.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				store_phno=str;
				
			}
		}catch (IOException e) {
			e.printStackTrace();	
		}
		
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\storetime.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				store_time=str;
				
			}
		}catch (IOException e) {
			e.printStackTrace();	
		}
		
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\storeaddress.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				address=str;
				
			}
		}catch (IOException e) {
			e.printStackTrace();	
		}
		
		i=1;
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\staffnames.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				staff[i]=str;
				i++;
			}
			staff_num=i-1;
		}catch (IOException e) {
			e.printStackTrace();	
		}
		
		i=1;
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\staffphone.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				phone[i]=str;
				i++;
			}
			
		}catch (IOException e) {
			e.printStackTrace();	
		}
		
		i=1;
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\staffworkshift.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				working_shift[i]=str;
				i++;
			}
			
		}catch (IOException e) {
			e.printStackTrace();	
		}
		
		i=1;
		try
		{
			File fl=new File("C:\\Users\\pandi\\Desktop\\staffpayroll.txt");
			BufferedReader br= new BufferedReader(new FileReader(fl));
			String str;
			while((str=br.readLine())!=null)
			{
				payroll[i]=Integer.valueOf(str);
				i++;
			}
		
		}catch (IOException e) {
			e.printStackTrace();	
		}
	}
	
	static void admin()
	{
		Scanner in=new Scanner(System.in);
		char chr;
		
		System.out.println("Welcome Admin!!!");
		do {
		System.out.println("=================================================");
		System.out.println("Enter your course of action");
		System.out.println("1. Customize Store Information");
		System.out.println("2. Customize Menu Information");
		System.out.println("3. Customize Staff Information");
		System.out.println("Enter your choice");
		int choice=in.nextInt();
		switch(choice)
		{
		case 1:
			store_info();
			break;
		case 2:
			menu_info();
			break;
		case 3:
			staff_info();
			break;
		default:
			System.out.println("Wrong Choice");
		}
		System.out.println("Do you want to exit as admin?(Y/N)");
		chr=in.next().charAt(0);
		}while(chr=='N'||chr=='n');
		System.out.println("=================================================");
	}
	static void staff()
	{
		Scanner in=new Scanner(System.in);
		char chr;
		do {
		System.out.println("-------------------------------------------------");
		System.out.println("Welcome Staff");
		System.out.println("Enter your course of action");
		System.out.println("1. View Menu");
		System.out.println("2. Take Order");
		System.out.println("Enter your choice");
		int choice=in.nextInt();
		switch(choice)
		{
		case 1:
			view_menu();
			break;
		case 2:
			take_order();
			break;
		default:
			System.out.println("Wrong Choice");
		}
		System.out.println("Do you want to exit as staff(Y/N)?");
		chr=in.next().charAt(0);
		}while(chr=='N'||chr=='n');
		System.out.println("-------------------------------------------------");
	}
	static void store_info()
	{
		Scanner in=new Scanner(System.in);
		char chr;
		do {
			
		
		System.out.println("Enter 1 to update store information");
		System.out.println("Enter 2 to view store information");
		int ch=in.nextInt();
		in.nextLine();
		switch(ch)
		{
		case 1:
			update_store();
			break;
		case 2:
			view_store();
			break;
		default:
			System.out.println("Wrong choice");
		}
		System.out.println("Do you want to do more actions about the store?(Y/N)");
		chr=in.next().charAt(0);
		}while(chr=='Y'||chr=='y');
		
	}
	static void update_store()
	{
		Scanner in=new Scanner(System.in);
		char chr;
		do {
		System.out.println("-------------------------------------------------");
		System.out.println("You are now in editing store information mode....");
		System.out.println("1. Enter 1 to update store name");
		System.out.println("2. Enter 2 to update admin name");
		System.out.println("3. Enter 3 to update store phone number");
		System.out.println("4. Enter 4 to update store opening time");
		System.out.println("5. Enter 5 to update store address");
		int ch=in.nextInt();
		in.nextLine();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the new store name");
			store_name=in.nextLine();
			System.out.println("Thank You. The store name has been successfully updated");
			break;
		case 2:
			System.out.println("Enter the new admin name");
			admin_name=in.nextLine();
			System.out.println("Thank You. The admin's name has been successfully updated");
			break;
		case 3:
			System.out.println("Enter the new store phone number");
			store_phno=in.nextLine();
			System.out.println("Thank You. The store phone number has been successfully updated");
			break;
		case 4:
			System.out.println("Enter the new store time");
			store_time=in.nextLine();
			System.out.println("Thank You. The store opening time has been successfully updated");
			break;
		case 5:
			System.out.println("Enter the new store address");
			address=in.nextLine();
			System.out.println("Thank You. The store address has been successfully updated");
			break;
		default:
			System.out.println("Sorry your request cannot be served as there is no such option.");
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Do you want to update further information?(Y/N)");
		chr=in.next().charAt(0);
		}while(chr=='Y'||chr=='y');
	}
	static void view_store()
	{
		System.out.println("Here is the Information about the store");
		System.out.println("==========================================");
		System.out.println("\t\t"+store_name);
		System.out.println("Admin:-"+admin_name);
		System.out.println("Contact Number:-"+store_phno);
		System.out.println("Timings:-"+store_time);
		System.out.println("Address:-"+address);
		System.out.println("==========================================");
	}
	public static void menu_info()
	{
		Scanner in=new Scanner(System.in);
		char chr;
		System.out.println("-------------------------------------------------");
		System.out.println("You have chosen Menu Info");
		do {
		System.out.println("Enter 1 for Viewing Menu");
		System.out.println("Enter 2 for Adding new items to the menu");
		System.out.println("Enter 3 for Removing an item from the menu");
		System.out.println("Enter 4 for customizing an existing item on the menu");
		int ch=in.nextInt();
		switch(ch)
		{
		case 1:
			view_menu();
			break;
		case 2:
			add_menu();
			break;
		case 3:
			remove_menu();
			break;
		case 4:
			custom_menu();
			break;
			default:
				System.out.println("Sorry your request cannot be served as there is no such option");
				
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Do you want to do more operations on the menu?(Y/N)");
		chr=in.next().charAt(0);
		}while(chr=='Y'||chr=='y');
	}
	public static void view_menu()
	{
		System.out.println("=================================================");
		if(menu_num==0)
		{
			System.out.println("We are not serving anything right now");
		}
		else
		{
		System.out.println("We are serving the following items right now:-");
		System.out.println("Item \t\t Pricing");
		for(int i=1;i<=menu_num;i++)
		{
			System.out.println(i+"."+menu[i]+"\t\t"+pricing[i]);
		}
		}
		System.out.println("=================================================");
	}
	public static void add_menu()
	{
		System.out.println("=================================================");
		Scanner in=new Scanner(System.in);
		char chr;
		do {
		System.out.println("Enter the name of the new item");
		String newmenu=in.nextLine();
		System.out.println("Enter the pricing of the new item");
		int newprice=in.nextInt();
		menu_num++;
		menu[menu_num]=newmenu;
		pricing[menu_num]=newprice;
		System.out.println("Your item has been added successfully");
		System.out.println("=================================================");
		System.out.println("Do you want to add more items?(Y/N)");
		chr=in.next().charAt(0);
		in.nextLine();
		}while(chr=='Y'||chr=='y');
	}
	public static void remove_menu()
	{
		System.out.println("=================================================");
		Scanner in= new Scanner(System.in);
		if(menu_num==0)
		{
			System.out.println("We are not serving anything right now");
		}
		else
		{
		view_menu();
		System.out.println("Enter the number of the item that you want to remove");
		int value=in.nextInt();
		if(value>menu_num)
		{
			System.out.println("The item is not available in the menu");
		}
		else {
			
		
		for(int i=value;i<=menu_num;i++)
		{
			menu[i]=menu[i+1];
			pricing[i]=pricing[i+1];
			menu_num--;
		}
		System.out.println("The item has been successfully removed");
		}
		}
		System.out.println("=================================================");
	}
	public static void custom_menu()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("=================================================");
		int value;
		if(menu_num==0)
			System.out.println("We are not serving anything right now");
		else
		{
		view_menu();
		System.out.println("Enter the number of the item that you want to customize");
		value=in.nextInt();
		in.nextLine();
		if(value>menu_num)
			System.out.println("This item doesnt exist");
		else
		{
			System.out.println("Enter the name of the item ");
			menu[value]=in.nextLine();
			System.out.println("Enter the price of this item");
			pricing[value]=in.nextInt();
			System.out.println("The item has been successfully customized!!");
		}
		}
		System.out.println("=================================================");
	}
	public static void staff_info()
	{
		
		Scanner in=new Scanner(System.in);
		char chr,chrr;
		System.out.println("=================================================");
		System.out.println("You have chosen the option to customize staff info");
		do {
		System.out.println("Enter 1 for adding staff");
		System.out.println("Enter 2 for removing staff");
		System.out.println("Enter 3 for customizing existing staff information");
		System.out.println("Enter 4 for viewing staff");
		int ch=in.nextInt();
		in.nextLine();
		switch(ch)
		{
		case 1:
			do {
			staff_num++;
			System.out.println("You have chosen to add staff");
			System.out.println("Enter the name of the new staff");
			staff[staff_num]=in.nextLine();
			System.out.println("Enter the phone number of this new staff");
			phone[staff_num]=in.nextLine();
			System.out.println("Enter the working shift of this new staff");
			working_shift[staff_num]=in.nextLine();
			System.out.println("Enter the payroll of this new staff");
			payroll[staff_num]=in.nextInt();
			System.out.println("Thank You. Your new staff has been added");
			System.out.println("Do you want to add more staff?(Y/N)");
			chrr=in.next().charAt(0);
			in.nextLine();
			}while(chrr=='Y'||chrr=='y');
			break;
		case 2:
			if(staff_num==0)
				System.out.println("No staff available");
			else
			{
			System.out.println("You have chosen to remove staff");
			view_staff();
			System.out.println("Enter the number of the staff that you want to remove");
			int n=in.nextInt();
			if(n>staff_num)
				System.out.println("Wrong number");
			else
			{
				System.out.println("This staff is being removed:- "+staff[n]);
			for(int i=n;i<=staff_num;i++)
			{
				
				staff[i]=staff[i+1];
				phone[i]=phone[i+1];
				working_shift[i]=working_shift[i+1];
				payroll[i]=payroll[i+1];
				
			}
			staff_num--;
			System.out.println("The staff has been removed");
			view_staff();
			}
			}
			break;
		case 3:
			if(staff_num==0)
				System.out.println("No staff available");
			else
			{
			
			System.out.println("You have chosen to customize staff info");
			view_staff();
			System.out.println("Enter the number of the staff that you want to customize");
			int s=in.nextInt();
			if(s>staff_num)
				System.out.println("Wrong number");
			else
			{
				System.out.println("Staff name:-"+staff[s]);
				System.out.println("Enter 1 for changing name of this staff");
				System.out.println("Enter 2 for changing phone number of this staff");
				System.out.println("Enter 3 for changing working shift of this staff");
				System.out.println("Enter 4 for changing payroll");
				System.out.println("Enter your choice");
				int chh=in.nextInt();
				in.nextLine();
				switch(chh)
				{
				case 1:
					System.out.println("Enter the new name");
					staff[s]=in.nextLine();
					System.out.println("The name has been updated");
					break;
				case 2:
					System.out.println("Enter the new phone number");
					phone[s]=in.nextLine();
					break;
				case 3:
					System.out.println("Enter the new working shift");
					working_shift[s]=in.nextLine();
					break;
				case 4:
					System.out.println("Enter the new payroll");
					payroll[s]=in.nextInt();
					break;
					default:
						System.out.println("Wrong Choice");
				}
			}
			}
			break;
		case 4:
			System.out.println("You have chosen the option to view all staff");
			if(staff_num==0)
				System.out.println("There is no staff");
			else
			{
				view_staff();
				break;
			}
			break;
			default:
				System.out.println("Wrong Choice");
		}
		System.out.println("=================================================");
		System.out.println("Do you want to do more actions on the staff module?(Y/N)");
		chr=in.next().charAt(0);
		}while(chr=='Y'||chr=='y');
	}
	public static void view_staff()
	{
		int i;
		System.out.println("\t  Staff Name \t\t Phone Number \t\t Working Shift \t\t Payroll");
		for(i=1;i<=staff_num;i++)
		{
			System.out.println(i+". "+staff[i]+"\t\t"+phone[i]+" \t\t "+working_shift[i]+" \t\t "+payroll[i]);
		}
	}
	public static void take_order()
	{
		Scanner in=new Scanner(System.in);
		int chr;
		if(menu_num==0)
		{
			System.out.println("We dont have any items on the menu right now");
			System.out.println("Do you want to add items in the menu?(Y/N)");
			char c=in.next().charAt(0);
			if(c=='y'||c=='Y')
			{
				add_menu();
			}
			System.out.println("-------------------------------------------------");
		}
		else
		{
		System.out.println("===============Menu=================");
		System.out.println("Item \t\t Price");
		for(int i=1;i<=menu_num;i++)
		{
			System.out.println(i+". "+menu[i]+"\t\t"+pricing[i]);
		}
		do {
			System.out.println("Enter the number of the item to add one by one");
			int item=in.nextInt();
			if(item<0||item>menu_num)
			{
				System.out.println("No such item in the menu");
				break;
			}
			else {
			System.out.println("Enter the number of the servings that you would like to add");
			int servings=in.nextInt();
			System.out.println("You have chosen the item "+menu[item]+" and the number of servings is= "+servings);
			order[num_of_items]=menu[item];
			amount[num_of_items]=pricing[item]*servings;
			num_of_items++;
			System.out.println("Do you want to take more items as order?(Y/N)");
			chr=in.next().charAt(0);
			
		}
		}while(chr=='y'||chr=='Y');
		if(num_of_items!=0)
			invoicemaker();
		num_of_items=0;
		}
		
	}
	public static void invoicemaker()
	{
		char chr;
		Scanner in=new Scanner(System.in);
		System.out.println("Your order is as follows:-");
		for(int i=0;i<num_of_items;i++)
		{
			System.out.println(order[i]+" \t\t "+amount[i]);
			total=total+amount[i];
		}
		System.out.println("Do you want to create an invoice?(Y/N)");
		chr=in.next().charAt(0);
		if(chr=='Y'||chr=='y')
		{
			invoice();
		}
		System.out.println("=================================================");
	}
	public static void invoice()
	{
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\invoice.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			fw.write("=================="+store_name+"==================\n");
			fw.write("--------------------Invoice-----------------------\n");
			fw.write("Item \t\t\t\t\t Price");
			fw.write("\n");
			for(int i=0;i<num_of_items;i++)
			{
				
				fw.write(order[i]+"\t\t"+amount[i]);
				fw.write("\n");
			}
			fw.write("Total Amount= "+total);
			fw.write("\n");
			fw.write("==================================== ");
			fw.close();
			}catch (IOException e)
			{}
		System.out.println("The invoice has been generated");
		System.out.println("====================================");
	}
	
	public static void ender()
	{
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\menu items.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			for(int i=1;i<=menu_num;i++)
			{
				
				fw.write(menu[i]);
				fw.write("\n");
			}
			fw.close();
			}catch (IOException e)
			{}
		
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\menu pricing.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			for(int i=1;i<=menu_num;i++)
			{
				
				fw.write(Integer.toString(pricing[i]));
				fw.write("\n");
			}
			fw.close();
			}catch (IOException e)
			{}
		
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\storename.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			
				fw.write(store_name);
			
			fw.close();
			}catch (IOException e)
			{}
		
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\adminname.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			
				fw.write(admin_name);
			
			fw.close();
			}catch (IOException e)
			{}
		
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\store phno.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			
				fw.write(store_phno);
			
			fw.close();
			}catch (IOException e)
			{}
		
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\storetime.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			
				fw.write(store_time);
			
			fw.close();
			}catch (IOException e)
			{}
		
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\storeaddress.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			
				fw.write(address);
			
			fw.close();
			}catch (IOException e)
			{}
		
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\staffnames.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			for(int i=1;i<=staff_num;i++)
			{
				
				fw.write(staff[i]);
				fw.write("\n");
			}
			fw.close();
			}catch (IOException e)
			{}
		
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\staffphone.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			for(int i=1;i<=staff_num;i++)
			{
				
				fw.write(phone[i]);
				fw.write("\n");
			}
			fw.close();
			}catch (IOException e)
			{}
		
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\staffworkshift.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			for(int i=1;i<=staff_num;i++)
			{
				
				fw.write(working_shift[i]);
				fw.write("\n");
			}
			fw.close();
			}catch (IOException e)
			{}
		
		try {
			File fl=new File("C:\\Users\\pandi\\Desktop\\staffpayroll.txt");
			FileWriter  fw=new FileWriter(fl);
			fl.delete();
			for(int i=1;i<=staff_num;i++)
			{
				
				fw.write(Integer.toString(payroll[i]));
				fw.write("\n");
			}
			fw.close();
			}catch (IOException e)
			{}
		
	}
	
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		char chr;
		
		initialiser();
		
		do{
			
			System.out.println("=======================================");
			System.out.println("---------------Main Menu---------------");
			System.out.println("Select User:-");
			System.out.println("1. Admin ");
			System.out.println("2. Staff");
			System.out.println("=======================================");
		int ch=in.nextInt();
		in.nextLine();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the password");
			String password=in.nextLine();
			if(password.equals(admin_pass))
				admin();
			else
				System.out.println("Wrong Password!!!");
			break;
		case 2:
			System.out.println("Enter the password");
			String password1=in.nextLine();
			if(password1.equals(staff_pass))
				staff();
			else
				System.out.println("Wrong password!!!");
			break;
			default:
				System.out.println("Wrong Choice!!!!");
		}
		System.out.println("=================================================");
		System.out.println("Do you want to do more operations as Admin or Staff?(Y/N)");
		chr=in.next().charAt(0);
		System.out.println("-------------------------------------------------");
		}while(chr=='Y'||chr=='y');
		ender();
	}
	
}



