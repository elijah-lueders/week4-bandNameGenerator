package model;

import java.util.ArrayList;

public class BandNameGenerator {
	private String name, place, thing, adjective;
	private ArrayList<String> bandNames;

	public BandNameGenerator() {
		super();
	}

	public BandNameGenerator(String name, String place, String thing, String adjective) {
		super();
		setName(name);
		setPlace(place);
		setThing(thing);
		setAdjective(adjective);
		setBandNames();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = toTitleCase(name);
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = toTitleCase(place);
	}

	public String getThing() {
		return thing;
	}

	public void setThing(String thing) {
		this.thing = toTitleCase(thing);
	}

	public String getAdjective() {
		return adjective;
	}

	public void setAdjective(String adjective) {
		this.adjective = toTitleCase(adjective);
	}

	public ArrayList<String> getBandNames() {
		return bandNames;
	}

	public void setBandNames() {
		bandNames = new ArrayList<String>();
		String bandName;
		bandName = "The " + thing;
		this.bandNames.add(bandName);
		bandName = name + " and The " + thing;
		this.bandNames.add(bandName);
		bandName = name + " and The " + adjective + " " + thing;
		this.bandNames.add(bandName);
		bandName = adjective + " " + name;
		this.bandNames.add(bandName);
		bandName = adjective + " " + thing;
		this.bandNames.add(bandName);
		bandName = adjective + " " + place;
		this.bandNames.add(bandName);
		bandName = place + " " + thing;
		this.bandNames.add(bandName);
		bandName = adjective + " " + place + " " + thing;
		this.bandNames.add(bandName);
		bandName = name + "'s " + place;
		this.bandNames.add(bandName);
		bandName = name + "'s " + thing;
		this.bandNames.add(bandName);
		bandName = thing + " Go " + adjective;
		this.bandNames.add(bandName);
		bandName = thing + " of The " + adjective + " " + place;
		this.bandNames.add(bandName);
		bandName = name + " and The " + adjective + " " + place + " Band";
		this.bandNames.add(bandName);

	}

	public String toTitleCase(String str) {
		String result = "";
		if (str == null || str.isEmpty()) {
			// do nothing
		} else {
			boolean capChar = true;
			for (int i = 0; i < str.length(); i++) {
				if (capChar) {
					result += Character.toUpperCase(str.charAt(i));
					capChar = false;
				} else {
					result += Character.toLowerCase(str.charAt(i));
					if (str.charAt(i) == ' ') {
						capChar = true;
					}
				}
			}
		}
		return result;
	}

	public String formatBandNameList() {
		String result = "<ul>";
		for (String bandName : bandNames) {
			result += "<li>" + bandName + "</li>";
		}
		result += "</ul";
		return result;
	}

	@Override
	public String toString() {
		return "BandNameGenerator [name=" + name + ", place=" + place + ", thing=" + thing + ", adjective=" + adjective
				+ ", bandNames=" + bandNames + "]";
	}

}
