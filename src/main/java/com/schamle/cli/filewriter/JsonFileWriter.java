package com.schamle.cli.filewriter;

import com.schamle.cli.filereader.JsonFile;
import com.schamle.cli.filereader.SimpleJsonFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriter {
    private static final String OUTPUT_FOLDER = "/output/";

    public static void writeFile (SimpleJsonFile jsonFile) throws IOException {
        File newFile = new File(OUTPUT_FOLDER + jsonFile.getId() + ".json");
        if (newFile.createNewFile()){
            System.out.println("File created: " + newFile.getName());
        } else {
            System.out.println("File already exists.");
        }

        FileWriter fileWriter = new FileWriter(newFile);
        fileWriter.write ()
    }
}
