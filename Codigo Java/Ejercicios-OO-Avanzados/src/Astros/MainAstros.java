package Astros;

import java.util.ArrayList;
import java.util.List;

public class MainAstros {
    public static void main(String[] args) {

        List<Astro> misAstros = new ArrayList<>();

        misAstros.add(new Planeta(11111111.21455f,true,false));
        misAstros.add(new Planeta(99999999.21455f,false,true));
        misAstros.add(new Satelite(99999999.21455f,false,true));
    }
}