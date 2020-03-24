package md.design.patterns.state;

public class StateOfRest implements SearchMachineState {

	SearchMachine searchMachine;
	public  StateOfRest(SearchMachine searchMachine){
		this.searchMachine=searchMachine;
	}
	public void startSearchHandle(){
		this.searchMachine.changeState(new SearchingState(this.searchMachine));
	}
	public void closeSearchHandle(){
		this.searchMachine.changeState(new StateOfRest(this.searchMachine));
	}
	public void crawlingHandle(){
		this.searchMachine.changeState(new ResultShowingState(this.searchMachine));
	}
}
