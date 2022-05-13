package fawzi.linggo.enumtes;

public enum Level {
    STANDART("Standart Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String desccription;

    Level(String desccription){
        this.desccription = desccription;
    }

    public String getDesccription() {
        return desccription;
    }
}
