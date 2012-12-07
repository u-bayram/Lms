package tr.com.lms.dao;

import java.util.List;

import tr.com.lms.model.Contact;


public interface ContactDao {
	public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}
