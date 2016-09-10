package ADCompiler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by josanggyeong on 2016. 9. 10..
 */

class SourceReader {


    SourceReader() {

    }

    private String inputFilePath() throws IOException {

        String filePath;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input source file path");
        filePath = scanner.nextLine();

        return filePath;
    }

    List<String> getSourceCode() throws IOException {

        String path = inputFilePath();

        List<String> sourceCode = new ArrayList<>();

        try {

            BufferedReader in = new BufferedReader(new FileReader(path));

            String tempString;

            while ((tempString = in.readLine()) != null) {
                sourceCode.add(tempString);
            }

            in.close();

        } catch (IOException e) {

            System.err.format("File read error : \n %s", e);
            System.exit(1);

        }
        return sourceCode;
    }

}