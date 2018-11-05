package com.example.mypc.aplikasimodul2kel37.ui.home;

import com.example.mypc.aplikasimodul2kel37.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);
}

//View ini digunakan untuk menghubungkan HomeActivity dengan HomePresenter