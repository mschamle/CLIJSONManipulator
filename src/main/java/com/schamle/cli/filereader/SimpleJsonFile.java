package com.schamle.cli.filereader;

import lombok.Builder;
import lombok.Data;

import java.io.File;

@Data
@Builder
public class SimpleJsonFile implements JsonFile {
    String status;
    String id;

    File file;

    public boolean isValid() {
        return "ACTIVE".equals(status) ? true: false;
    }
}
