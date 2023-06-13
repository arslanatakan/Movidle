package com.projedemo.projedemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileController {
    static String[] arrayMovie;
    static List<Entity > listMovie=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        String line="";
        String regex=";";

        BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\cagat\\OneDrive\\Masaüstü\\imdb_top_250.csv"));

        while ((line=reader.readLine())!=null){
            arrayMovie= line.split(regex);
        }
    }


}
