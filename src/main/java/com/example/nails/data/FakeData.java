package com.example.nails.data;

import com.example.nails.model.Manicure;
import com.sun.imageio.plugins.jpeg.JPEG;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class FakeData {
    private List<Manicure> manicures = new ArrayList<>(
            Arrays.asList(
                    new Manicure(UUID.randomUUID(),"Oval", "Red","no", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","1", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","2", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","3", null),
                    new Manicure(UUID.randomUUID(),"Square", "Red","no", null),
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
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","no", null),

                    new Manicure(UUID.randomUUID(),"Oval", "Red","no", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","1", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","2", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","3", null),
                    new Manicure(UUID.randomUUID(),"Square", "Red","no", null),
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
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","no", null),

                    new Manicure(UUID.randomUUID(),"Oval", "Red","no", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","1", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","2", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","3", null),
                    new Manicure(UUID.randomUUID(),"Square", "Red","no", null),
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
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","no", null)
                    ,
                    new Manicure(UUID.randomUUID(),"Oval", "Red","no", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","1", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","2", null),
                    new Manicure(UUID.randomUUID(),"Oval", "Red","3", null),
                    new Manicure(UUID.randomUUID(),"Square", "Red","no", null),
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
                    new Manicure(UUID.randomUUID(),"Balerina", "Black","no", null)
                    ));

    public List<Manicure> getManicures() {
        return manicures;
    }



}
