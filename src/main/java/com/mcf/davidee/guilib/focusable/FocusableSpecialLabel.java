/**
 * Complying with Gui Library's license, I have made the following changes
 * to this class:
 * - Fixed outdated imports, overrides, and method calls.
 */
package com.mcf.davidee.guilib.focusable;

import com.mcf.davidee.guilib.core.Widget;

/**
 * 
 * A FocusableLabel that is meant to display different text
 * than what it really means in the background.
 *
 */
public class FocusableSpecialLabel extends FocusableLabel {

	private String actualText;

	public FocusableSpecialLabel(String text, String actualText, Widget... tooltips) {
		super(text, tooltips);

		this.actualText = actualText;
	}

	public FocusableSpecialLabel(int x, int y, String text, String actualText, Widget... tooltips) {
		this(text, actualText, tooltips);

		setPosition(x,y);
	}

	public String getSpecialText() {
		return actualText;
	}

	public void setSpecialText(String str) {
		this.actualText = str;
	}

}
