// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.v2.storage.blob.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.xml.XmlReader;
import io.clientcore.core.serialization.xml.XmlSerializable;
import io.clientcore.core.serialization.xml.XmlToken;
import io.clientcore.core.serialization.xml.XmlWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * Blob tags.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class BlobTags implements XmlSerializable<BlobTags> {
    /*
     * The BlobTagSet property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BlobTag> blobTagSet;

    /**
     * Creates an instance of BlobTags class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobTags() {
    }

    /**
     * Get the blobTagSet property: The BlobTagSet property.
     * 
     * @return the blobTagSet value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BlobTag> getBlobTagSet() {
        return this.blobTagSet;
    }

    /**
     * Set the blobTagSet property: The BlobTagSet property.
     * 
     * @param blobTagSet the blobTagSet value to set.
     * @return the BlobTags object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobTags setBlobTagSet(List<BlobTag> blobTagSet) {
        this.blobTagSet = blobTagSet;
        return this;
    }

    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = rootElementName == null || rootElementName.isEmpty() ? "Tags" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        if (this.blobTagSet != null) {
            xmlWriter.writeStartElement("TagSet");
            for (BlobTag element : this.blobTagSet) {
                xmlWriter.writeXml(element, "Tag");
            }
            xmlWriter.writeEndElement();
        }
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of BlobTags from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of BlobTags if the XmlReader was pointing to an instance of it, or null if it was pointing to
     * XML null.
     * @throws XMLStreamException If an error occurs while reading the BlobTags.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static BlobTags fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of BlobTags from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of BlobTags if the XmlReader was pointing to an instance of it, or null if it was pointing to
     * XML null.
     * @throws XMLStreamException If an error occurs while reading the BlobTags.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static BlobTags fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = rootElementName == null || rootElementName.isEmpty() ? "Tags" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            BlobTags deserializedBlobTags = new BlobTags();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("TagSet".equals(elementName.getLocalPart())) {
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        elementName = reader.getElementName();
                        if ("Tag".equals(elementName.getLocalPart())) {
                            if (deserializedBlobTags.blobTagSet == null) {
                                deserializedBlobTags.blobTagSet = new ArrayList<>();
                            }
                            deserializedBlobTags.blobTagSet.add(BlobTag.fromXml(reader, "Tag"));
                        } else {
                            reader.skipElement();
                        }
                    }
                } else {
                    reader.skipElement();
                }
            }

            return deserializedBlobTags;
        });
    }
}
