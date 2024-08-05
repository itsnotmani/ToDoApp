package com.example.todoapp;

public interface BasePresenter<T extends BaseView> {
    void onAttach(T view);

    void onDetach();
}
