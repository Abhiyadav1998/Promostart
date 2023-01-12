package com.zohocrmapp.services;

import java.util.List;

import com.zohocrmapp.entities.Contact;

public interface ContactServices {
	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);

}
