package tr.com.lms.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tr.com.lms.model.Contact;

@Repository
public class ContactDaoImp implements ContactDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addContact(Contact contact) {
		sessionFactory.getCurrentSession().save(contact);
	}

	@Override
	public List<Contact> listContact() {
		return sessionFactory.getCurrentSession().createQuery("from Contact")
				.list();
	}

	@Override
	public void removeContact(Integer id) {
		Contact contact = (Contact) sessionFactory.getCurrentSession().load(
				Contact.class, id);
		if (null != contact) {
			sessionFactory.getCurrentSession().delete(contact);
		}
	}
}
