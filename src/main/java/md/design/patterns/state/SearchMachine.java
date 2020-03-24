package md.design.patterns.state;

/**
 * State changes--> behaviour changes(to avoid complex conditionals)
 * zb if the state is Closed and I try to open it, state becomes Opened
 */
public class SearchMachine {

	private SearchMachineState state;
	public SearchMachine(){
		this.state=new StateOfRest(this);
	}

	public void startSearch(){
		this.state.startSearchHandle();
	}
	public void closeSearch(){
		this.state.closeSearchHandle();
	}
	public void crawling(){
		this.state.crawlingHandle();
	}
	public void changeState(SearchMachineState state){
		this.state=state;
	}
	public SearchMachineState checkState(){
		return state;
	}
}
