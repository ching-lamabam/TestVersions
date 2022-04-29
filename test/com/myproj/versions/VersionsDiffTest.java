// VersionsDiffTest.java - (insert one line description here)
// (C) Copyright 2022 Hewlett Packard Enterprise Development LP

package com.myproj.versions;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class VersionsDiffTest {

	VersionsDiff versionDiff;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		versionDiff = new VersionsDiff();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testcheckVersions() {
		int diff = versionDiff.checkVersions("", "");
		assertEquals(-1, diff);
		diff = versionDiff.checkVersions("1.2", "1.1");
		assertEquals(1, diff);
		diff = versionDiff.checkVersions("1.2.9.9.9.9", "1.2");
		assertEquals(1, diff);
		diff = versionDiff.checkVersions("1.31", "1.5");
		assertEquals(1, diff);
	}

}
