package day3homework;

public class Student extends User {
    private String firstName;
    private String lastName;
    private String password;
    
    
    
    
    public Student( ) {}
    
    
    
    public Student (String firstName ,String lastName , String password) {
    	this();
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.password = password;
    	
    	
    }



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	}

