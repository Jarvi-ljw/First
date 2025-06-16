package Day7.Junit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    private String name;
    private int age;

    public void eat(){
        System.out.println("狗在吃东西");
    }
}
