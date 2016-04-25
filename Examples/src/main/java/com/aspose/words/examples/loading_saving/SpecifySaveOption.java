/* 
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Words. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.words.examples.loading_saving;

import com.aspose.words.Document;
import com.aspose.words.LoadOptions;
import com.aspose.words.examples.Utils;
import com.aspose.words.SaveFormat;
import com.aspose.words.*;
import  java.io.*;
public class SpecifySaveOption
{
    public static void main(String[] args) throws Exception
    {
        // ExStart:SpecifySaveOption
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SpecifySaveOption.class);
        String fileName = "TestFile RenderShape.docx";
        // Load the document.
        Document doc = new Document(dataDir + fileName);

        // This is the directory we want the exported images to be saved to.
        File imagesDir = new File(dataDir, "Images");

        // The folder specified needs to exist and should be empty.
        if(imagesDir.exists())
            imagesDir.delete();

        imagesDir.mkdir();

       // Set an option to export form fields as plain text, not as HTML input elements.
        HtmlSaveOptions options = new HtmlSaveOptions(SaveFormat.HTML);
        options.setExportTextInputFormFieldAsText(true);
        options.setImagesFolder(imagesDir.getPath());
        dataDir = dataDir + Utils.GetOutputFilePath(fileName);
        doc.save(dataDir, options);
        // ExEnd:SpecifySaveOption
        System.out.println("\nSave option specified successfully.\nFile saved at " + dataDir);
    }
}
