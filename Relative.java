/*
Worked in a group - Sunil Ghadwal, Preetam Naik, Jeffy Elson, and Pritha Ghosal
*/

import java.util.ArrayList;
import java.util.List;

public class Relative {
	// ToDo:
	// - add class variables
	// - add constructor that takes a String as argument
	private String name;
	private Relative parent;
	private List<Relative> children;

	public Relative(String name) {
		this.name = name;
		this.children = new ArrayList<Relative>();
	}

	private void setParent(Relative parent) {
		this.parent = parent;
	}

	// --------------------------------------------------------------- //
	public String getName() {
		// ToDo: implement
		return this.name;
	}

	// --------------------------------------------------------------- //
	public boolean addChild(Relative child) {
		// ToDo: implement
		if (child == null) {
			return false;
		}
		if (this == child) {
			return false;
		}
		if (child.getParent() == null) {
			if (this.getRoot() == child) {
				return false;
			}
			child.setParent(this);
			this.children.add(child);
			return true;
		} else {
			return false;
		}
	}

	// --------------------------------------------------------------- //
	public Relative getParent() {
		// ToDo: implement
		return this.parent;
	}

	// --------------------------------------------------------------- //
	public List<Relative> getChildren() {
		// ToDo: implement
		return this.children;
	}

	// --------------------------------------------------------------- //
	public int getChildCount() {
		// ToDo: implement
		return this.children.size();
	}

	private Relative getRoot() {
		if (this.getParent() == null) {
			return this;
		} else {
			return this.getParent().getRoot();
		}
	}

	// --------------------------------------------------------------- //
	public static boolean areRelated(Relative one, Relative two) {
		// ToDo: implement
		return one.getRoot() == two.getRoot();
	}

	// --------------------------------------------------------------- //
	static int getRelationDegree(Relative one, Relative two) {
		// ToDo: implement

		if (one == null || two == null) {
			return -1;
		}

		if (!areRelated(one, two)) {
			return -1;
		}
		if (one == two) {
			return 0;
		}

		Relative root = one.getRoot();

		int levelOne = 0;
		int levelTwo = 0;
		Relative current = one;
		int degree = 0;

		while (true) {
			if (current == root) {
				break;
			}
			current = current.getParent();
			levelOne++;
		}
		current = two;
		while (true) {
			if (current == root) {
				break;
			}
			current = current.getParent();
			levelTwo++;
		}

		while (true) {
			if (one.getParent() == two.getParent()) {
				if (one != two) {
					degree = degree + 2;
				}
				break;
			}
			if (levelOne < levelTwo) {
				two = two.getParent();
				levelTwo--;
				degree++;
			} else if (levelOne > levelTwo) {
				one = one.getParent();
				levelOne--;
				degree++;
			} else {
				two = two.getParent();
				one = one.getParent();
				degree += 2;
			}
		}

		return degree;
	}

}
