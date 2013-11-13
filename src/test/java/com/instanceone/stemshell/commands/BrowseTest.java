package com.instanceone.stemshell.commands;

import static org.junit.Assert.*;

import org.junit.Test;

public class BrowseTest {

	@Test
	public void test() {
		Browse b = new Browse("brows");
		b.getOptions();
	}

}
