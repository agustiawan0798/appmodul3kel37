package com.example.mypc.aplikasimodul2kel37.ui.detail;

import com.example.mypc.aplikasimodul2kel37.data.model.DataCar;
import java.util.List;

public interface DetailView {
    void showErrorCarById(String message);

    void showSuccessCarById(List<DataCar> dataCar);
}
