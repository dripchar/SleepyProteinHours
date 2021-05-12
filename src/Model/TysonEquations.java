package Model;

public class TysonEquations implements Equations {

    private final double vm = 1.0;
    private final double  Pcrit = 0.1;
    private final double  km = 0.1;
    private final double vp = 0.5;
    private final double kp1 = 10.0;
    private final double kp3 = 0.1;
    private final double ka = 150;
    private final double kd = 1;
    private final double Jp = 0.05;
    private final double kp2 = 0.03;
    private double keq = 200.0;
    private final double r = 2.0;


    @Override
    public double calculateMRNA(double M, double P2) {
        return (vm)/(1+Math.pow((P2 / Pcrit), 2)) - km*M;
    }

    @Override
    public double calculateMonomers(double M, double P1, double P2) {
        double kp1prime = kp1 + kp2;
        return vp*M - (kp1prime *P1)/(Jp + P1 + r*P2) - kp3*P1-2*ka*Math.pow(P1, 2)+2*kd*P2;
    }

    @Override
    public double calculateDimers(double M, double P1, double P2) {
        return ka*Math.pow(P1, 2)-kd*P2 - (kp2*P2)/(Jp + P1 + r*P2) - kp3*P2;
    }

    public double calculate_q(double Pt){
        //For use via the third equation
        return 2.0/(1.0+Math.sqrt(1.0+8.0*keq*Pt));
    }

    public double dMdt(double M, double Pt, double q){
        return (vm/(1.0+(Math.pow(Pt*(1.0-q)/(2.0*Pcrit),2.0))) - km*M);
        //return vm/(1.0+(Math.pow(Pt*(1.0-q)/(2.0*Pcrit), 2.0)))-km*M;
    }

    public double dPtdt(double M, double Pt, double q){
        return (vp*M-(kp1*Pt*q+kp2*Pt)/(Jp+Pt) - kp3*Pt);
    }

    public double calculateP1(double Pt, double q){
        return (q*Pt);
    }

    public double calculateP2(double Pt, double q){ ;
        return (0.5*(1.0-q)*Pt);
    }

    public void setKeq(double k){
        this.keq += k;
    }

    public double getKeq(){
        return this.keq;
    }

}
