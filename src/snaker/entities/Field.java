package snaker.entities;

public class Field {
	
	private int qtdLine;
	private int qtdColumn;
	private int[][] field;
	private Snake snake;
	private Food food;
	
	public Field(int qtdLine, int qtdColumn, Snake snake, Food food) {
		this.qtdLine = qtdLine;
		this.qtdColumn = qtdColumn;
		this.snake = snake;
		this.field = new int[qtdLine][qtdColumn];
		this.food = food;
	}

	public int getQtdLine() {
		return qtdLine;
	}

	public int getQtdColumn() {
		return qtdColumn;
	}

	public int[][] getField() {
		return field;
	}

	public Snake getSnake() {
		return snake;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	public void moveLeft() {
		if (snake.getPosition().getColumn()-1 < 0)
			throw new FieldException("Column position invalid!");
		
		snake.moveLeft();
	}
	
	public void moveRight() {
		if (snake.getPosition().getColumn()+1 > qtdColumn)
			throw new FieldException("Column position invalid!");
		
		snake.moveRight();
	}
	
	public void moveUp() {
		if (snake.getPosition().getLine()-1 < 0)
			throw new FieldException("Row position invalid!");
		
		snake.moveUp();
	}
	
	public void moveLow() {
		if (snake.getPosition().getLine()+1 > qtdLine)
			throw new FieldException("Row position invalid!");
		
		snake.moveLow();
	}

}
