// VersionsDiff.java - (insert one line description here)
// (C) Copyright 2022 Hewlett Packard Enterprise Development LP

package com.myproj.versions;

/**
 * 
 */
public class VersionsDiff {

	/**
	 * check version1 is greater than version2
	 * 
	 * @param version1
	 * @param version2
	 * @return
	 */
	public int checkVersions(String version1, String version2) {
		if (version1 == null || version2 == null)
			return -1;
		if (version1.equals("") || version2.equals(""))
			return -1;
		String[] version1Arr = version1.split("\\.");
		String[] version2Arr = version2.split("\\.");
		int i = 0;
		int j = 0;
		while (i < version1Arr.length && j < version2Arr.length) {
			int curr1 = Integer.parseInt(version1Arr[i]);
			int curr2 = Integer.parseInt(version2Arr[j]);
			i++;
			j++;
			if (curr1 < curr2) {
				return -1;
			} else if (curr1 > curr2) {
				return 1;
			} else {
				continue;
			}
		}
		if (i != version1Arr.length) {
			return 1;
		}
		if (j != version2Arr.length) {
			return -1;
		}
		return 0;
	}

}
