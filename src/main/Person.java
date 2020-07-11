package main;

import java.util.Date;


public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private Date dateOfBirth;
	
	private Integer age;
	
	private String uuid;
	
	private Integer personId;
	
	private String gender;
	
	private String phoneNumber;
	
	private String nin;
	
	public Person(Person person) {
		firstName = person.getAddress();
		lastName = person.getLastName();
		address = person.getAddress();
		dateOfBirth = person.getDateOfBirth();
		personId = person.getPersonId();
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}
	
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	/**
	 * @return the id
	 */
	public Integer getPersonId() {
		return personId;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	
	/**
	 * @return the sex
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * @param sex the sex to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * @return the nin
	 */
	public String getNin() {
		return nin;
	}
	
	/**
	 * @param nin the nin to set
	 */
	public void setNin(String nin) {
		this.nin = nin;
	}
	
	@Override
	public String toString() {
		return address;
		
	}
}
