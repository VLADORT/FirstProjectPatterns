package com.vlad.Task8;

public interface  Processor {


     void process(Transaction transaction);

     void  setNext(Processor processor);

}
