package org.sw.lesson07;

import org.drools.compiler.compiler.DecisionTableFactory;
import org.drools.core.builder.conf.impl.DecisionTableConfigurationImpl;
import org.drools.core.io.impl.FileSystemResource;
import org.kie.internal.builder.DecisionTableConfiguration;

import java.io.File;
import java.net.URL;
import java.util.Objects;

public class ConvertXlsxToDrl {
    public static void main(String[] args) {

        DecisionTableConfiguration decisionTableConfiguration = new DecisionTableConfigurationImpl();

        FileSystemResource spreadsheetFile =
                new FileSystemResource(getFile());

        String generatedDrl = DecisionTableFactory.loadFromResource(spreadsheetFile, decisionTableConfiguration);

        System.out.println();
        System.out.println(" =================== GENERATED RULES =================== ");
        System.out.println();
        System.out.println(generatedDrl);
        System.out.println();
        System.out.println(" ========================== END ========================== ");
        System.out.println();
    }

    private static File getFile() {
        ClassLoader classLoader = ConvertXlsxToDrl.class.getClassLoader();
        URL resource = classLoader.getResource("org.sw/lesson07/ruleSpreadsheet.xls");
        return new File(Objects.requireNonNull(resource).getFile());
    }
}
