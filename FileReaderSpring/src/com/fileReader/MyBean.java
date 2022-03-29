package com.fileReader;

class MyBean {
    String firstName;
    String lastName;

    public MyBean() {
    	
    }
    public MyBean(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
  
    @Override
    public String toString() {
        return "MyBean [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
