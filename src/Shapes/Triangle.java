package Shapes;

public class Triangle {

    private int base,sideA,SideB,SideC,Height;

    public void setvalue(int base,int sideA,int SideB,int SideC,int Height) {
        this.base = base;
        this.sideA = sideA;
        this.SideB = SideB;
        this.SideC = SideC;
        this.Height = Height;
    }

    public double TriangleArea (double base, double Height){
        return (0.5*base*Height);
    }

    public int Cirumferemce(int sideA, int sideB, int sideC){
        return (sideB+sideC+sideA);
    }

}