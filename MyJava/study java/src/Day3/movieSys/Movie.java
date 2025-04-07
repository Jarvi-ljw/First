package Day3.movieSys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String name;
    private double score;
    private String actor;
    private double price;

}
