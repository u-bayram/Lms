package tr.com.lms.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CONTANCT")
public class Contact {
	@Id
	@Column(name = "CONTACT_ID")
	@GeneratedValue(generator="CONTACT_ID_SEQ" , strategy=GenerationType.SEQUENCE)
	private Integer contactId;
	@Column
	private String contactContent;

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactContent() {
		return contactContent;
	}

	public void setContactContent(String contactContent) {
		this.contactContent = contactContent;
	}
}
