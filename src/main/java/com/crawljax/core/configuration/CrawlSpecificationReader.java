package com.crawljax.core.configuration;

import java.util.List;

import com.crawljax.condition.browserwaiter.WaitCondition;
import com.crawljax.condition.crawlcondition.CrawlCondition;
import com.crawljax.condition.invariant.Invariant;
import com.crawljax.oraclecomparator.OracleComparator;

/**
 * Reader class for crawlspecification. For internal use only
 * 
 * @author dannyroest@gmail.com (Danny Roest)
 * @version $Id$
 */
public class CrawlSpecificationReader implements IgnoreFrameChecker {

	private final CrawlSpecification crawlSpecification;

	/**
	 * @param crawlSpecification
	 *            The specification to wrap around.
	 */
	public CrawlSpecificationReader(CrawlSpecification crawlSpecification) {
		super();
		this.crawlSpecification = crawlSpecification;
	}

	/**
	 * @return the number of milliseconds to wait after reloading the url
	 */
	public int getWaitAfterReloadUrl() {
		return this.crawlSpecification.getWaitTimeAfterReloadUrl();
	}

	/**
	 * @return the number the number of milliseconds to wait after an event is fired
	 */
	public int getWaitAfterEvent() {
		return this.crawlSpecification.getWaitTimeAfterEvent();
	}

	/**
	 * @return the oracleComparators
	 */
	public List<OracleComparator> getOracleComparators() {
		return crawlSpecification.getOracleComparators();
	}

	/**
	 * @return the invariants
	 */
	public List<Invariant> getInvariants() {
		return crawlSpecification.getInvariants();
	}

	/**
	 * @return the waitConditions
	 */
	public List<WaitCondition> getWaitConditions() {
		return crawlSpecification.getWaitConditions();
	}

	/**
	 * @return the crawlConditions
	 */
	public List<CrawlCondition> getCrawlConditions() {
		return crawlSpecification.getCrawlConditions();
	}

	/**
	 * @return the depth level.
	 */
	public int getDepth() {
		return crawlSpecification.getDepth();
	}

	/**
	 * @return the URL of the site.
	 */
	public String getSiteUrl() {
		return crawlSpecification.getUrl();
	}

	/**
	 * @return true if each candidate element should be examined only once.
	 */
	public boolean getClickOnce() {
		return crawlSpecification.getClickOnce();
	}

	/**
	 * @return the maximum crawling time.
	 */
	public int getMaximumRunTime() {
		return crawlSpecification.getMaximumRuntime();
	}

	/**
	 * @return maximum number of states to be crawled.
	 */
	public int getMaxNumberOfStates() {

		return crawlSpecification.getMaximumStates();
	}

	/**
	 * @return true if random input should be generated for input fileds.
	 */
	public boolean getRandomInputInForms() {
		return crawlSpecification.getRandomInputInForms();
	}

	@Override
	public boolean isFrameIgnored(String iFrame) {
		return crawlSpecification.ignoredFrameIdentifiers().contains(iFrame);
	}
}
