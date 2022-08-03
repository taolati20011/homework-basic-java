import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class CreateDirectory {
    public static void main(String args[]) {
        /*
        //        File dir = new File("C:/Users/Dung Pham/IdeaProjects/testJava/newDir");
        //
        //        System.out.println(dir.exists()); //output: false
        //        System.out.println(dir.getParentFile()); //output: C:/Users/Dung Pham/IdeaProjects/testJava
        //
        //        dir.mkdir();
        //
        //        File dir2 = new File("C:/Users/Dung Pham/IdeaProjects/testJava/parentDir/childDir");
        //        dir2.mkdirs();
        */

        Path dir = Paths.get("C:/Users/Dung Pham/IdeaProjects/testJava/newDir");
        try {
            if (!Files.exists(dir)) {
                Files.createDirectory(dir);
                System.out.println("Creation successful");
                /*
                Set<PosixFilePermission> permissions1 = PosixFilePermissions.fromString("rwxr--r--");
                FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(permissions1);
                Files.createDirectory(dir, fileAttributes);
                 */
            }
        } catch (IOException e) {
            System.out.println("Directory already exists.");
        }

        Path dirs = Paths.get("C:/Users/Dung Pham/IdeaProjects/testJava/newDir1/newDir2");
        try {
            if (!Files.exists(dirs)) {
                Files.createDirectories(dirs);
                System.out.println("Creation successful");
            }
        } catch (IOException e) {
            System.out.println("Directory already exists.");
        }
    }
}
