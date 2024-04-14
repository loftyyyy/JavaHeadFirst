package HeadFirstExercises;
public class MovieTestDrive{
    public static void main(String[] args){

        Movie movie = new Movie();

        movie.title = "Interstallar";
        movie.genre = "Science Fiction";
        movie.rating = 10;

        movie.playIt();

        System.out.println(movie.title);

    }
}
