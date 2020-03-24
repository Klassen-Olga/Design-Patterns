package md.design.patterns.state;

public interface SearchMachineState {

	public void startSearchHandle();
	public void closeSearchHandle();
	public void crawlingHandle();
}

