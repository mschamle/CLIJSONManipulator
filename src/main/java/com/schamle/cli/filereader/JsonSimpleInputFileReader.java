package com.schamle.cli.filereader;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class JsonSimpleInputFileReader {

    private static final String BASE_FOLDER = "";
    private static final String INPUT_FOLDER = "/input";
    private static final String OUTPUT_FOLDER = "/output";

    public static SimpleJsonFile readFile(File fileToRead) throws IOException {
        JSONObject tomap = new JSONObject(new String(Files.readAllBytes(fileToRead.toPath()), StandardCharsets.UTF_8));
        return SimpleJsonFile.builder()
                .id(tomap.getString("id"))
                .status(tomap.getString("status"))
                .file(fileToRead).build();
    }
}
