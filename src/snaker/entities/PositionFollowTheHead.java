package snaker.entities;

public class PositionFollowTheHead extends Position{
	
	private int qtdExecute;
	
	public PositionFollowTheHead(Position position) {
		super(position.getLine(), position.getColumn());
		this.qtdExecute = 0;
	}

	public int getQtdExecute() {
		return qtdExecute;
	}

	public void execute() {
		qtdExecute++;
	}
	
	

}
