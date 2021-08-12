package modules.githubTest.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class TestTest extends AbstractDomainTest<Test> {

	@Override
	protected Test getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Test.MODULE_NAME, Test.DOCUMENT_NAME);
	}
}