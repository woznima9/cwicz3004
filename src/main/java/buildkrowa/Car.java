package buildkrowa;

public class Car {
    private String company;

    private int year;


    public Car(String company, int year) {
        this.company = company;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", year=" + year +
                '}';
    }

    public static class CarBuilder {

        private String company;

        private int year;

        public static CarBuilder builder() {
            return new CarBuilder();
        }



        public CarBuilder company(String company) {
            this.company = company;
            return this;
        }




        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(company, year);
        }


    }


}
