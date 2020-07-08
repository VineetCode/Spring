package com.tour.california.Model;

public enum Region {
	Central_Coast("Central Coast"), Southern_California("Southern_California"), Northern_California(
			"Northern_California"), Varies("Varies");

	private String label;

	private Region(String label) {
		this.label = label;
	}// end of Constructor

	public static Region findByLabel(String byLabel) {
		for (Region r : Region.values()) {
			if (r.label.equalsIgnoreCase(byLabel))
				return r;
		} // end of for-loop
		return null;
	}// end of findByLabel() method
}
