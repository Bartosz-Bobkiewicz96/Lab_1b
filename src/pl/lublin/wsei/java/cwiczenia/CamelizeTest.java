package pl.lublin.wsei.java.cwiczenia;
import org.apache.commons.lang3.StringUtils;

import pl.lublin.wsei.java.cwiczenia.myLib.StringFun;

public class CamelizeTest {

    public static void main ( String[] args){

        StringFun sf = new StringFun();

        String txt = "Zamiana Liter bartosz BOBKIEWICZ";

        System.out.print(StringFun.camelize(txt));
    }
}
