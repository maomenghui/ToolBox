package file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileUtilsTest {

    static File file = new File("C:\\log\\a.txt");
    static File file2 = new File("C:\\log\\b.txt");

    @Test
    public void isExist() {
        System.out.println(FileUtils.isExist("", true));
    }

    @Test
    public void getFileName() {
        System.out.println(FileUtils.getFileName("文件.txt"));
    }

    @Test
    public void testGetFileName() {
        System.out.println(FileUtils.getFileName());
    }

    @Test
    public void testGetFileName1() {
        System.out.println(FileUtils.getFileName("文件.txt", "a", "b"));
    }

    @Test
    public void getFileSize() throws Exception {
        System.out.println(FileUtils.getFileSize(file));
    }

    @Test
    public void deleteAll() {
        System.out.println(FileUtils.isExist("", true));
    }

    @Test
    public void copy() throws IOException {
        FileUtils.copy(file, file2, true);
    }

    @Test
    public void getFileMD5() {
        System.out.println(FileUtils.getFileMD5(file));
    }

    @Test
    public void getFileSuffix() {
        System.out.println(FileUtils.getFileSuffix("text.txt"));
    }

    @Test
    public void renameDir() {
        System.out.println(FileUtils.renameDir("C:\\log\\", "C:\\log\\a.txt"));
    }
}