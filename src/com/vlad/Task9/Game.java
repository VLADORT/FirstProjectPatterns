package com.vlad.Task9;

class Game {
    private Originator originator = new Originator();
    private Caretaker caretaker = new Caretaker();


    private String position = new String("***\n***\n***\n");

    private int counter = 2;

     void makeMove(int pos) {
         originator.setState(position);
        caretaker.setMemento(originator.saveState());
        if (counter % 2 == 0) {
            position= position.substring(0,pos - 1)+ "X"+position.substring(pos);
        } else {
            position= position.substring(0,pos - 1)+ "O"+position.substring(pos);
        }
        counter++;
        originator.setState(position);
        System.out.println(position);
    }

    public void  backMove() {
        originator.restoreState(caretaker.getMemento());
        position=caretaker.getMemento().getState();
        System.out.println(originator.getState());
    }

}
