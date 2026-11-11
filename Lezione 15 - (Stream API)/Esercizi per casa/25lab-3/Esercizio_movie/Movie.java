class Movie 
{
    private String title;
    private String director;
    private String genre;
    private int year;
    private int duration; // in minuti

    public Movie(String title, String director, String genre, int year, int duration) 
    {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
    }

    public String getTitle() 
    { 
        return title; 
    }
    
    public String getDirector() 
    {
        return director; 
    }
    
    public String getGenre() 
    { 
        return genre; 
    }
    
    public int getYear() 
    { 
        return year; 
    }
    
    public int getDuration() 
    { 
        return duration; 
    }

    @Override
    public String toString() 
    {
        return String.format("%s (%d) - %s - %s - %d min", title, year, director, genre, duration);
    }
}