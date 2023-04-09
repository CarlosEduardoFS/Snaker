package snaker.entities;

import java.util.LinkedList;
import java.util.Queue;

public class Snake {
	
	private Position position;
	private int size;
	private Queue<PositionFollowTheHead> queue;
	
	public Snake(Position position) {
		this.position = position;
		this.size = 3;
		this.queue = new LinkedList<>();
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
		queue.add(new PositionFollowTheHead(position));
		position.setColumn(position.getColumn()-1);
		
	}
	
	public void moveRight() {
		queue.add(new PositionFollowTheHead(position));
		position.setColumn(position.getColumn()+1);
	}
	
	public void moveUp() {
		queue.add(new PositionFollowTheHead(position));
		position.setColumn(position.getColumn()-1);
	}
	
	public void moveLow() {
		queue.add(new PositionFollowTheHead(position));
		position.setColumn(position.getColumn()+1);
	}

	@Override
	public String toString() {
		return "Position=" + position + "; Size=" + size;
	}
	
	

}
