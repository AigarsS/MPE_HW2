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

import java.util.Arrays;
import java.util.List;

public class GroupMemberFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        final List<String> members = Arrays.asList(getResources().getStringArray(R.array.group_members));

        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());

        builder.setTitle("1st Group’s Dialog");
        builder.setMultiChoiceItems(
                R.array.group_members,
                null,
                (dialogInterface, which, isChecked) -> {
                    if(isChecked) {
                        showToast(members.get(which) + " checked");
                    } else {
                        showToast(members.get(which) + " unchecked");
                    }}
                );
        builder.setPositiveButton(R.string.ok, null);
        builder.setNegativeButton(R.string.close, (dialog, which) -> showToast("You closed dialog"));

        AlertDialog alertDialog = builder.create();

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