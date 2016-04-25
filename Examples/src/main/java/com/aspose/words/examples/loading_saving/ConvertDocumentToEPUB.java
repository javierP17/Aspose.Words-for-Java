/* 
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Words. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.words.examples.loading_saving;

import com.aspose.words.Document;
import com.aspose.words.examples.Utils;
import com.aspose.words.*;
import java.nio.charset.Charset;

public class ConvertDocumentToEPUB
{
    public static void main(String[] args) throws Exception
    {
        // ExStart:ConvertDocumentToEPUB
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertDocumentToEPUB.class);

        // Open an existing document from disk.
        Document doc = new Document(dataDir + "Document.EpubConversion.doc");

        // Save the document in EPUB format.
        doc.save(dataDir + "Document.EpubConversion_out_.epub");
        // ExEnd:ConvertDocumentToEPUB
        System.out.println("Document converted to EPUB successfully.");

    }
    public static void ConvertDocumentToEPUBUsingSaveOptions() throws Exception
    {
        // ExStart:ConvertDocumentToEPUBUsingSaveOptions
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertDocumentToEPUB.class);
        // Open an existing document from disk.
        Document doc = new Document(dataDir + "Document.EpubConversion.doc");

        // Create a new instance of HtmlSaveOptions. This object allows us to set options that control
        // how the output document is saved.
        HtmlSaveOptions saveOptions = new HtmlSaveOptions();

        // Specify the desired encoding.
        saveOptions.setEncoding(Charset.forName("UTF-8"));

        // Specify at what elements to split the internal HTML at. This creates a new HTML within the EPUB
        // which allows you to limit the size of each HTML part. This is useful for readers which cannot read
        // HTML files greater than a certain size e.g 300kb.
                saveOptions.setDocumentSplitCriteria(DocumentSplitCriteria.HEADING_PARAGRAPH);

        // Specify that we want to export document properties.
                saveOptions.setExportDocumentProperties(true);

        // Specify that we want to save in EPUB format.
                saveOptions.setSaveFormat(SaveFormat.EPUB);

        // Export the document as an EPUB file.
        doc.save(dataDir + "Document.EpubConversion_out_.epub", saveOptions);
        // ExEnd:ConvertDocumentToEPUBUsingSaveOptions
        System.out.println("Document using save options converted to EPUB successfully.");

    }
}
