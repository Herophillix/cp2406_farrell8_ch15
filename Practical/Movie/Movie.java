package Movie;

public class Movie {
    private String title;
    private int year;
    private String cast;

    public Movie(String title, int year, String cast) {
        SetTitle(title);
        SetYear(year);
        SetCast(cast);
    }

    public String GetTitle() {
        return title;
    }

    public int GetYear() {
        return year;
    }

    public String GetCast() {
        return cast;
    }

    public void SetTitle(String title) {
        this.title = title;
    }

    public void SetYear(int year) {
        this.year = year;
    }

    public void SetCast(String cast) {
        this.cast = cast;
    }
}