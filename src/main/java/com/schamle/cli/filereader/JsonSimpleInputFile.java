package com.schamle.cli.filereader;

import lombok.Builder;
import lombok.Data;

import java.io.File;

@Data
@Builder
public class JsonSimpleInputFile implements JsonInputFile {
    String status;

    File file;

    public boolean isValid() {
        return "ACTIVE".equals(status) ? true: false;
    }
}
