

class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill incomeTaxType = new Bill(232002, new IncomeTaxType(), new TaxService());
        Bill vaTaxType = new Bill(232002, new VATaxType(), new TaxService());
        Bill progressiveTaxType = new Bill(232002, new ProgressiveTaxType(), new TaxService());
        Bill[] payments = new Bill[]{incomeTaxType, vaTaxType, progressiveTaxType
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}