public class BuddyInfo {
	String name;
	String address;
	String greeting = "";
	int phone;
	int age;
	public BuddyInfo(String name, String address, int phone, int age){
		this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
        
	}
	
	public BuddyInfo(BuddyInfo bi)
	{
		name = bi.getName();
		address = bi.getAddress();
		phone = bi.getPhone();
		age = bi.getAge();
	}
	
	public String toString(){
		String s = "Name:" + getName() + 
				"\nAddress:" + getAddress() +
				"\nPhone:" + getPhone();
		return s;	
	}
	
	public boolean equals(Object o){
		if(this == o) return true;
		else if(o instanceof BuddyInfo)
		{
			BuddyInfo buddy = (BuddyInfo) o;
			return name.equals(buddy.name) && 
					address.equals(buddy.address)
					&& (Integer.compare(phone,buddy.phone)==0);
		}
		return false;
	}
	
	public boolean over18()
	{
		if (age>18) return true;
		return false;
	}
	
	public String getGreeting()
	{
		return greeting;
	}
	
	public void setGreeting(String greeting)
	{
		this.greeting = greeting;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}