package com.myproj.versions;
// module-info.java - (insert one line description here)
// (C) Copyright 2022 Hewlett Packard Enterprise Development LP

/**
 * @author lamabam
 *
 */
public class TestVersion {

	public static void main(String[] args) {
		System.out.println("Test Versions");
		VersionsDiff vd = new VersionsDiff();
		System.out.println(vd.checkVersions("0.1", "1.1"));
		System.out.println(vd.checkVersions("1.2", "1.1"));
		System.out.println(vd.checkVersions("1.2.9.9.9.9", "1.2"));
		System.out.println(vd.checkVersions("1.2", "1.2.9.9.9.9"));
		System.out.println(vd.checkVersions("1.3.4", "1.10"));
		System.out.println(vd.checkVersions("1.31", "1."));
		System.out.println(vd.checkVersions("", ""));
	}
}