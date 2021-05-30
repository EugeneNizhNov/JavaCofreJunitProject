

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double tax;
        if (amount <= 100000) {
            tax = amount * 0.9;
        } else tax = amount * 0.85;
        return tax;
    }
}
