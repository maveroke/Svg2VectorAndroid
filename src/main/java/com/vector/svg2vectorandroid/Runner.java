package com.vector.svg2vectorandroid;

import com.android.ide.common.vectordrawable.Svg2Vector;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;

public class Runner {
    public static void main(String args[]) throws IOException{
        if(args.length == 0){
            System.out.println(" Provide source directory as first arguement for svg files to be converted\n example: java -jar Svg2VectorAndroid-1.0.jar <SourceDirectoryPath> ");
            return;
        }
        String source = "";
        String target = "";

        if(args.length > 0)
        {
            source = args[0];
        }

        if(args.length > 1)
        {
            target = args[1];
        }

        if(!source.isEmpty() && !target.isEmpty()){
            if(source.endsWith(".svg")){
                File sourceFile = new File(source);
                File targetFile = new File(target);
                FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
                Svg2Vector.parseSvgToXml(sourceFile, fileOutputStream);
            } else {
                System.out.println("Skipping file as its not svg ");
            }
        }
    }
}
