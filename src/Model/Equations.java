package Model;

public interface Equations {

    double calculateMRNA(double MRNA, double dimers);

    double calculateMonomers(double MRNA, double monomers, double dimers);

    double calculateDimers(double MRNA, double monomers, double dimers);

}
