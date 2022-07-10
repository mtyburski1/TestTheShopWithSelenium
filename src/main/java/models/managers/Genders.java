package models.managers;

public enum Genders {
    MR("mr"),
    MS("ms");

    private String gender;

    Genders(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.gender;
    }
}
