package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
	Scanner sc = new Scanner(System.in);
	// creation of arraylist
	ArrayList<Contacts> personDetails = new ArrayList<>();

	/*
	 * @Purpose : This method is used to Add person details in arraylist
	 * 
	 * @Param : contacts
	 */
	public void addNewContact(Contacts contacts) {
		personDetails.add(contacts);
	}

	public List<Contacts> getPersonList() {
		return personDetails;
	}

	// main
	public static void main(String[] args) {
		System.out.println("Welcom to Address Book Workshop...");
	}
}
