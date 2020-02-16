package com.schamle.cli.filereader;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class JsonSimpleInputFileReaderTest {

    @Test
    public void testIsValid() throws Exception{
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File shouldBeActiveFile = new File(classLoader.getResource("fa996dab-a290-4ede-1188-43919935fc5c.json").getFile());
        File shouldNotBeActiveFile = new File(classLoader.getResource("fa996dab-a290-4ede-1188-43919935fc5d.json").getFile());
        JsonInputFile shouldBeActive = JsonSimpleInputFileReader.readFile(shouldBeActiveFile);
        JsonInputFile shouldNotBeActive = JsonSimpleInputFileReader.readFile(shouldNotBeActiveFile);

        assertTrue(shouldBeActive.isValid());
        assertFalse(shouldNotBeActive.isValid());
    }
}