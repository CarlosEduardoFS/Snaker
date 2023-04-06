package snaker.entities;

public class Snake {
	
	private Position position;
	private int size;
	
	public Snake(Position position) {
		this.position = position;
		this.size = 3;
	}

	public Position getPosition() {
		return position;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void moveLeft() {
		position.setColumn(position.getColumn()-1);
	}
	
	public void moveRight() {
		position.setColumn(position.getColumn()+1);
	}
	
	public void moveUp() {
		position.setColumn(position.getColumn()-1);
	}
	
	public void moveLow() {
		position.setColumn(position.getColumn()+1);
	}

	@Override
	public String toString() {
		return "Position=" + position + "; Size=" + size;
	}
	
	

}
