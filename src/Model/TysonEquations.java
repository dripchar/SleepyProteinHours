package Model;

public class TysonEquations implements Equations {

    private final double vm = 1.0;
    private final double  Pcrit = 0.1;
    private final double  km = 0.1;
    private final double vp = 0.5;
    private final double kp1 = 10.0;
    private final double kp3 = 0.1;
    private final double ka = 2000.0;
    private final double kd = 1.0;
    private final double Jp = 0.05;
    private final double kp2 = 0.03;
    private final double r = 2.0;
    private final double Keq = 200.0; //For use via the third equation



    @Override
    public double calculateMRNA(double M, double P2) {
        return (vm)/(1+Math.pow((P2 / Pcrit), 2)) - km*M;
    }

    @Override
    public double calculateMonomers(double M, double P1, double P2) {
        return vp*M - (kp1*P1)/(Jp + P1 + r*P2) - kp3*P1-2*ka*Math.pow(P1, 2)+2*kd*P2;
    }

    @Override
    public double calculateDimers(double M, double P1, double P2) {
        return ka*Math.pow(P1, 2)-kd*P2 - (kp2*P2)/(Jp + P1 + r*P2) - kp3*P2;
    }
}
