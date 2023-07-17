// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.hasnat.proto.person;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hasnat.proto.person.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>.com.hasnat.proto.person.Address address = 3;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.com.hasnat.proto.person.Address address = 3;</code>
   * @return The address.
   */
  com.hasnat.proto.person.Address getAddress();
  /**
   * <code>.com.hasnat.proto.person.Address address = 3;</code>
   */
  com.hasnat.proto.person.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>.com.hasnat.proto.person.Car car = 4;</code>
   * @return Whether the car field is set.
   */
  boolean hasCar();
  /**
   * <code>.com.hasnat.proto.person.Car car = 4;</code>
   * @return The car.
   */
  com.hasnat.proto.person.Car getCar();
  /**
   * <code>.com.hasnat.proto.person.Car car = 4;</code>
   */
  com.hasnat.proto.person.CarOrBuilder getCarOrBuilder();
}
