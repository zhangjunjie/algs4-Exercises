import java.io.File;
import java.util.*;
public class Chap1E1343 {

    public void walk( String path ) {
        Queue<File> dirs = new LinkedList<File>();
        File root = new File( path );
        
        dirs.add(root);
        
        while(!dirs.isEmpty()){
            for (File f : dirs.poll().listFiles()) {
                if (f.isDirectory()) {
                    StdOut.println("Dirs: " + f.getAbsoluteFile());
                    dirs.add(f);
                } else if (f.isFile()) {
                    StdOut.println("File: " + f.getAbsoluteFile());
                }
            }
        }
    }

    public static void main(String[] args) {
        Chap1E1343 fw = new Chap1E1343();
        fw.walk("./" );
    }
}