package thrusdaylab_27april;
import jakarta.persistence.*; 

/*Create a class Theater to store different movies running in the theater 
and use Hibernate Annotations to store in database use MySQL*/

@Entity
@Table(name="moviesrunning_inform") 
public class Theater {
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	private int movieId;
    private String movieName;
    private String time;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Theater(int movieId, String movieName, String time) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Theater [movieId=" + movieId + ", movieName=" + movieName + ", time=" + time + "]";
	}
	

}
