package com.example.todoapp.detail;

import com.example.todoapp.BasePresenter;
import com.example.todoapp.BaseView;
import com.example.todoapp.model.Task;

public interface TaskDetailContract {

    interface View extends BaseView {
        void showTask(Task task);

        void setDeleteButtonVisibility(boolean visible);

        void showError(String error);

        void returnResult(int resultCode, Task task);
    }

    interface Presenter extends BasePresenter<View> {
        void deleteTask();

        void saveChanges(int importance, String title);

    }
}
