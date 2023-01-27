package uz.gita.quizapptest.contract.recordimpl;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Arrays;

import uz.gita.quizapptest.contract.Contract;

public class ModelRecord implements Contract.RecordModel {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private String FILE_NAMR = "GITA4";


    public ModelRecord(Context context) {
        sharedPreferences = context.getSharedPreferences(FILE_NAMR, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    @Override
    public int[] readRecord() {
        int[] n = new int[10];
        String s = sharedPreferences.getString("s", "");
        if (!s.equals("")) {
            String[] split = s.split("");
            for (int i = 0; i < split.length; i++) {
                int parseInt = Integer.parseInt(split[i]);
                n[i] = parseInt;
            }
            Arrays.sort(n);
        }
        return n;
    }
}
