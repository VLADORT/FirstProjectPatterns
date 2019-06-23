package com.vlad.Task7;

public interface State {
    void next(Application app);
    void prev(Application app);
    void check();


}
