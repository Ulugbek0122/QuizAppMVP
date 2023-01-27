package uz.gita.quizapptest.contract.secondimpl;

import android.content.Context;
import android.content.SharedPreferences;

import uz.gita.quizapptest.contract.MenyuContract;

public class ModelSecondImpl implements MenyuContract.ModelSecond {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private String FILE_NAMR = "GITA4";

    public ModelSecondImpl(Context context) {
        sharedPreferences = context.getSharedPreferences(FILE_NAMR, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

}
