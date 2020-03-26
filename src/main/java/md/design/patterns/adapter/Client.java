package md.design.patterns.adapter;

/**
 * Converts one interface into another interface the client expects
 * Making 2 interfaces that aren't compatible compatible
 * Adapter is an interface not in sense of java. but in sense of contract between two things
 */
public class Client {

	private String name;

	private IAdapterRegEx adapterRegEx;

	public Client(String name, IAdapterRegEx adapter) {
		this.name = name;
		this.adapterRegEx=adapter;
	}

	public boolean checkName() {
		return adapterRegEx.checkName(this.name);
	}
}

