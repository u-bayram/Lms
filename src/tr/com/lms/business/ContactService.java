package tr.com.lms.business;

import java.util.List;

import tr.com.lms.model.Contact;

public interface ContactService {
    
    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}