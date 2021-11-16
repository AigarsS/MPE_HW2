package com.example.mpe_hw2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class GroupMemberFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(requireContext())
                .setMessage(getString(R.string.order_confirmation))
                .setPositiveButton(getString(R.string.ok), (dialog, which) -> {} )
                .create();
    }

    public static String TAG = "GroupMemberDialog";
}