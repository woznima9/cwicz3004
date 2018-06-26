package builder;

public class Moto {
    private String formName;
    private String formDate;
    private int formID;
    private int legalDateProceed;
    private double formPrice;

    public Moto(String formName, String formDate, int formID, int legalDateProceed, double formPrice) {
        this.formName = formName;
        this.formDate = formDate;
        this.formID = formID;
        this.legalDateProceed = legalDateProceed;
        this.formPrice = formPrice;
    }

    public static class MotoBuilder {
        private String formName;
        private String formDate;
        private int formID;
        private int legalDateProceed;
        private double formPrice;

        public static MotoBuilder builder() {
            return new MotoBuilder();
        }

        public MotoBuilder formName(String formName) {
            this.formName = formName;
            return this;
        }

        public MotoBuilder formDate(String formDate) {
            this.formDate = formDate;
            return this;
        }

        public MotoBuilder formID(int formID) {
            this.formID = formID;
            return this;
        }

        public MotoBuilder legalDateProceed(int legalDateProceed) {
            this.legalDateProceed = legalDateProceed;
            return this;
        }

        public MotoBuilder formPrice(double formPrice) {
            this.formPrice = formPrice;
            return this;
        }

        public Moto build() {

            return new Moto(formName, formDate, formID, legalDateProceed, formPrice);
        }


        @Override
        public String toString() {
            return "MotoBuilder{" +
                    "formName='" + formName + '\'' +
                    ", formDate='" + formDate + '\'' +
                    ", formID=" + formID +
                    ", legalDateProceed=" + legalDateProceed +
                    ", formPrice=" + formPrice +
                    '}';
        }
    }


}
