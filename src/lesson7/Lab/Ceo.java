package lesson7.Lab;

public class Ceo {
    private double countCeo;
    private double salaryCeo;
    private  double supportSalaryCeo;

    public Ceo(double countCeo, double salaryCeo, double supportSalaryCeo) {
        this.countCeo = countCeo;
        this.salaryCeo = salaryCeo;
        this.supportSalaryCeo = supportSalaryCeo;
    }

    public double getCountCeo() {
        return countCeo;
    }

    public void setCountCeo(double countCeo) {
        this.countCeo = countCeo;
    }

    public double getSalaryCeo() {
        return salaryCeo;
    }

    public void setSalaryCeo(double salaryCeo) {
        this.salaryCeo = salaryCeo;
    }

    public double getSupportSalaryCeo() {
        return supportSalaryCeo;
    }

    public void setSupportSalaryCeo(double supportSalaryCeo) {
        this.supportSalaryCeo = supportSalaryCeo;
    }
}
