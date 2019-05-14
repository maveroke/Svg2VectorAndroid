package com.vector.svg2vectorandroid;

import java.nio.file.*;

/**
 * Created by ravi on 19/12/17.
 */
public class Runner {

    public static void main(String args[]){

        if(args.length == 0){
            System.out.println(" Provide source directory as first arguement for svg files to be converted\n example: java -jar Svg2VectorAndroid-1.0.jar <SourceDirectoryPath> ");
            return;
        }
        String sourceDirectory = "";
        String outputDirectory = "";


        if(args.length > 0)
        {
            sourceDirectory = args[0];
            System.out.println(sourceDirectory);
        }

        if(args.length > 1)
        {
            outputDirectory = args[1];
            System.out.println(outputDirectory);
        }

        if(!sourceDirectory.isEmpty() && !outputDirectory.isEmpty()){
            System.out.println("Got in multi");
            SvgFilesProcessor processor = new SvgFilesProcessor(sourceDirectory, outputDirectory);
            processor.process();
        }
        else if(!sourceDirectory.isEmpty() ) {
            System.out.println("Got in single");
            System.out.println(outputDirectory);
            SvgFilesProcessor processor = new SvgFilesProcessor(sourceDirectory);
            processor.process();
        }
    }
}
