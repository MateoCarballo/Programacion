package Lombok;

import Lombok.Gato;

public class Main {


    public static void main(String[] args) {
        Gato gato  = new Gato("cac",1,1);
        gato.setName("COCO");
        System.out.println(gato.getName());
        System.out.println(gato);
    }

}
