package Shapes;
public class Square {
    private int side;

    public void setside(int side) { //for set valua in attributes
        this.side = side;
    }

    public int getside (int side) {
        return this.side;
    }

    public int Area(int side){ //function Area Formula
        return (side*side);
    }

    public int Cirumferemce (int side){ //function Cirumferemce Formula
        return (4*side);
    }

}