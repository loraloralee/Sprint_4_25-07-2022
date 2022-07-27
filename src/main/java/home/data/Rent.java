package home.data;

public class Rent {
    private String date;
    private String period;
    private String color;
    private String comment;

    public String getDate(){
        return date;
    }
    public String getPeriod(){
        return period;
    }
    public String getColor(){
        return color;
    }
    public String getComment(){
        return comment;
    }

    public Rent(String date, String period,String color,String comment) {
        this.date = date;
        this.period = period;
        this.color = color;
        this.comment = comment;
    }
}


