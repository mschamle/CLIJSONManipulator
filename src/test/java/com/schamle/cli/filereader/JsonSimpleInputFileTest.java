package com.schamle.cli.filereader;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class JsonSimpleInputFileReaderTest {

    private static final String ACTIVE_FILE = "fa996dab-a290-4ede-1188-43919935fc5c";
    private static final String INACTIVE_FILE = "fa996dab-a290-4ede-1188-43919935fc5d";
    @Test
    public void testIsValid() throws Exception{
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File shouldBeActiveFile = new File(classLoader.getResource(ACTIVE_FILE +".json").getFile());
        File shouldNotBeActiveFile = new File(classLoader.getResource(INACTIVE_FILE + ".json").getFile());
        SimpleJsonFile shouldBeActive = JsonSimpleInputFileReader.readFile(shouldBeActiveFile);
        SimpleJsonFile shouldNotBeActive = JsonSimpleInputFileReader.readFile(shouldNotBeActiveFile);

        assertNotNull(shouldBeActive);
        assertEquals(ACTIVE_FILE, shouldBeActive.getId());
        assertTrue(shouldBeActive.isValid());

        assertNotNull(shouldNotBeActive);
        assertEquals(INACTIVE_FILE, shouldNotBeActive.getId());
        assertFalse(shouldNotBeActive.isValid());
    }
}