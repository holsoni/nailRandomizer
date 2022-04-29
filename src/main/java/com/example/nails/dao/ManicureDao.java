package com.example.nails.dao;

import com.example.nails.data.FakeData;
import com.example.nails.model.Manicure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Repository
public class ManicureDao {
    Random random = new Random();

    @Autowired
    private FakeData fakeData;

    public ManicureDao(FakeData fakeData) {
        this.fakeData = fakeData;
    }

    public List<Manicure> getAll(){
        return fakeData.getManicures();
    }

    public List<Manicure> getAllByForm(String form){
        return fakeData.getManicures().stream().
                filter(manicure -> manicure.getForm().equals(form)).collect(Collectors.toList());
    }
    public List<Manicure> get3First(){
        List<Manicure> manicureList = new ArrayList<>();
        List<Manicure> oval = fakeData.getManicures().stream()
                .filter(manicure -> manicure.getForm().equals("Oval")).collect(Collectors.toList());
        List<Manicure> square = fakeData.getManicures().stream()
                .filter(manicure -> manicure.getForm().equals("Square")).collect(Collectors.toList());
        List<Manicure> balerina = fakeData.getManicures().stream()
                .filter(manicure -> manicure.getForm().equals("Balerina")).collect(Collectors.toList());

        int sizeOval = oval.size();
        int sizeSquare = square.size();
        int sizeBalerina = balerina.size();

        manicureList.add(oval.get(random.nextInt(sizeOval)));
        manicureList.add(square.get(random.nextInt(sizeSquare)));
        manicureList.add(balerina.get(random.nextInt(sizeBalerina)));
        return manicureList;
    }

    public List<Manicure> getAllByFormAndColor(String form, String color){
        return fakeData.getManicures().stream()
                .filter(manicure -> manicure.getForm().equals(form))
                .filter(manicure -> manicure.getColor().equals(color))
                .collect(Collectors.toList());
    }


    public List<Manicure> get3RandomByForm(String form){
        List<Manicure> byForm = fakeData.getManicures().stream().filter(manicure -> manicure.getForm().equals(form)).collect(Collectors.toList());
        List<Manicure> red = byForm.stream().filter(i ->i.getColor().equals("Red")).collect(Collectors.toList());
        List<Manicure> white = byForm.stream().filter(i ->i.getColor().equals("White")).collect(Collectors.toList());
        List<Manicure> black = byForm.stream().filter(i ->i.getColor().equals("Black")).collect(Collectors.toList());
        List<Manicure> random3ByForm = new ArrayList<>();


        Manicure manicure = null;
        manicure = red.get(random.nextInt(red.size()));
        random3ByForm.add(manicure);
        manicure = white.get(random.nextInt(white.size()));
        random3ByForm.add(manicure);
        manicure = black.get(random.nextInt(black.size()));
        random3ByForm.add(manicure);


       /* for (int i = 0; i <= 2; i++) {
            int listSize = byForm.size();
            int index = random.nextInt(listSize);

            Manicure manicure = null;
            while (manicure == null) {
                manicure = byForm.get(index);
            }

            random3ByForm.add(manicure);
            byForm.remove(index);
        }*/
        return random3ByForm;

    }

    public List<Manicure> get3RandomByColor(String form, String color){
        List<Manicure> byColor = fakeData.getManicures().stream().filter(manicure -> manicure.getColor().equals(color))
                .filter(manicure -> manicure.getForm().equals(form))
                .collect(Collectors.toList());
/*        List<Manicure> floral = byColor.stream().filter(i ->i.getDesign().equals("Floral")).collect(Collectors.toList());
        List<Manicure> paintings = byColor.stream().filter(i ->i.getDesign().equals("Paintings")).collect(Collectors.toList());
        List<Manicure> linear = byColor.stream().filter(i ->i.getDesign().equals("Linear")).collect(Collectors.toList());*/
        List<Manicure> random3ByColor = new ArrayList<>();


/*        Manicure manicure = null;
        manicure = floral.get(random.nextInt(floral.size()));
        random3ByColor.add(manicure);
        manicure = paintings.get(random.nextInt(paintings.size()));
        random3ByColor.add(manicure);
        manicure = linear.get(random.nextInt(linear.size()));
        random3ByColor.add(manicure);*/

        for (int i = 0; i <= 2; i++) {
            int listSize = byColor.size();
            int index = random.nextInt(listSize);
            Manicure manicure = null;
            while(manicure==null){
                manicure = byColor.get(index);

            }
            random3ByColor.add(manicure);
            byColor.remove(index);
        }
        return random3ByColor;
    }

    public List<Manicure> getRandom(String form, String color, String design){
        List<Manicure> byDesign = this.getAllByFormAndColor(form, color).stream()
                .filter(manicure -> manicure.getDesign().equals(design)).collect(Collectors.toList());
        List<Manicure> result = new ArrayList<>();

        int listSize = byDesign.size();
        int index = random.nextInt(listSize);
        result.add(byDesign.get(index));

        return result;
    }



}
