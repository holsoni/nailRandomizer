package com.example.nails.data;

import com.example.nails.model.Manicure;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FakeData {
    private List<Manicure> manicures = new ArrayList<>(
            Arrays.asList(
                    new Manicure(UUID.randomUUID(),"Oval", "Red","Floral", "img/oval_red_floral.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","Floral", "img/oval_red_floral1.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","Floral", "img/oval_red_floral3.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","Floral", "img/oval_red_floral2.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "Red","Floral", "img/square_red_floral.jpg"),
                   new Manicure(UUID.randomUUID(),"Square", "Red","Floral", "img/square_red_floral1jpg.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "Red","Floral", "img/square_red_floral2.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "Red","Floral", "img/square_red_floral3.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "Red","Floral", "img/ballerina_red_floral.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "Red","Floral", "img/ballerina_red_floral1.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "Red","Floral", "img/ballerina_red_floral2.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "Red","Floral", "img/ballerina_red_floral3.jpg"),

                    new Manicure(UUID.randomUUID(),"Oval", "White","Linear", "img/oval_white_linear.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "White","Linear", "img/oval_white_linear1.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "White","Linear", "img/oval_white_linear2.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "White","Linear", "img/oval_white_linear3.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "White","Linear", "img/square_white_linear.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "White","Linear", "img/square_white_linear1.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "White","Linear", "img/square_white_linear2.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "White","Linear", "img/square_white_linear3.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "White","Linear", "img/ballerina_white_linear.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "White","Linear", "img/ballerina_white_linear1.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "White","Linear", "img/ballerina_white_linear2.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "White","Linear", "img/ballerina_white_linear3.jpg"),

                    new Manicure(UUID.randomUUID(),"Oval", "Black","Paintings", "img/oval_black_paintings.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "Black","Paintings", "img/oval_black_paintings1.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "Black","Paintings", "img/oval_black_paintings2.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "Black","Paintings", "img/oval_black_paintings3.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "Black","Paintings", "img/square_black_paintings1.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "Black","Paintings", "img/square_black_paintings2.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "Black","Paintings", "img/square_black_paintings3.jpg"),
                    new Manicure(UUID.randomUUID(),"Square", "Black","Paintings", "img/square_black_paintings.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","Paintings", "img/ballerina_black_paintings.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","Paintings", "img/ballerina_black_paintings1.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","Paintings", "img/ballerina_black_paintings2.jpg"),
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","Paintings", "img/ballerina_black_paintings3.jpg")

/*                    new Manicure(UUID.randomUUID(),"Oval", "Red","French", "img/oval_red_french.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","French", "img/oval_red_french1.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","French", "img/oval_red_french2.jpg"),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","French", "img/oval_red_french3.jpg")*/
/*                    new Manicure(UUID.randomUUID(),"Square", "Red","no", null),
                    new Manicure(UUID.randomUUID(),"Square", "Red","1", null),
                    new Manicure(UUID.randomUUID(),"Square", "Red","2", null),
                    new Manicure(UUID.randomUUID(),"Square", "Red","3", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "Red","no", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "Red","1", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "Red","2", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "Red","3", null),
                    new Manicure(UUID.randomUUID(),"Oval", "White","no", null),
                    new Manicure(UUID.randomUUID(),"Oval", "White","1", null),
                    new Manicure(UUID.randomUUID(),"Oval", "White","2", null),
                    new Manicure(UUID.randomUUID(),"Oval", "White","3", null),
                    new Manicure(UUID.randomUUID(),"Square", "White","no", null),
                    new Manicure(UUID.randomUUID(),"Square", "White","1", null),
                    new Manicure(UUID.randomUUID(),"Square", "White","2", null),
                    new Manicure(UUID.randomUUID(),"Square", "White","3", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "White","no", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "White","1", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "White","2", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "White","3", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Black","no", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Black","1", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Black","2", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Black","3", null),
                    new Manicure(UUID.randomUUID(),"Square", "Black","no", null),
                    new Manicure(UUID.randomUUID(),"Square", "Black","1", null),
                    new Manicure(UUID.randomUUID(),"Square", "Black","2", null),
                    new Manicure(UUID.randomUUID(),"Square", "Black","3", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","1", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","2", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","3", null),
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","no", null)*/));


    public List<Manicure> getManicures() {
        return manicures;
    }




}
