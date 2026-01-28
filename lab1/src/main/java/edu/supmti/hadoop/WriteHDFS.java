package edu.supmti.hadoop;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

public class WriteHDFS {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(conf);
        Path path = new Path(args[0]);
        if(!fs.exists(path)){
            FSDataOutputStream out = fs.create(path);
            out.writeUTF("Bonjour tout le monde !");
            out.writeUTF(args[1]);
            out.close();
        }
        fs.close();
    }
}

