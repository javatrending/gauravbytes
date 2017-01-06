/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.gauravbytes.avro;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface EmailSender {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"EmailSender\",\"namespace\":\"com.gauravbytes.avro\",\"types\":[{\"type\":\"record\",\"name\":\"EmailMessage\",\"fields\":[{\"name\":\"to\",\"type\":\"string\"},{\"name\":\"from\",\"type\":\"string\"},{\"name\":\"body\",\"type\":\"string\"}]}],\"messages\":{\"send\":{\"request\":[{\"name\":\"email\",\"type\":\"EmailMessage\"}],\"response\":\"string\"}}}");
  /**
   */
  java.lang.CharSequence send(com.gauravbytes.avro.EmailMessage email) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends EmailSender {
    public static final org.apache.avro.Protocol PROTOCOL = com.gauravbytes.avro.EmailSender.PROTOCOL;
    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void send(com.gauravbytes.avro.EmailMessage email, org.apache.avro.ipc.Callback<java.lang.CharSequence> callback) throws java.io.IOException;
  }
}