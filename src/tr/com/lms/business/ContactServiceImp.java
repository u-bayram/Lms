package tr.com.lms.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.lms.dao.ContactDao;
import tr.com.lms.model.Contact;

@Service
public class ContactServiceImp implements ContactService {

	@Autowired
	ContactDao contactDao;

	@Transactional
	public void addContact(Contact contact) {
		contactDao.addContact(contact);

	}

	@Transactional
	public List<Contact> listContact() {
		return contactDao.listContact();
	}

	@Transactional
	public void removeContact(Integer id) {
		contactDao.removeContact(id);
	}

}
