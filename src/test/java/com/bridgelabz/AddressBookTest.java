package com.bridgelabz;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class AddressBookTest {
	/*
	 * @Purpose : Testing code by using test case person details is added or not
	 */
	@Test

	public void givenPersonsDetails_WhenAdded_ShoulReturnTrue() {
		try {
			Contacts person1 = new Contacts("rutuja", "nandiwadekar", "ratnagiri", "maha", "416312", "985052535",
					"rutuja@gmail.com");
			Contacts person2 = new Contacts("rutwij", "nandiwadekar", "ratnagiri", "maha", "416312", "7264920645",
					"rutwij@gmail.com");
			AddressBookMain addressBookMain = new AddressBookMain();
			addressBookMain.addNewContact(person1);
			addressBookMain.addNewContact(person2);
			List<Contacts> result = addressBookMain.getPersonList();
			assertTrue(result.contains(person1));
			assertTrue(result.contains(person2));
		} catch (Exception e) {
			System.out.println("some problem occurred..");
		}
	}
}
