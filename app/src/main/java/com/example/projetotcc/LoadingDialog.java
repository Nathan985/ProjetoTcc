package com.example.projetotcc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;

public class LoadingDialog {
    private Activity activity;
    private AlertDialog dialog;

    LoadingDialog(Activity myActivity){
        activity = myActivity;
    }

    void StartActivityLogin(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.loading_item, null));

        builder.setCancelable(false);

        dialog = builder.create();
        dialog.show();
    }

    void DismissDialog(){
        dialog.dismiss();
    }
}