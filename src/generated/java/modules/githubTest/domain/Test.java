package modules.githubTest.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.impl.domain.AbstractPersistentBean;

/**
 * Test
 * 
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
public class Test extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "githubTest";

	/** @hidden */
	public static final String DOCUMENT_NAME = "Test";

	/** @hidden */
	public static final String testPropertyName = "test";

	/**
	 * test
	 **/
	private Boolean test;

	@Override
	@XmlTransient
	public String getBizModule() {
		return Test.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return Test.DOCUMENT_NAME;
	}

	public static Test newInstance() {
		try {
			return CORE.getUser().getCustomer().getModule(MODULE_NAME).getDocument(CORE.getUser().getCustomer(), DOCUMENT_NAME).newInstance(CORE.getUser());
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new DomainException(e);
		}
	}

	@Override
	@XmlTransient
	public String getBizKey() {
		try {
			return org.skyve.util.Binder.formatMessage("Test", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof Test) && 
					this.getBizId().equals(((Test) o).getBizId()));
	}

	/**
	 * {@link #test} accessor.
	 * @return	The value.
	 **/
	public Boolean getTest() {
		return test;
	}

	/**
	 * {@link #test} mutator.
	 * @param test	The new value.
	 **/
	@XmlElement
	public void setTest(Boolean test) {
		preset(testPropertyName, test);
		this.test = test;
	}
}
