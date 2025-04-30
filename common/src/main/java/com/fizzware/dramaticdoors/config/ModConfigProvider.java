package com.fizzware.dramaticdoors.config;

import java.util.ArrayList;
import java.util.List;

import oshi.util.tuples.Pair;

public class ModConfigProvider implements SimpleConfig.DefaultConfig
{

	private String configContents = "";

	public List<Pair<?, ?>> getConfigsList() {
		return configsList;
	}

	private final List<Pair<?, ?>> configsList = new ArrayList<>();

	public void addComment(String comment) {
		configContents += "#" + comment + "\n";
	}
	
	public void addCategory(String comment) {
		configContents += "[" + comment + "]\n";
	}

	public void addNewLine() {
		configContents += "\n";
	}
	
	public void addKeyValuePair(Pair<String, ?> keyValuePair, String comment) {
		configContents += "\t#" + comment + " | default: " + keyValuePair.getB() + "\n";
		configContents += "\t" + keyValuePair.getA() + " = " + keyValuePair.getB() + "\n";
		configsList.add(keyValuePair);
	}

	@Override
	public String get(String namespace) {
		return configContents;
	}
}
