package md.design.patterns.adapter;

public class AdapterRegEx implements IAdapterRegEx {
	ClientCheck adaptee;

	public AdapterRegEx(ClientCheck adaptee){
		this.adaptee=adaptee;
	}
	public boolean checkName(String name){
		return adaptee.namenameCheck(name);
	}
}
