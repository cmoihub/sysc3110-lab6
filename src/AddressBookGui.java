import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class AddressBookGui extends JFrame implements ActionListener{

	public AddressBookGui() {
		JFrame menuFrame = new JFrame("Address Book");
		menuFrame.setSize(500,500);
		menuFrame.setVisible(true);
		menuFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar menu = new JMenuBar();
		menuFrame.setJMenuBar(menu);
		
		JMenu aBookMenu = new JMenu("AddressBook");
		menu.add(aBookMenu);
		JMenu buddyMenu = new JMenu("BuddyInfo");
		menu.add(buddyMenu);
		
		JMenuItem item;
				
		item = new JMenuItem("create");
		item.addActionListener(this);
		aBookMenu.add(item);
		item = new JMenuItem("save");
		item.addActionListener(this);
		aBookMenu.add(item);
		item = new JMenuItem("display");
		item.addActionListener(this);
		aBookMenu.add(item);
		item = new JMenuItem("add");
		item.addActionListener(this);
		buddyMenu.add(item);
		
		JTextArea textArea = new JTextArea();
	}
	
	public static void main(String args[]){
		new AddressBookGui();		
	}

	public void actionPerformed(ActionEvent e) {
		AddressBook ab=null;
		JTextArea textArea = new JTextArea();
		String command = e.getActionCommand();
		System.out.println(command);
		if (command == "create"){
			ab = new AddressBook();
		}
		
		if (command == "save") 
		{
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("newbook.txt"));
			}catch (IOException e2) {}
			try {
				bw.write(ab.getBuddyInfo());
			}catch (IOException e1) {}
			try {
				bw.close();
			} catch (IOException e1) {}
		}
		
		if (command == "display") 
		{
			 textArea.append(ab.getBuddyInfo());
		}
		
		if (command == "add")
		{
			Scanner scan = new Scanner(System.in);
			String name;
			System.out.println("Enter name");
			name = scan.next();
			String address;
			System.out.println("Enter address");
			address = scan.next();
			int phone;
			System.out.println("Enter phone number");
			phone = scan.nextInt();
			System.out.println("Enter age");
			int age = scan.nextInt();
			ab.addBuddy(new BuddyInfo(name,address,phone,age));
			scan.close();
		}
	}
}