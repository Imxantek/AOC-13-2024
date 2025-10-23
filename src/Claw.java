public class Claw {
    private int Ax;
    private int Ay;
    private int Bx;
    private int By;
    private int prizeX;
    private int prizeY;
    public Claw(int ax, int ay, int bx, int by, int prizeX, int prizeY) {
        this.Ax = ax;
        this.Ay = ay;
        this.Bx = bx;
        this.By = by;
        this.prizeX = prizeX;
        this.prizeY = prizeY;
    }
    public int nrOfTokens(){
        int A, B;
        int d0, d1, d2;
        d0=Ax*By-Bx*Ay;
        d1=prizeX*By-prizeY*Bx;
        d2=Ax*prizeY-Ay*prizeX;
//        System.out.println(d0 +" "+ d1 +" "+ d2);
        if(d0==0) return -1;
        if(d1%d0==0 && d2%d0==0) return (3*(d1/d0))+(d2/d0);
        return -1;
    }
    public void print(){
        System.out.println("Ax: "+Ax);
        System.out.println("Ay: "+Ay);
        System.out.println("Bx: "+Bx);
        System.out.println("By: "+By);
        System.out.println("PrizeX: "+prizeX);
        System.out.println("PrizeY: "+prizeY);
    }
}
