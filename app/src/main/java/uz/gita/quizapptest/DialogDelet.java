package uz.gita.quizapptest;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

public class DialogDelet extends AlertDialog {

    private OnButtomClickListener onButtomClickListener;

    public void setOnButtomClickListener(OnButtomClickListener onButtomClickListener) {
        this.onButtomClickListener = onButtomClickListener;
    }


    public boolean hasListener() {
        return onButtomClickListener != null;
    }

    protected DialogDelet(@NonNull Context context) {
        super(context);
    }

    private TextView ok;
    private TextView cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_exit);
        loadView();

        setCancelable(false);
        cancel.setOnClickListener(v -> {
            if (hasListener()) {
                onButtomClickListener.onClicCencel();
            }
        });

        ok.setOnClickListener(v -> {
            if (hasListener()) {
                onButtomClickListener.onClickOk();
            }
        });

    }

    private void loadView() {
        cancel = findViewById(R.id.cancel_btn);
        ok = findViewById(R.id.ok_btn);
    }

    interface OnButtomClickListener {
        void onClickOk();

        void onClicCencel();
    }
}
