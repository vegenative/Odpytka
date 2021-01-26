package com.oxylane.odpytka;

import java.util.List;

public interface FirebaseLoadDone {
    void OnFirebaseLoadSuccess(List<Person> people);
    void OnFirebaseLoadFailed(String msg);
}
