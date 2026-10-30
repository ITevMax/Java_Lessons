package practise;

public class SportAuto extends Auto {
    private double timeTo100;

    private SportAuto(String name, double price, AutoCategory category, double timeTo100) {
        super(name, price, category);
        this.timeTo100 = timeTo100;
    }

    public double getTimeTo100() {
        return timeTo100;
    }

    public void setTimeTo100(double timeTo100) {
        this.timeTo100 = timeTo100;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SportAuto{");
        sb.append("name='").append(super.getName()).append('\'');
        sb.append(", price=").append(super.getPrice());
        sb.append(", category=").append(super.getCategory());
        sb.append("timeTo100=").append(timeTo100);
        sb.append('}');
        return sb.toString();
    }


}