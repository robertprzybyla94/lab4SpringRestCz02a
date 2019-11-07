package com.exampleapp.app;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NewStudent
{
    //@JsonCreator ("Name") final String name1;
  //  @JsonCreator ("Group") final String group1;
  //  @JsonCreator ("Number") final String number1;
    @JsonProperty ("name") final String name;
    @JsonProperty ("group")  final String group;
    @JsonProperty ("number")  final String number;

    public NewStudent (long id, String name, String group,String number)
    {
        this.name=name;
       // this.name2=name;
        this.group=group;
        //this.group2=group;
        this.number=number;
      //  this.number2=number;
    }
}
