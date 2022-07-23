package ex01.ImagesToChar.src.java.edu.school21.printer.app;

import ex01.ImagesToChar.src.java.edu.school21.printer.logic.ConverterToArray;

public class Program {
    public static void main(String[] args) {
        if (args.length == 2 && args[0].length() == 1 && args[1].length() == 1){
            ConverterToArray converterToArray = new ConverterToArray("target/resources/it.bmp", args[0].toCharArray()[0], args[1].toCharArray()[0]);
            char[][] arr = converterToArray.toArray();
            for (int i = 0; i < arr[0].length; i++){
                for (char[] o: arr){
                    System.out.print(o[i]);
                }
                System.out.println();
            }
        }
        else{
            System.err.println("Arguments are non-valid");
            System.exit(1);
        }
    }
}
