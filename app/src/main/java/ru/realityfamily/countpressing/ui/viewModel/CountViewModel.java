package ru.realityfamily.countpressing.ui.viewModel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CountViewModel extends ViewModel {
    private int pressCount;
    private final MutableLiveData<Integer> observableContainer = new MutableLiveData<>();

    public MutableLiveData<Integer> getPressCountContainer() {
        return observableContainer;
    }

    public int getPressCountValue() {
        return pressCount;
    }

    public void increasePressCount() {
        pressCount++;
        observableContainer.setValue(pressCount);
        Log.d("CountViewModel_CountPressing", String.valueOf(pressCount));
    }
}
