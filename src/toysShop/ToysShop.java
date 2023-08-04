package toysShop;

import java.util.ArrayList;
import java.util.List;
import toy.Toy;

public class ToysShop {


    public List<Toy> toylist;

    public ToysShop() {

        toylist = new ArrayList<>();
    }

    // метод который будет возвращать названия уже добавленных игрушек
    public List<Toy> getToysList(Toy toy) {
        List toysname = new ArrayList<>();
        for (Toy item : toylist) {
            toysname.add(toy.getName());
        }
        return toysname;
    }

    // метод записи игрушки в лист(массив)
    public void addToy(Toy toy) {
        boolean flag = false;
        for (Toy item : toylist) {
            if (toy.getName().equals(item.getName())) {
                flag = true;
            }
            if (!flag){
                toylist.add(toy);
            }
        }




    }







}

