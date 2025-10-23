public class Claw {
    private long Ax;
    private long Ay;
    private long Bx;
    private long By;
    private long prizeX;
    private long prizeY;
    public Claw(long ax, long ay, long bx, long by, long prizeX, long prizeY) {
        this.Ax = ax;
        this.Ay = ay;
        this.Bx = bx;
        this.By = by;
        this.prizeX = prizeX;
        this.prizeY = prizeY;
    }
    public long nrOfTokens(){
        long A, B;
        long d0, d1, d2;
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
