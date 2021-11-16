package com.example.mpe_hw2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class GroupMemberFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog alertDialog = new AlertDialog.Builder(requireContext())
                .setMessage(R.string.order_confirmation)
                .setPositiveButton(R.string.ok, null)
                .setNegativeButton(R.string.close, (dialog, which) -> showToast("You closed dialog"))
                .create();

        alertDialog.setOnShowListener(dialog -> {
            ((AlertDialog) dialog)
                    .getButton(AlertDialog.BUTTON_POSITIVE)
                    .setOnClickListener(view -> showToast("You clicked OK"));
        });

        return alertDialog;
    }


    public static String TAG = "GroupMemberDialog";

    private void showToast(String text) {
        Context context = getContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}